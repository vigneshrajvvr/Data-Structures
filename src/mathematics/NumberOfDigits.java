package mathematics;

public class NumberOfDigits {
	
	/*
	 * Time complexity: O(length of input)
	 * Space complexity: O(1)
	 */
	
	// Iterative solution
	public static int digits(int value) {
		int count = 0;
		while(value > 0) {
			value = value/10;
			count++;
		}
		return count;
	}
	
	// Recursive solution
	public static int digitsRec(int value) {
		return digitsRecHelper(value, 0);
	}
	
	private static int digitsRecHelper(int value, int count) {
		if(value == 0) {
			return count;
		}
		value = value/10;
		count++;
		return digitsRecHelper(value, count);
	}
 	
	public static void main(String args[]) {
		System.out.println(digits(123)); //3
		System.out.println(digitsRec(1234)); //4
		System.out.println(digits(10)); //2
		System.out.println(digitsRec(12364645)); //8
	}
}
