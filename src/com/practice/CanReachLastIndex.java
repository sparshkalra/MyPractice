package com.practice;

public class CanReachLastIndex {

	public static void main(String[] args) {
		
		int[] nums = {2,3,1,1,4};
		int[] nums1 = {3,2,1,0,4};
		
		System.out.println(canJump(nums));
		System.out.println(canJump(nums1));
		

	}
	
	public static boolean canJump(int[] nums) 
	{
        int index_value = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i > index_value)
            {
            	return false;
            }
            index_value = Math.max(index_value , i + nums[i]);
        }
        return true;
    }


}
