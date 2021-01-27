package dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Write a function 'canConstruct(target, wordBank)' that accepts a
 * target string and an array of strings
 * 
 * The function should return a boolean indicating whether or not the
 * 'target' can be constructed by concatenating elements of the 
 * 'wordBank' array
 * 
 * You may reuse elements of 'workBank' as many times as needed.
 */

public class CanConstruct {
	
	public static boolean canConstruct(String target, String[] wordBreak) {
		
		if(target.equals("")) {
			return true;
		}
		
		HashSet<String> dictWords = new HashSet<>();
		
		for(String s : wordBreak) {
			dictWords.add(s);
		}
		
		return canConstructImplementation(target, dictWords);
	}
	
	private static boolean canConstructImplementation(String target, HashSet<String> dictWords) {
		
		if(target.equals("")) {
			return true;
		}
		
		for(int i=1;i<=target.length();i++) {
			
			String temp = target.substring(0,i);
			
			if(dictWords.contains(temp) && canConstructImplementation(target.substring(i,target.length()), dictWords)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		
		String[] wordBreak = new String[] {"ab", "abc", "cd", "def", "abcd"};
		System.out.println(canConstruct("abcdef", wordBreak));
		
		System.out.println(canConstruct("", wordBreak));
		
		System.out.println(canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		
		System.out.println(canConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}));
		
		System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
		
	}

}
