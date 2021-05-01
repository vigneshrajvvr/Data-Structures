package mathematics;

public class LCM {
			
	public static int lcm(int a, int b) {
		int result = Math.max(a, b);
		while(true) {
			if(result % a == 0 && result % b == 0) {
				break;
			}
			result++;
		}
		return result;
	}
	
	// a * b = lcm(a ,b) * gcd(a, b)
	
	public static int efficient(int a, int b) {
		return (a*b)/euclidRecurGcd(a,b);
	}
	
	public static int euclidRecurGcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return euclidRecurGcd(b, a%b);
		}
	}
	
	public static void main(String args[]) {
		System.out.println(efficient(4,6));
		System.out.println(efficient(12,15));
		System.out.println(efficient(2,8));
		System.out.println(efficient(3,7));
	}

}
