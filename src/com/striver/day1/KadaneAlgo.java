package com.striver.day1;

import java.util.Arrays;

public class KadaneAlgo {
	
	public static void main(String[] args)
	{
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1 = {13,7,2,8,3};
		
		System.out.println(findMax(nums));
		System.out.println(findMax(nums1));
		
	}
	
	public static int findMax(int[] nums)
	{
		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int maxsum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			
			dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);

			maxsum = Math.max(maxsum, dp[i]);
		}
		System.out.println(Arrays.toString(dp));

		return maxsum;
	}

}
