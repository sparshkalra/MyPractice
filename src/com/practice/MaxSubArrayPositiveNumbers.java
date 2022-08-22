package com.practice;

public class MaxSubArrayPositiveNumbers 
{
	public static void main(String[] args)
	{
		int[] arr = {9, 8, 5, 4, 5 ,4, 4, 2, 3,4, 1,5};
		int[] arr1 = {1,2,3,4,5,7,9};
		int[] arr2 = {1,3,5,7,9};
		System.out.println(maxSubArray(arr));
		System.out.println(longestEvenOdd(arr));
		System.out.println(longestEvenOdd(arr1));
		System.out.println(longestEvenOdd(arr2));
	}
	
	public static int maxSubArray(int[] nums)
	{
		int count =0;
		int max=0;
		
		for(int i=0;i < nums.length;i++)
		{
			if(nums[i]%2 == 0)
			{
				count++;
			}
			else
			{
				max = Math.max(count, max);
				count =0;
			}
				
		}
		
		return max;
		
	}
	public static int longestEvenOdd(int[] nums)
	{
		int count =1;
		int max = 0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]%2 == 0 && nums[i+1]%2!=0 || nums[i]%2 != 0 && nums[i+1]%2==0)
			{
				count++;
				
			}
			else
			{
				max = Math.max(count, max);
				count =1;
			}
		}
		if(max==1)
			max=0;
		return max;
	}
}
