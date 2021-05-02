package mathematics;

public class PrimeFactors {
	
	
	// n^1/2 * logn
	public static void primeFactorOptimized(int n) {
		if(n < 1) {
			return;
		}
		System.out.println("Optimized: ");
		for(int i = 2; i*i <= n ; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n = n/i;
			}
		}
		
		if(n > 1) {
			System.out.println(n);
		}
	}
	
	// n * n ^ (1/2) * logn
	public static void primeFactorsBruteForce(int n) {
		if(n < 1) {
			return;
		}
		for(int i = 2; i< n;i++) {
			if(prime(i)) {
				int x = i;
				while(n % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}
	
	private static boolean prime(int n) {
		if(n == 2 || n == 3) {
			return true;
		}
		if(n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for(int i = 5; i * i <=n;i+=6) {
			if(n % 5 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
//		primeFactorsBruteForce(12);
//		primeFactorOptimized(12);
		primeFactorOptimized(150000);
	}

}
