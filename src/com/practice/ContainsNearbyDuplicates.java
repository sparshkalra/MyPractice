package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,0,1,1};
		
		//System.out.println(containsNearbyDuplicate(arr, 1));
		
		int diff = Math.abs(-2147483648 - 2147483647);
		
		System.out.println(diff);
		
		System.out.println(containsNearbyAlmostDuplicate(new int[] {1,2,3,1}, 3, 0));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                if(Math.abs(hm.get(nums[i])-i) <=k)
                {
                    return true;
                }
                else
                {
                	hm.put(nums[i],i);
                }
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return false;
    }
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
            	int diff = Math.abs(nums[i] - nums[j]);
                int diffIndex = Math.abs(i - j);
                if(diff <=t && diffIndex <=k)
                {
                    System.out.println("Coming here for" + nums[i]+ ","+ nums[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
