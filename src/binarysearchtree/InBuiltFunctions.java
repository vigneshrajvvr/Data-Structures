package binarysearchtree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class InBuiltFunctions {
	
	public static void main(String args[]) {
		
		System.out.println("Tree Set : ");
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
		
		System.out.println("-------------------------------------------");
		System.out.println("Tree Map : ");
		TreeMap<Integer, String> t = new TreeMap<>(); // Stores the keys in stored order
		t.put(10, "geeks");
		t.put(15, "ide");
		t.put(5, "courses");
		
		System.out.println(t);
		System.out.println(t.containsKey(10));
		
		System.out.println(t.higherKey(10));
		System.out.println(t.lowerKey(10));
		System.out.println(t.floorKey(10));
		System.out.println(t.ceilingKey(10));
		
		System.out.println(t.higherEntry(10).getValue());
		System.out.println(t.lowerEntry(10).getValue());
		System.out.println(t.floorEntry(10).getValue());
		System.out.println(t.ceilingEntry(10).getValue());
		
		for(Map.Entry<Integer, String> e : t.entrySet()) {
			System.out.println(" Key : " + e.getKey() + " Value : " + e.getValue());
		}
		
		t.remove(10);
		System.out.println("Size : " + t.size());
		
	}
	
}
