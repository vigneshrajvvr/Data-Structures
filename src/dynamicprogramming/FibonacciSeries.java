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
	
}
