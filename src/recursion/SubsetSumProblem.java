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
	
	public static int subsetApproach1(int arr[], int sum, int start) {
		if(sum == 0) {
			return 1;
		}
		
		if(start >= arr.length) {
			return 0;
		}
		
		return subsetApproach1(arr, sum, start + 1) + subsetApproach1(arr, sum - arr[start], start + 1);		
	}
	
	public static void main(String args[]) {
		System.out.println(subsetSum(new int[]{10,5,2,3,6},8));    //2
		System.out.println(subsetSum(new int[] {10, 20, 15}, 0));  //1
		System.out.println(subsetSum(new int[] {1, 2, 3}, 4));     //1
		System.out.println(subsetSum(new int[] {10, 20, 15}, 37)); //0
		
		System.out.println("Approach1");
		System.out.println(subsetApproach1(new int[]{10,5,2,3,6},8,0));      //2
		System.out.println(subsetApproach1(new int[] {10, 20, 15}, 0, 0));   //1
		System.out.println(subsetApproach1(new int[] {1, 2, 3}, 4, 0));      //1
		System.out.println(subsetApproach1(new int[] {10, 20, 15}, 37, 0));  //0 
	}

}
