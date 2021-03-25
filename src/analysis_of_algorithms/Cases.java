package analysis_of_algorithms;

public class Cases {
	/*
	 * Best: When n is odd, it will take constant time
	 * Average: Assumption, half of the input is odd and other half is even.
	 * 			So, time take is proportional to input size.
	 * Worst: It will be O(n)
	 */
	public int getSum(int arr[], int n) {
		if(n % 2 == 0) {
			return 0;
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	/*
	 * Big O(Worst case)- n, linear time
	 * Theta: average case
	 * Omega: Best case - it's constant as if the element to be found is present 
	 * 		  in the first position of the array.
	 */
	public int linearSearch(int arr[], int n, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
