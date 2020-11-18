package arrays;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String args[]) {
		
		int n=3;
		
		// ArrayList creation
		ArrayList<Integer> arrList = new ArrayList<>(3);
		
		// Addition of elements
		for(int i=0;i<n;i++) {
			arrList.add(i);
		}
		
		System.out.println(arrList);
		
		// Removal of element
		arrList.remove(1);
		
		System.out.println(arrList);
		
		// Printing elements one by one
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		
	}

}
