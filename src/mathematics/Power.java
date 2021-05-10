package mathematics;

public class Power {
	
	// Time complexity: O(n)
	// Space complexity: O(1)
	public static int powerBruteForce(int x, int n) {
		int result = 1;
		for(int i = 1;i<=n;i++) {
			result *= x;
		}
		return result;
	} 
	
	// Time complexity: O(log n)
	// Space complexity: O(log n)
	// Recursive solution
	public static int powerOptimised(int x, int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n % 2 == 0) {
			int value = powerOptimised(x, n/2);
			return value * value;
		} else {
			int value = x * powerOptimised(x, n-1);
			return value;
		}
	}
	
	// Time complexity: O(log n)
	// Space complexity: O(1)
	// Binary Exponentiation
	public static int binaryExponentiation(int x, int n) {
		int result = 1;
		while(n > 0) {
			if(n % 2 != 0) {
				result *= x;
				System.out.print(1 + " " );
			} else {
				System.out.print(0 + " ");
			}
			n = n/2;
			x = x * x;
		}
		return result;
	}
	 
	public static void main(String args[]) {
		// Brute force
		System.out.println("Brute force solution : ");
		System.out.println(powerBruteForce(2,3));
		System.out.println(powerBruteForce(3,4));
		System.out.println(powerBruteForce(5,0));
		System.out.println(powerBruteForce(5,1));
		
		// Recursive solution
		System.out.println("Recursive solution : ");
		System.out.println(powerOptimised(2,6));
		
		// Iterative solution
		System.out.println("Binary exponentiation : ");
		System.out.println(binaryExponentiation(2,3));
		System.out.println(binaryExponentiation(3,4));
		System.out.println(binaryExponentiation(5,0));
		System.out.println(binaryExponentiation(5,1));
		System.out.println(binaryExponentiation(4,5));
		
	}
}
