package dynamicprogramming;

/*
 * Say that you are a traveler on a 2D grid. You begin in the top-left corner and your goal is to
 * travel to the bottom-right corner. You may only move down or right.
 * 
 * 
 * In how many ways you can travel to the goal on grid with dimensions m*n?
 * 
 * Write a function 'gridTraveler(m, n)' that calculates this.
 */

public class GridTraveler {
	
	public static double gridTraveler(int row, int col) {
		if(row == 1 && col == 1) {
			return 1;
		}
		if(row == 0 || col == 0) {
			return 0;
		}
		return gridTraveler(row-1, col) + gridTraveler(row, col-1);
	}
	
	public static double gridTravelerTabulation(int m, int n) {
		double tabulation[][] = new double[m+1][n+1];
        tabulation[1][1] = 1;
        for(int i=0;i<m+1;i++){
            for(int j=0; j<n+1;j++) {
                if(i+1 <= m) {
                    tabulation[i+1][j] += tabulation[i][j];
                }
                if(j+1 <= n) {
                    tabulation[i][j+1] += tabulation[i][j];
                }
            }
        } 
        
        return tabulation[m][n];
	}
	
	public static void main(String args[]) {
		//Memoization
		System.out.println("Memoization");
		System.out.println(gridTraveler(1,1));//1
		System.out.println(gridTraveler(2,3));//3
		System.out.println(gridTraveler(3,2));//3
		System.out.println(gridTraveler(3,3));//6
		System.out.println(gridTraveler(18,18));//2333606220
		
		//Tabulation
		System.out.println("Tabulation");	
		System.out.println(gridTravelerTabulation(1,1));//1
		System.out.println(gridTravelerTabulation(2,3));//3
		System.out.println(gridTravelerTabulation(3,2));//3
		System.out.println(gridTravelerTabulation(3,3));//6
		System.out.println(gridTravelerTabulation(18,18));//2333606220
		
	}
}
