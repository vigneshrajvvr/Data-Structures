package arrays;

public class DeterminantOfMatrix {

	static int determinantOfMatrix(int matrix[][], int n)
    {
       if(n == 1) {
            return matrix[0][0];
        }
        int det = 0;
        int sign = 1;
        int tempMatrix[][] = new int[n][n];
        for(int d = 0;d<n;d++) {
            getCofactors(matrix,tempMatrix,0,d,n);
            det += sign * matrix[0][d] * determinantOfMatrix(tempMatrix, n-1);
            sign *= -1;
        }
        return det;
    }
    
    private static void getCofactors(int[][] matrix, int[][] tempMatrix, int p, int q, int n) {
        int i=0;
        int j=0;
        for(int row =0;row<n;row++) {
            for(int col = 0;col<n;col++) {
                if(row != p && col != q) {
                    tempMatrix[i][j++] = matrix[row][col];
                    if(j == n-1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
	
	public static void main(String args[]) {
		int arr[][] = new int[][] {{1,0,2,-1},
								   {3,0,0,5}, 
								   {2,1,4,-3},
								   {1,0,5,0}};
		System.out.println(determinantOfMatrix(arr, 4));		
	}

}
