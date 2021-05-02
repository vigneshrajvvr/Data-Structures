package mathematics;

public class PrimeFactors {
	
	
	// n^1/2 * logn
	public static void primeFactorOptimized(int n) {
		if(n < 1) {
			return;
		}
		System.out.println("Optimized: ");
		if(n % 2 == 0) {
			while(n % 2 == 0) {
				System.out.println(2);
				n = n/2;
			}
		}
		
		if(n % 3 == 0) {
			while(n % 3 == 0) {
				System.out.println(3);
				n = n/3;
			}
		}
		for(int i = 5; i*i <= n ; i+=6) {
			while(n % i == 0) {
				System.out.println(i);
				n = n/i;
			}
			while(n % (i+2) == 0) {
				System.out.println(i+2);
				n = n/(i+2);
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
