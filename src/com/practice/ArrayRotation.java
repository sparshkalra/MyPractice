package com.practice;

import java.util.Arrays;

public class ArrayRotation {
	
	public static void main(String[] args)
	{
		int[] ele = {1,2,3,4,5,6,7};
		
		
	//	rotateLeft(ele);
		
		//System.out.println(Arrays.toString(ele));
		//System.out.println("------------------------------");
		//rotateRight(ele);
		
		int[] nums = {3,0,1};
		
		System.out.println(missingNumber(nums));
	}
	//1,2,3,4,5,6  --- 6,1,2,3,4,5
	public static void rotateLeft(int[] arr)
	{
		int temp = arr[arr.length-1];
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i] = arr[i-1];
			
		}
		arr[0]= temp;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	
	//1,2,3,4,5,6  ->2,3,4,5,6,1
	public static void rotateRight(int[] arr)
	{
		int len=arr.length;
		
		
			int temp =arr[0];
			for(int i=0;i<len-1;i++)
			{
				
				arr[i] = arr[i+1];				
			}
			arr[len-1] = temp;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	
	public static void rotate(int n, int[] arr)
	{
		int len=arr.length;
		int val =len-n;
		
		for(int h=0;h<val;h++)
		{
			int temp =arr[0];
			for(int i=0;i<len-1;i++)
			{
				
				arr[i] = arr[i+1];				
			}
			arr[len-1] = temp;
		}
		
		
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
    public static int missingNumber(int[] nums) 
    {
        int[] nums1 = new int[nums.length+1];
        
        Arrays.fill(nums1,0);
        for(int i:nums)
        {
            nums1[i] = -1;
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            if(nums[i] == 0)
            {
                return i+1;
            }
        }
        return 0;
            
    }
	
	
}
