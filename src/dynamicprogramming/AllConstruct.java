package dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Write a function 'allConstruct(target, wordBank)' that accepts a 
 * target string and an array of strings.
 * 
 * The function should return a 2D array containing all of the ways 
 * that the 'target' can be constructed by concatenating elements of 
 * the 'wordBank' array. Each element of the 2D array should represent 
 * one combination that constructs the 'target'.
 * 
 * You may reuse elements of 'wordBank' as many times as needed.
 */

public class AllConstruct {
	
	static Map<String, List<List<String>>> memo = new HashMap<>();
		
	public static List<List<String>> allConstruct(String target, String[] wordBank) {
		
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
		
		if(target.equals("")) {
			List<List<String>> returnList = new ArrayList<>();
			returnList.add(new ArrayList<>());
			return returnList;
		}
		
		List<List<String>> result = new ArrayList<>();
				
		for(int i = 0; i < wordBank.length; i++) {
			if(target.indexOf(wordBank[i]) == 0) {
//				System.out.println(target.substring(wordBank[i].length(), target.length()));
				List<List<String>> list = allConstruct(target.substring(wordBank[i].length(), target.length()), wordBank);
				for(List<String> tempList : list) {
					tempList.add(wordBank[i]);
				}
				for(List<String> tempList : list) {
					result.add(tempList);
				}
			}
		}
		
		memo.put(target, result);		
		return result;
	}
	
	public static void main(String args[]) {
		List<List<String>> result = allConstruct("purple", new String[] {"purp", "p", "ur", "le", "purpl"});
		for(List<String> temp : result) {
			System.out.println(temp.toString());
		}
		/*
		 * [le, purp]
		 * [le, p, ur, p]
		 */
		
		result = allConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd", "ef", "c"});
		for(List<String> temp : result) {
			System.out.println(temp.toString());
		}
		/* [ef, cd, ab]
		 * [def, c, ab]
		 * [def, abc]
		 * [ef, abcd]
		 */
		
		result = allConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"});
		for(List<String> temp : result) {
			System.out.println(temp.toString());
		}
		/*
		 * Empty list - No such combinations
		 */
		
		result = allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[] {"a", "aa", "aaa", "aaaa", "aaaaa"});
		for(List<String> temp : result) {
			System.out.println(temp.toString());
		}
		/*
		 * Empty list - No such combinations
		 */
	}

}
