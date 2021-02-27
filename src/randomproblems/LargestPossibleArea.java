package randomproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestPossibleArea {
	
	public static void largestArea(int N, int M, int[] H, int[] V) {
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		
		// Creation of horizontal bars
		for(int i=0;i<=N+1;i++) {
			s1.add(i);
		}
		
		// Creation of Vertical bars
		for(int i=0;i<=M+1;i++) {
			s2.add(i);
		}
		
		// Remove horizontal bars
		for(int i=0;i<H.length;i++) {
			s1.remove(H[i]);
		}
		
		// Remove vertical bars
		for(int i=0;i<V.length;i++) {
			s2.remove(H[i]);
		}
		
		List<Integer> l1 = new ArrayList<>(s1);
		List<Integer> l2 = new ArrayList<>(s2);
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		int maxHorizontal = 0;
		int previous = 0;
		for(int i=0;i<l1.size();i++) {
			maxHorizontal = Math.max(maxHorizontal, l1.get(i) - previous);
			previous = l1.get(i);
		}
		
		int maxVertical = 0;
		previous = 0;
		for(int i=0;i<l2.size();i++) {
			maxVertical = Math.max(maxVertical, l2.get(i) - previous);
			previous = l2.get(i);
		}
		
		System.out.println(maxHorizontal * maxVertical);
		
	}
	
	public static void main(String args[]) {
		// Given value of N & M
        int N = 3, M = 3;
 
        // Given arrays
        int[] H = { 2 };
        int[] V = { 2 };
 
        // Function call to find the largest
        // area when a series of horizontal &
        // vertical bars are removed
        largestArea(N, M, H, V);
        
        N = 3;
        M = 2;
        H = new int[]{1, 2, 3};
        V = new int[]{1, 2};
        largestArea(N, M, H, V);
	}

}
