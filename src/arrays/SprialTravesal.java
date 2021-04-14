package arrays;

import java.util.ArrayList;

public class SprialTravesal {
	private static ArrayList<Integer> result;

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
		result = new ArrayList<>();
		if (matrix.length == 1) {
			for (int col = 0; col < matrix[0].length; col++) {
				result.add(matrix[0][col]);
			}
		} else if (matrix[0].length == 1) {
			for (int row = 0; row < matrix.length; row++) {
				result.add(matrix[row][0]);
			}
		} else {
			spirallyTraverseHelper(matrix);
		}
		return result;
	}

	private static void spirallyTraverseHelper(int matrix[][]) {
		int top = 0;
		int left = 0;
		int right = matrix[0].length - 1;
		int bottom = matrix.length - 1;
		while (right >= 0) {
			for (int col = left; col <= right; col++) {
				result.add(matrix[top][col]);
			}
			top++;
			for (int row = top; row <= bottom; row++) {
				result.add(matrix[row][right]);
			}
			right--;
			for (int col = right; col >= left; col--) {
				result.add(matrix[bottom][col]);
			}
			bottom--;
			for (int row = bottom; row >= top; row--) {
				result.add(matrix[row][left]);
			}
			left++;
		}
	}
	
	public static void main(String args[]) {
		int matrix[][] = {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}};
		spirallyTraverse(matrix, 0,0);
		System.out.println(result.size());
		for(int i : result) {
			System.out.println(i);
		}
	}
}
