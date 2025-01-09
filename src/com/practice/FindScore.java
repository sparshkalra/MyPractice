package com.practice;

import java.util.HashSet;
import java.util.Set;

public class FindScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a = {2,1,3,4,5,2};
		System.out.println(findScore(a));
	}
	public static long findScore(int[] nums) 
    {
        long op =0;
        Set<Integer> hs = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(i);
        }
       
        while(hs.size() >0)
        {
        	 int min = Integer.MAX_VALUE;
        	 int index =0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i] <min && hs.contains(i))
                {
                    min =nums[i];
                    index =i;
                }
            }
            op = op+min;
            hs.remove(index);
            if(hs.contains(index+1))
            {
                hs.remove(index+1);
            }
            if(hs.contains(index-1))
            {
                hs.remove(index-1);
            }
            
        }
        return op;

    }

}
