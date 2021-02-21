package randomproblems;

//Brute force approach : O(n^3)
public class KadaneAlgorithm {
	static int maxSubarraySum(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                int tempSum = sumOfArray(arr, i, j);
                if(tempSum > max) {
                    max = tempSum;
                }
            }
        }
        return max;
    }
    
    static int sumOfArray(int[] arr, int start, int end) {
        int tempSum = 0;
        for(int i=start;i<=end;i++) {
            tempSum += arr[i];
        }
        return tempSum;
    }
    
    public static void main(String args[]) {
    	int[] arr = new int[] {74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75};
    	System.out.println(maxSubarraySum(arr, 14));
    }
}
