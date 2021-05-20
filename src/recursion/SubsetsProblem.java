package recursion;

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
	
	public static void main(String args[]) {
		subset("ABC","", 0);
	}
	
}
