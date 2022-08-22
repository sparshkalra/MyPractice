package com.striver.day1;

public class SortArrayOfThreeNumbers 
{
	public void sortColors(int[] nums) 
    {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] ==0)
            {
                count1++;
            }
            else if (nums[i] == 1)
            {
                count2++;
            }
            else
            {
                count3++;
            }
        }
            
            for(int i=0;i<nums.length;i++)
            {
                if(count1> 0)
                {
                    nums[i] = 0;
                    count1--;
                }
                else if(count2 > 0)
                {
                    nums[i] = 1;
                    count2--;
                }
                else
                {
                    nums[i] = 2;
                    count3--;
                }
            }
        }
}
