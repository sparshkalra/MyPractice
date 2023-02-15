package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,2,5,2,3,7};
		
		System.out.println(findLHS(nums));
	}
	
	public static int findLHS(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        {
        	m.put(i,m.getOrDefault(i,0)+1);
        }     
        int max=0;
        
        System.out.println(m);
        for(int i:m.keySet())
            if(m.containsKey(i+1))
            {
            	max=Math.max(max,m.get(i)+m.get(i+1)); 
            }
        
        return max;
        
    }	

}
