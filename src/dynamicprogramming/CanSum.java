package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Write a function 'canSum(targetSum, numbers)' that takes in a 
 * targeSum and an array of numbers as arguments.
 * 
 * The function should return a boolean indicating whether or not it is
 * possible to generate the targetSum using numbers from the array.
 * 
 * You may use an element of the array as many times as needed.
 * 
 * You may assume that all input numbers are non negative
 */

public class CanSum {
		
	// ouput:
	//	true
	//	true
	//	false
	//  true
	//  false

	
	public static void main(String args[]) {
		int arr[] = new int[] {2,3};
		System.out.println(canSumCall(arr,7));
		
		arr = new int[] {5,3,4,7};
		System.out.println(canSumCall(arr,7));
		
		arr = new int[] {2,4};
		System.out.println(canSumCall(arr,7));
		
		arr = new int[] {2,3,5};
		System.out.println(canSumCall(arr,8));
		
		arr = new int[] {7,14};
		System.out.println(canSumCall(arr,300));
	}
	
	public static boolean canSumCall(int[] arr, int target) {
		
		Map<Integer,Boolean> map = new HashMap<>();
		
		return canSumImplementation(arr,target, false, map);
	}
	
	public static boolean canSumImplementation(int[] arr, int difference, boolean result, Map<Integer, Boolean> map) {
		if(difference < 0) {
			return false;
		}
		
		if(difference == 0) {
			return true;
		}
		
		if(map.containsKey(difference)) {
			return map.get(difference);
		}
		
		for(int i=0;i<arr.length;i++) {
//			System.out.println(difference - arr[i]);
			result = result || canSumImplementation(arr, difference-arr[i], result, map);
		}
		
		map.put(difference, result);
				
		return result;
	}

}
