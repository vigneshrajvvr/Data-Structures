package multidimensional;

public class MutliArrayExample {

	public static void main(String args[]) {
		int[][] multiArray = {{1,2,3}, {4,5,6}};
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				System.out.print(multiArray[i][j] + " ");
			}
		}
		
		System.out.println();
		
		int[][] jaggeredArray = new int[3][];
		for(int i=0;i<jaggeredArray.length;i++) {
			jaggeredArray[i] = new int[i+1];
			for(int j=0;j<jaggeredArray[i].length;j++) {
				jaggeredArray[i][j] = i;
				System.out.print(jaggeredArray[i][j]);
			}
			System.out.println();
		}
		
	}
}
