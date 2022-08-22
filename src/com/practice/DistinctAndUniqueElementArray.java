package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctAndUniqueElementArray {

	public static void main(String[] args) 
	{
		int arr[] = {74,63,7,8,74,63,98,700};
		
		int[] are = {2,2,1};
	findUniqueAndDistinct(arr);
		
		System.out.println(findSingleUnique(are));
	}
	
	public static void findUniqueAndDistinct(int[] arr)
	{
		List<Integer> distinct = new ArrayList<Integer>();
		List<Integer> unique = new ArrayList<Integer>();
		
		Arrays.sort(arr);
		
		for(int i=0;i < arr.length; i++)
		{
			while(i< arr.length-1 && arr[i] == arr[i+1])
			{
				i++;	
			}
			distinct.add(arr[i]);
		
		}
		
		System.out.println(distinct);	
		
	}
	
	public static int findSingleUnique(int[] nums)
	{
		
	        int op = 0;
	        for(int i =0; i < nums.length-1; i++)
	        {
	            if(nums[i] == nums[i+1])
	            {
	                i++;
	            }
	            else
	                op = nums[i];
	        }
	        return op; 
	}

}
