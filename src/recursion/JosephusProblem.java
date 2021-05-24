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
	
	public static void main(String args[]) {
		System.out.println(josephusIterative(17,16));
	}
	
}
