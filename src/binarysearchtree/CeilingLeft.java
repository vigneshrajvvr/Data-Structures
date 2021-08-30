package binarysearchtree;

import java.util.TreeSet;

public class CeilingLeft {
	
	public static void ceiling(int arr[]) {
		System.out.println("Efficient approach : O(N * LogN)");
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(arr[0]);
		System.out.println("-1");
		for(int i = 1; i < arr.length; i++) {
			if(treeSet.ceiling(arr[i]) == null) {
				System.out.println("-1");
			} else {
				System.out.println(treeSet.ceiling(arr[i]));
			}
			treeSet.add(arr[i]);
		}
	}
	
	public static void naiveCeiling(int arr[]) {
		System.out.println("Naive approach : O(N^2)");
		System.out.println("-1");
		for(int i = 1; i < arr.length; i++) {
			int diff = Integer.MAX_VALUE;
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					diff = Math.min(diff, arr[j]);
				} 
			}
			if(diff == Integer.MAX_VALUE) {
				System.out.println("-1");
			} else {
				System.out.println(diff);
			}
		}
	}
	
	public static void main(String args[]) {
		int[] arr = new int[] {2, 8, 30, 15, 25, 12};
		naiveCeiling(arr);
		ceiling(arr);
	}
	
	
}
