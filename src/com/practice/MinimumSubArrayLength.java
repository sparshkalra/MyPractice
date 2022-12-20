package com.practice;

public class MinimumSubArrayLength 
{
	public static void main(String[] args)
	{
		int target = 7;
		int []nums = {1,8,9,2,3,2};
		int[] nums1 = {2,3,1,2,4,3};
		//System.out.println(minSubArrayLenExact(target,nums));
		
		System.out.println(minSubArrayLen(7, nums1));
	}
	public static int minSubArrayLen(int target, int[] nums) 
	{
        int len = Integer.MAX_VALUE;
        int sum = 0, j=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum>=target){
                len = Math.min(len,i-j+1);
                sum -= nums[j++];
            }
        }
        return (len != Integer.MAX_VALUE)? len : 0;
    }
	
	public static int minSubArrayLenExact(int target, int[] nums) 
	{
        int len = Integer.MAX_VALUE;
        int sum = 0, j=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum>target){
                sum -= nums[j++];
            }
            if(sum == target)
            {
            	len = Math.min(len, i-j+1);
            }
        }
        return (len != Integer.MAX_VALUE)? len : 0;
    }

}
