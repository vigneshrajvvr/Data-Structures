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

}
