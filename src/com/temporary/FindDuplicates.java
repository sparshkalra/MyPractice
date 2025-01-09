package com.temporary;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) 
	{
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));
	}
	    public static List<Integer> findDuplicates(int[] nums) 
	    {
	        List<Integer> op = new ArrayList<Integer>();
	        for(int i=0;i< nums.length;i++)
	        {
	            int num = Math.abs(nums[i]);
	            
	            if(nums[num-1] <0)
	            {
	                op.add(num);
	            }
	            else
	            {
	                nums[num-1] = -1* nums[num-1];
	            }
	        }
	        return op;
	    }

}
