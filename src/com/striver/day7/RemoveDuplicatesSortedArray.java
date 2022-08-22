package com.striver.day7;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums1 = {1,1,2};
	}
	
	public static int removeDuplicates(int[] nums) 
    {
        int count=0;
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            while(i<len -1 && nums[i] == nums[i+1])
            {
                i++;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }

}
