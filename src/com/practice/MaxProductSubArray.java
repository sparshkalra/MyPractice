package com.practice;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,-2,4,-2};
		int[] nums1 = {-2,0,-1};
		
		System.out.println(maxProduct(nums));
		System.out.println(maxProduct(nums1));
	}
	
	public static int maxProduct(int[]nums)
	{
		if(nums == null || nums.length == 0)
		{
			return 0;
		}
		int max = nums[0];
		int min= nums[0];
		int temp, ans = nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
            if(nums[i]<0)
            {
                temp=max;
                max=min;
                min=temp;
            }
            
            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i], min*nums[i]);
            
            ans=Math.max(ans,max);
        }
		
		return ans;
	}

}
