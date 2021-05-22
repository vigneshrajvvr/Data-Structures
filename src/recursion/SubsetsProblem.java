package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsProblem {
	
	
	// Time complexity: O(2 ^ n)
	// Space complexity: O(L) where L is the length of the string
	public static void subset(String s, String current, int i) {
		if(i >= s.length()) {
			System.out.println(current);
			return;
		}
		subset(s, current, i+1);
		subset(s, current + Character.toString(s.charAt(i)), i+1);
	}
	
	public static void subsetMethod1(char[] arr, List<String> tempList, int start) {
		System.out.println(tempList.toString());
		for(int i=start; i < arr.length; i++) {
			tempList.add(Character.toString(arr[i]));
			subsetMethod1(arr, tempList, i + 1);
			tempList.remove(tempList.size() - 1);
		}
		
		
	}
	
	public static void main(String args[]) {
//		subset("ABC","", 0);
		subsetMethod1("ABC".toCharArray(), new ArrayList<>(), 0);
	}
	
}
