package mathematics;

public class AllDivisors {
	
	// Time complexity: O(n) - Brute Force approach
	public static void divisorsBrute(int n) {
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void divisorsOptimized1(int n) {
		System.out.println("Optimized : ");
		int i;
		for(i=1;i*i<n;i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		i--;
		for(;i>=1;i--) {
			if(n % i == 0) {
				System.out.println(n/i);
			}
		}
	}
	
	public static void main(String args[]) {
		divisorsBrute(6);
		divisorsOptimized1(6);
		divisorsOptimized1(15);
	}

}
