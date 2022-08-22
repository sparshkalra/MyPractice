package com.striver.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {3,2,4};
		System.out.println(Arrays.toString(twoSum(nums,6)));

	}
	public static int[] twoSum(int[] nums, int target) 
    {
		Map<Integer,Integer> hm = new HashMap<>();
	       
        int[] op = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target - nums[i]))
            {
                op[0] = i;
                op[1] = hm.get(target - nums[i]);
                return op;
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        
        return op;
    }

}
