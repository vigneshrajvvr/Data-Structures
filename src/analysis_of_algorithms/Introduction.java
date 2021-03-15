package analysis_of_algorithms;

/*
 * Sum of n numbers program
 */

public class Introduction {
	
	/*
	 * Time complexity: c1n + c2
	 */
	public static int sum1(int n) {
		int result = 0;          //c1
		for(int i=1;i<=n;i++) {  //n
			result += i;         //c2
		}
		return result;
	}
	
	/*
	 * Time complexity: c1
	 */
	public static int sum2(int n) {
		return (n * (n+1))/2; //c1
	}
	
	/*
	 * It runs n(n+1)/2 times -> n^2/2 + n/2
	 * Time complexity: c1n^2 + c2n + c3
	 */
	public static int sum3(int n) {
		int result = 0;              
		for(int i=1;i<=n;i++) {      
			for(int k=1;k<=i;k++) {  
				result++;            
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(sum1(5)); // 15
		System.out.println(sum2(5)); // 15
		System.out.println(sum3(5)); // 15
	}

}
