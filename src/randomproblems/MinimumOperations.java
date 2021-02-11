package randomproblems;

public class MinimumOperations {
	
	public static void main(String args[]) {
		System.out.println(minOperation(8));
	}
	
	public static int minOperation(int n)
    {
        int count = 0;
        while(n != 0) {
        	if(n % 2 == 0) {
        		n = n/2;
        	} else {
        		n = n-1;
        	}
        	count++;
        }
        return count;
    }

}
