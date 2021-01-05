package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function 'howSum(targetSum,numbers)' that takes in a 
 * targetSum and an array of numbers as arguments.
 * 
 * The function should return an array containing any combination of
 * elements that add up to exactly the targetSum. If there is no combination
 * that adds up to the targetSum, then return null.
 * 
 * If there are multiple combinations possible, you may return any
 * single one.
 */

public class howSum {
	
	static int[] howSum(int arr[], int targetSum) {
		
		if(targetSum == 0) {
			return null;
		}
		
		List<Integer> result = howSumCalculation(arr, targetSum);
		if(result == null) {
			return null;
		}
		int arr1[] = result.stream().mapToInt(i->i).toArray();
		return arr1;
	}
	
	static List<Integer> howSumCalculation(int[] arr, int targetSum) {
		if(targetSum == 0) {
			return new ArrayList<>();
		}
		
		if(targetSum < 0) {
			return null;
		}
		
		for(int i=0;i<arr.length;i++) { 
			List<Integer> remainderResult = howSumCalculation(arr, targetSum - arr[i]);
			if(remainderResult != null) {
				remainderResult.add(arr[i]);
				return remainderResult;
			}
		}				
		return null;
	}
	
	public static void main(String args[]) {
		int arr[] = howSum(new int[] {5,3,4,7}, 7);
		if(arr == null) {
			System.out.println("No pairs found");	
		} else {
			for(int val : arr) {
				System.out.println(val);
			}
		}
	}

}
