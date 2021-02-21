package randomproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutate 
{

    private static List<List<Integer>> result = new ArrayList<>();

	public static void main (String[] args)
	 {
	     Scanner in = new Scanner(System.in);
	     int[] input = new int[] {1,2,3};
	     permute(input);
	     System.out.println();
	 }
	     
    public static List<List<Integer>> permute(int[] nums) {
        permutation(nums, 0, nums.length-1);
        return result;
    }
    
    private static void permutation(int[] nums, int start, int end) {
        if(start == end) {
            List<Integer> temp = new ArrayList<>();
            for(int value : nums) {
                temp.add(value);
            }
            result.add(temp);
            return;
        }
        
        for(int i=start;i<end;i++){
            permutation(nums, start + 1, end);
            swap(nums, start, i);
        }
    }
    
    private static void swap(int[] nums, int start, int end) {
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    }
} 