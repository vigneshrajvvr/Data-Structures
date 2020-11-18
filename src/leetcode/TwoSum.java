package leetcode;

public class TwoSum {
	
	public static void main(String args[]) {
		
		int nums[] = new int[] {2,7,11,15};	
		
		int result[] = twoSum(nums,9);
      		
	}
	
	//Brute force approach
	public static int[] twoSum(int[] nums, int target) {
		
		if(nums.length == 0 || nums.length == 1) {
            return new int[] {};
        }
        
        for(int i=0;i<nums.length-1;i++) {
            
            for(int j=i+1;j<nums.length;j++) {
                
                if(nums[i] + nums[j] == target) {
                    
                    return new int[] {i, j};
                    
                }
                
            }
            
        }
        
        return new int[]{};
		
	}

}
