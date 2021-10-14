package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Integer> allConstruct(String target, String[] wordBank) {
		
		if(target.equals("")) {
			return new ArrayList<>();
		}
		
		for(int i = 0; i < wordBank.length; i++) {
			if(target.indexOf(wordBank[i]) == 0) {
				List<Integer> list = allConstruct(target.substring(wordBank[i].length() - 1, target.length()), wordBank);
			}
		}
		
		return null;
	}

}
