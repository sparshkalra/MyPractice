package com.striver.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayWithZero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[]arr = {-1,1,1,-1};
		
		System.out.println(maxLen(arr));
	}
	
	public static int maxLen(int arr[])
    {
	       int max = 0;
	        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        int sum =0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i] == 0)
	            {
	                hm.put(i,0);
	                max = Math.max(max,1);
	            }
	            sum = sum + arr[i];
	            if(hm.containsKey(sum))
	            {
	                int temp = hm.get(sum);
	                max = Math.max(i-temp,max);
	            }
	            else if(sum == 0)
	            {
	            	max = Math.max(i+1,max);
	            }
	            else
	            {
	                hm.put(sum,i);
	            }
	           
	        }
	        return max;
	    }

}
