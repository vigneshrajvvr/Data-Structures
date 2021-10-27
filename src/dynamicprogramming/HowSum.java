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

/*
 * m = target sum
 * n = arr.length
 * 
 * 
 * Brute force
 * Time: O(n * m)
 * Space: O(m)
 * 
 * 
 * Optimized
 * Time: O(m * n)
 * Space: O(m * m) -> m keys * array of m value 
 */

public class HowSum {

	static int[] howSum(int arr[], int targetSum) {

		if (targetSum == 0) {
			return null;
		}

		List<Integer> result = howSumCalculation(arr, targetSum, new HashMap<>());
		if (result == null) {
			return null;
		}
		int arr1[] = result.stream().mapToInt(i -> i).toArray();
		return arr1;
	}

	static List<Integer> howSumCalculation(int[] arr, int targetSum, HashMap<Integer, List<Integer>> memo) {

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		if (targetSum == 0) {
			return new ArrayList<>();
		}

		if (targetSum < 0) {
			return null;
		}

		for (int i = 0; i < arr.length; i++) {
			List<Integer> remainderResult = howSumCalculation(arr, targetSum - arr[i], memo);
			if (remainderResult != null) {
				remainderResult.add(arr[i]);
				memo.put(targetSum, remainderResult);
				return remainderResult;
			}
		}

		memo.put(targetSum, null);
		return null;
	}

	public static ArrayList<Integer> howSumTabulation(int[] arr, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>(target + 1);
		for (int i = 0; i < target + 1; i++) {
			result.add(null);
		}

		result.set(0, new ArrayList<>());

		for (int i = 0; i < result.size(); i++) {
			if (result.get(i) != null) {
				for (int j = 0; j < arr.length; j++) {
					if (i + arr[j] <= target) {
						ArrayList<Integer> tempList1 = result.get(i + arr[j]);
						ArrayList<Integer> tempList2 = result.get(i);
						tempList1 = new ArrayList<>();
						tempList1.addAll(tempList2);
						tempList1.add(arr[j]);
						result.set(i + arr[j], tempList1);
					}
				}
			}
		}

		return result.get(target);
	}

	public static void main(String args[]) {

		// [3,4]
		int arr[] = howSum(new int[] { 5, 3, 4, 7 }, 7);
		if (arr == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Combination : ");
			for (int val : arr) {
				System.out.println(val);
			}
		}
		
		ArrayList<Integer> result = howSumTabulation(new int[] { 5, 3, 4, 7 }, 7);
		if(result == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Tabulation : ");
			for (int val : result) {
				System.out.println(val);
			}
		}

		// [3,2,2]
		arr = howSum(new int[] { 2, 3 }, 7);
		if (arr == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Combination : ");
			for (int val : arr) {
				System.out.println(val);
			}
		}
		
		result = howSumTabulation(new int[] { 2, 3 }, 7);
		if(result == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Tabulation : ");
			for (int val : result) {
				System.out.println(val);
			}
		}

		// [] - No combinations found
		arr = howSum(new int[] { 2, 4 }, 7);
		if (arr == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Combination : ");
			for (int val : arr) {
				System.out.println(val);
			}
		}
		
		result = howSumTabulation(new int[] { 2, 4 }, 7);
		if(result == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Tabulation : ");
			for (int val : result) {
				System.out.println(val);
			}
		}
		
		

		// [2,2,2,2]
		arr = howSum(new int[] { 2, 3, 5 }, 8);
		if (arr == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Combination : ");
			for (int val : arr) {
				System.out.println(val);
			}
		}
		
		result = howSumTabulation(new int[] { 2, 3, 5 }, 8);
		if(result == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Tabulation : ");
			for (int val : result) {
				System.out.println(val);
			}
		}

		// [] - No combinations found
		arr = howSum(new int[] { 7, 14 }, 300);
		if (arr == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Combination : ");
			for (int val : arr) {
				System.out.println(val);
			}
		}
		
		result = howSumTabulation(new int[] { 7, 14 }, 300);
		if(result == null) {
			System.out.println("No combination found");
		} else {
			System.out.println("Tabulation : ");
			for (int val : result) {
				System.out.println(val);
			}
		}
	}

}
