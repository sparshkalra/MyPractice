package com.striver.day7;

public class FindMaxConsecutiveOne 
{
	public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int max =0;
        int count = 0;
        
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i] ==1)
            {
                count++;
            }
            else
            {
                max = Math.max(count, max);
                count=0;
            }
        }
        max = Math.max(count, max);
        return max;
    }
	
	public static void main(String[] args)
	{
		int[] nuums = {1,1,0,1,1,1};
		int[] nums = {1,0,1,1,0,1};
		
		System.out.println(findMaxConsecutiveOnes(nums));
		System.out.println(findMaxConsecutiveOnes(nuums));

	}
}
