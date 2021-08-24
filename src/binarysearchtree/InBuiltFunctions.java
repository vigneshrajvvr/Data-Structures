package binarysearchtree;

import java.util.Iterator;
import java.util.TreeSet;

public class InBuiltFunctions {
	
	public static void main(String args[]) {
		
		TreeSet<String> s = new TreeSet<>(); // Self balancing binary search tree
		s.add("gfg");
		s.add("courses");
		s.add("ide");
		s.add("ide"); // It will not be added as it will not allow duplicates
		
		// Returns the tree elements in sorted order
		System.out.println(s.toString()); 
		Iterator<String> treeSetIterator = s.iterator();
		while(treeSetIterator.hasNext()) {
			System.out.println(treeSetIterator.next());
		}
		
		System.out.println(s.contains("ide"));
		
		System.out.println("-------------------------------------------");
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(15);
		treeSet.remove(5);
		System.out.println("Lower : " + treeSet.lower(5)); // Lower value which is less than than 5
		System.out.println("Higher : " + treeSet.higher(5)); // Higher value which is greater than 5
		System.out.println("Floor : " + treeSet.floor(5)); // Value less than or equal to 5
		System.out.println("Ceiling : " + treeSet.ceiling(5)); // Value greater than or equal to 5
		
		for(Integer x : treeSet) {
			System.out.println(x);
		}
		
	}
	
}
