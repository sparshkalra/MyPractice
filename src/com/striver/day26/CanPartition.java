package com.striver.day26;

import java.util.HashSet;
import java.util.Set;

public class CanPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canPartition(new int[] {1,5,11,5}));
	}

	 public static boolean canPartition(int[] nums) {
	        int sum=0;
	        for(int i:nums)
	        {
	        	sum= sum+i;
	        }
	        if(sum%2!=0) 
	        {
	        	return false;
	        }
	        int target = sum/2;
	        
	        Set<Integer> set = new HashSet<Integer>();
	        set.add(0);
	        
	        for (int num: nums) 
	        {
	            Set<Integer> tempSet = new HashSet<Integer>(set);
	            for (Integer subInt : tempSet) 
	            {
	                if (subInt + num == target)
	                {
	                	return true;
	                }
	                if (subInt + num < target)
	                {
	                	set.add(subInt + num);
	                }
	            } 
	        }
	        
	        return false;
	    }
}
