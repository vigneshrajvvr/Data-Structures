package mathematics;

public class GCD {
	
	public static int GDCHelper(int a, int b) {
		int result = 1;
		int limit = Math.min(a, b);
		for(int i=limit;i>=1;i--) {
			if(a % i == 0 && b % i == 0) {
				if(i > result) {
					result = i;
				}
			}
		}
		
		return result;
	}
	
	public static int euclidGcd(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		return a;
	}
	
	public static int euclidRecurGcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return euclidRecurGcd(b, a%b);
		}
	}
	
	public static void main(String args[]) {
		System.out.println(GDCHelper(4, 6));
		System.out.println(GDCHelper(100, 200));
		System.out.println(GDCHelper(7, 13));
		System.out.println(euclidGcd(100, 200));
		System.out.println(euclidRecurGcd(100, 200));
	}
	
}
