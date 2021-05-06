package mathematics;

public class Power {
	
	// Time complexity: O(n)
	public static int powerBruteForce(int x, int n) {
		int result = 1;
		for(int i = 1;i<=n;i++) {
			result *= x;
		}
		return result;
	} 
	
//	public static int powerOptimized(int x, int n) {
//		if(n == 0) {
//			return 1;
//		}
//		
//	}
	
	public static void main(String args[]) {
		System.out.println(powerBruteForce(2,3));
		System.out.println(powerBruteForce(3,4));
		System.out.println(powerBruteForce(5,0));
		System.out.println(powerBruteForce(5,1));
		
//		System.out.println(powerOptimized(3,4));

	}
}