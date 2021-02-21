package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
	
	private static Map<Integer, Integer> valuesMap = new HashMap<>();
	
	public static void main(String args[]) {
		
		long start1 = System.currentTimeMillis();
		System.out.println(fibRecursion(40));
		long end1 = System.currentTimeMillis();
		
		System.out.println("Time take : " + (end1 - start1) + " ms");
		
		long start2 = System.currentTimeMillis();
		System.out.println(fibDynamic(40));
		long end2 = System.currentTimeMillis();
		
		System.out.println("Time take : " + (end2 - start2) + " ms");
		
		System.out.println(fibTabulation(6));//8
		System.out.println(fibTabulation(7));//13
		System.out.println(fibTabulation(8));//21
		System.out.println(fibTabulation(50));//12586269025
	
	}

	// Recursive solution
	public static int fibRecursion(int n) {
		
		if(n <= 2) {
			return 1;
		}
		
		return fibRecursion(n-1) + fibRecursion(n-2);
	}
	
	public static int fibDynamic(int n) {
		
		if(n <= 2) {
			return 1;
		}
		
		if(valuesMap.containsKey(n)) {
			return valuesMap.get(n);
		}
		
		int result = fibRecursion(n-1) + fibRecursion(n-2);
		valuesMap.put(n, result);
		
		return result;		
	}
	
	// Dynamic programming - Tabulation method
	public static long fibTabulation(int n) {
		if(n <= 2) {
			return 1;
		}
		long arr[] = new long[n+1];
		arr[1] = 1;
		
		int i=2;
		while(i <= n) {
			arr[i] += arr[i-2];
			arr[i-1] += arr[i-2];
			i++;
		}
		
		return arr[n] + arr[n-1];
	}
	
}
