package dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
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
		
		List<Integer> result = howSumCalculation(arr, targetSum, new HashMap<>());
		if(result == null) {
			return null;
		}
		int arr1[] = result.stream().mapToInt(i->i).toArray();
		return arr1;
	}
	
	static List<Integer> howSumCalculation(int[] arr, int targetSum, HashMap<Integer, List<Integer>> memo) {
		
		if(memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}
		
		if(targetSum == 0) {
			return new ArrayList<>();
		}
		
		if(targetSum < 0) {
			return null;
		}
		
		for(int i=0;i<arr.length;i++) { 
			List<Integer> remainderResult = howSumCalculation(arr, targetSum - arr[i], memo);
			if(remainderResult != null) {
				remainderResult.add(arr[i]);
				memo.put(targetSum, remainderResult);
				return remainderResult;
			}
		}		
		
		memo.put(targetSum, null);
		return null;
	}
	
	public static void main(String args[]) {
		// [3,4]
		int arr[] = howSum(new int[] {5,3,4,7}, 7);
		if(arr == null) {
			System.out.println("No combination found");	
		} else {
			System.out.println("Combination : ");
			for(int val : arr) {
				System.out.println(val);
			}
		}
		
	    // [3,2,2]
	    arr = howSum(new int[] {2,3}, 7);
		if(arr == null) {
			System.out.println("No combination found");	
		} else {
			System.out.println("Combination : ");
			for(int val : arr) {
				System.out.println(val);
			}
		}
		
		// [] - No combinations found
		arr = howSum(new int[] {2,4}, 7);
		if(arr == null) {
			System.out.println("No combination found");	
		} else {
			System.out.println("Combination : ");
			for(int val : arr) {
				System.out.println(val);
			}
		}
		
		// [2,2,2,2]
		arr = howSum(new int[] {2,3,5}, 8);
		if(arr == null) {
			System.out.println("No combination found");	
		} else {
			System.out.println("Combination : ");
			for(int val : arr) {
				System.out.println(val);
			}
		}
		
		// [] - No combinations found
		arr = howSum(new int[] {7,14}, 300);
		if(arr == null) {
			System.out.println("No combination found");	
		} else {
			System.out.println("Combination : ");
			for(int val : arr) {
				System.out.println(val);
			}
		}
	}

}
