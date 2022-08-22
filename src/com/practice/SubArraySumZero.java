package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubArraySumZero {
	
	public static void main(String[] args)
	{
		int[] arr = {6, 3, -1, -3, 4, -2, 2,
	             4, 6, -12, -7};
		
		//System.out.println(new SubArraySumZero().zeroSubArray(arr));
		
		int[] arr1 = {1,1,1};
		
		System.out.println(subarraySumOptimized(arr1,2));
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,2,1,2,1};
		System.out.println(subarraySumOptimized(arr3,3));
		System.out.println(subarraySumOptimized(arr2,3));
	}
	
	public ArrayList<String> zeroSubArray(int[] arr)
	{
		ArrayList<String> abc = new ArrayList<String>();
		HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				abc.add(String.valueOf(i));
			}
			else
			{
				sum = sum + arr[i];
				if(sum ==0)
				{
					abc.add("0,"+String.valueOf(i));
				}
				else
				{
					if(numbers.containsValue(sum))
					{
						for(Map.Entry<Integer, Integer>es:numbers.entrySet())
						{
							if(es.getValue()==sum)
								abc.add(String.valueOf(es.getKey()+1)+","+i);
						}
						
					}
					numbers.put(i,sum);
				}
			}
			
			
		}
		
		
		return abc;
		
	}
	
	public static int subarraySum(int[] nums, int k) 
    {
        int count = 0;
        
        for(int i=0;i< nums.length;i++)
        {
        	int sum =0;
        	for(int j=i;j<nums.length;j++)
        	{
        		
        		sum = sum+nums[j];
        		if(sum ==k)
        			count++;
        	}
        }
        return count;
    }
	
	
	//[1,2,1,2,1],3  ->1,2--1,2,2,1
	public static int subarraySumOptimized(int[] nums, int k) 
	{
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
