package mathematics;

public class TrailingZeros {
	
	public static long zeroFact(int n) {
		long fact = 1;
		for(int i = 2 ; i <= n ; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
		int count = 0;
		while(fact > 0) {
			long rem = fact % 10;
			if(rem != 0) {
				break;
			} else {
				count++;
			}
			fact = fact/10;
		}
		return count;
	}
	
	public static void main(String args[]) {
		System.out.println(zeroFact(5));
		System.out.println(zeroFact(10));
		System.out.println(zeroFact(20));
		System.out.println(zeroFact(2));
	}
	
}
