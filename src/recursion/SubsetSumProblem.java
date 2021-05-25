package recursion;

import java.util.ArrayList;

public class SubsetSumProblem {
	
	private static int count;
	
	public static int subsetSum(int arr[], int sum) {
		count = 0;
		subset(arr, new ArrayList<>(), 0, sum);
		return count;
	}
	
	public static void subset(int arr[], ArrayList<Integer> tempList, int start, int sum) {
//		if(sum == tempSum) {
//				count++;
//		}
		if(sum == 0) {
			count++;
		}
		for(int i=start;i<arr.length;i++) {
			tempList.add(arr[i]);
			sum -= arr[i];
			subset(arr, tempList, i + 1, sum);
			tempList.remove(tempList.size() - 1);
			sum += arr[i];
		}
	}
	
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		System.out.println(subsetSum(new int[]{10,5,2,3,6},8));
		System.out.println(subsetSum(new int[] {10, 20, 15}, 0));
		System.out.println(subsetSum(new int[] {1, 2, 3}, 4));
		System.out.println(subsetSum(new int[] {10, 20, 15}, 37));
	}

}
