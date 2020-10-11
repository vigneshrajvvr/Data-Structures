package hashing;

public class Basic01 {
	
	public static void main(String args[]) {
		System.out.println(smod(500));
		System.out.println(ascii("ABCDEFHG", 16));  // 4 
		System.out.println(ascii("ABC", 16));
	}
	
	//simple hash function to map a integer
	private static int smod(int value) {
		return value % 16;
	}
	
	//hash function to map a string to integer
	//many strings will have same hash value - cosllision
	private static int ascii(String value, int mod) {
		
		int sum = 0;
		
		for(int i=0;i<value.length();i++) {
			sum += value.charAt(i);
		}
		
		return sum % mod;
		
	}

}
