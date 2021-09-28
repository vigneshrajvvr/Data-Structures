package dynamicprogramming;

import java.util.HashMap;

public class CountConstruct {
	
	public static int countConstruct(String target, String[] wordBank) {
		if(target.equals("")) {
			return 0;
		}
		
		HashMap<String, Integer> result = new HashMap<>();
		
		return countConstructImplementation(target, wordBank, result);
	}
	
	private static int countConstructImplementation(String target, String[] wordBank, HashMap<String, Integer> result) {
		
		if(result.containsKey(target)) {
			return result.get(target);
		}
		
		if(target.equals("")) {
			return 1;
		}
		
		int count = 0;
		
		for(int i = 0; i < wordBank.length; i++) {
			if(target.indexOf(wordBank[i]) == 0) {
				count += countConstructImplementation(target.substring(wordBank[i].length(), target.length()), wordBank, result);
			}
		}
		
		result.put(target, count);		
		return count;
	}
	
	public static void main(String args[]) {
		
		System.out.println(countConstruct("purple", new String[] {"purp", "p", "ur", "le", "purpl"})); // 2
		System.out.println(countConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"})); // 1
		System.out.println(countConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska","sk", "boar"})); // 0
		System.out.println(countConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"})); // 4
		System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee","eeeeee"})); // 0
		
	}

}
