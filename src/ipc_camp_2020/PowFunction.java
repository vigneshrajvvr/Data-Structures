package ipc_camp_2020;

public class PowFunction {
	
	public static int pow(int a, int n) {
		
		if(n == 0) {
			return 1;
		}
		
//		if(n == 1) {
//			return a;
//		}
		
		if(n%2 == 0) { // n is even
			int val = pow(a,n/2);
			return val*val;
		} else { // n is odd
			int val = pow(a,n/2);
			return val * val * a;
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(PowFunction.pow(5, 2)); // 25
		System.out.println(PowFunction.pow(2, 5)); // 32
		System.out.println(PowFunction.pow(5,0));  // 1
		System.out.println(PowFunction.pow(10,5)); // 1000001
		
	}

}
