package dynamicprogramming;

import java.util.ArrayList;

/*
 * Write a function 'bestSum(targetSum, numbers)' that takes in a 
 * targetSum and an array of numbers as arguments.
 * 
 * The function should return an array containing the shortest
 * combination of numbers that add up to exactly the targetSum.
 * 
 * If there is a tie for the shortest combination, you may return any 
 * one of the shortest.
 * 
 * Brute force:
 * Time: O(n^m)
 * space: O(m^2) -> call stack and resultant array.
 * 
 * Optimized:
 * Time: O(n*m)
 * space: O(m^2)
 */

import java.util.HashMap;
import java.util.List;

public class BestSum {
	
	public static int[] bestSum(int arr[], int targetSum) {
		if(targetSum == 0) {
			return null;
		}
		
		List<Integer> result = bestSumCalculation(arr, targetSum, new HashMap<Integer,Integer>());
		if(result == null) {
			return null;
		}
		int arr1[] = result.stream().mapToInt(i->i).toArray();
		return arr1;
	}
	
	public static ArrayList<Integer> bestSumCalculation(int[] arr, int targetSum, HashMap<Integer,Integer> memo) {
		
		if(targetSum == 0) {
			return new ArrayList<>();
		}	
		
		if(targetSum < 0) {
			return null;
		}
		
		ArrayList<Integer> resultList = null;
		
		for(int i=0;i<arr.length;i++) {
			ArrayList<Integer> arr1 = bestSumCalculation(arr, targetSum - arr[i], memo);
			if(arr1!= null) {
				arr1.add(arr[i]);
				if(resultList == null || arr1.size() < resultList.size()) {
					resultList = arr1;
				}
			}
		}
		
		return resultList;
	}

	public static void main(String args[]) {
		// [3,4]
				int arr[] = bestSum(new int[] {5,3,4,7}, 7);
				if(arr == null) {
					System.out.println("No combination found");	
				} else {
					System.out.println("Combination : ");
					for(int val : arr) {
						System.out.println(val);
					}
				}
				
			    // [3,2,2]
			    arr = bestSum(new int[] {2,3}, 7);
				if(arr == null) {
					System.out.println("No combination found");	
				} else {
					System.out.println("Combination : ");
					for(int val : arr) {
						System.out.println(val);
					}
				}
				
				// [] - No combinations found
				arr = bestSum(new int[] {2,4}, 7);
				if(arr == null) {
					System.out.println("No combination found");	
				} else {
					System.out.println("Combination : ");
					for(int val : arr) {
						System.out.println(val);
					}
				}
				
				// [2,2,2,2]
				arr = bestSum(new int[] {2,3,5}, 8);
				if(arr == null) {
					System.out.println("No combination found");	
				} else {
					System.out.println("Combination : ");
					for(int val : arr) {
						System.out.println(val);
					}
				}
				
				// [] - No combinations found
				arr = bestSum(new int[] {7,14}, 300);
				if(arr == null) {
					System.out.println("No combination found");	
				} else {
					System.out.println("Combination : ");
					for(int val : arr) {
						System.out.println(val);
					}
				}
				
				// [5,3] 
				arr = bestSum(new int[] {1,4,5}, 8);
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
