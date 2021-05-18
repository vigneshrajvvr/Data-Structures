package recursion;

public class MaxPieces {
	
	// Time Complexity: O(3 ^ n)
	// Space Complexity: O(n)
	
	public static int maxPieces(int n, int a, int b, int c) {
		if(n < 0) {
			return -1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		int res = Math.max(Math.max(maxPieces(n-a, a, b, c),
						   maxPieces(n-b, a, b, c)), maxPieces(n-c, a, b, c));
		if(res == -1) {
			return -1;
		}
		
		return res + 1;
	}
	
	public static void main(String args[]) {
		System.out.println(maxPieces(23, 11, 9, 12));
		System.out.println(maxPieces(9, 2, 2, 2));
	}

}
