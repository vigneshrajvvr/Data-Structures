package recursion;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
	
	public static int josephusIterative(int n, int k)
    {
        List<Integer> result = new ArrayList<>();
        for(int j = 1;j<=n;j++) {
            result.add(j);
        }
        int i=0;
        while(result.size() != 1) {
            int temp = ( i + k - 1) % (result.size());
            result.remove(temp);
            i = temp;
        }
        return result.get(0);
    }
	
	public static int josephusRecursion(int n, int k) {
		ArrayList<Integer> result = new ArrayList<>();
        for(int j = 1;j<=n;j++) {
            result.add(j);
        }
        
        return josephusRecursionHelper(n, k, 0, result);
	}
	
	private static int josephusRecursionHelper(int n, int k, int i, ArrayList<Integer> stack)
    {
		if(stack.size() == 1) {
			return stack.get(0);
		}
        
        int temp = ( i + k - 1) % (stack.size());
        stack.remove(temp);
        i = temp;
        return josephusRecursionHelper(n, k, i, stack);
    }
	
	
	public static void main(String args[]) {
		System.out.println(josephusIterative(17,16));
		System.out.println(josephusRecursion(17,16));
	}
	
}
