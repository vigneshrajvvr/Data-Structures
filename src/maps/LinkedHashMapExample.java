package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {
	
	public static void main(String args[]) {
		
		Map<Integer, String> linkedHashMap 
			= new LinkedHashMap<>();
		
		linkedHashMap.put(1, "One");
		linkedHashMap.put(2,"Two");
		linkedHashMap.put(3,"Three");
		linkedHashMap.put(4,"Four");
		linkedHashMap.put(5,"Five");
		
		Set set = linkedHashMap.entrySet();
		
		Iterator linkedHashMapIterator = set.iterator();
		
		while(linkedHashMapIterator.hasNext()) {
			
			Map.Entry<Integer, String> temp = (Entry<Integer, String>) linkedHashMapIterator.next();
			
			System.out.println(temp.getKey() + " " + temp.getValue());
			
		}
		
		linkedHashMapIterator = set.iterator();
		
		System.out.println(linkedHashMap.get(4));	
		
	}

}
