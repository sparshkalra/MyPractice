package com.practice;

import java.util.ArrayList;
import java.util.List;

public class RangeCover {
	
	public static void main(String[] args)
	{
		int [][] ranges = {{1,2},{3,4},{5,6}};
		
		int left = 2; int right = 5;
		
		System.out.println(isCovered(ranges,left,right));
	}
	
	public static boolean isCovered(int[][] ranges, int left, int right) 
    {
        List<Integer> nums = new ArrayList<Integer>();
        
        for(int i=left;i<=right;i++)
        {
            nums.add(i);
        }
        for(int i=0;i<ranges.length;i++)
        {
            int[] range = ranges[i];
            
            for(int k=range[0];k<=range[1];k++)
            {
                if(nums.contains(range[k]))
                {
                    nums.remove(Integer.valueOf(k));
                
                }
                    
            }
        }
        return(nums.size()==0);
    }

}
