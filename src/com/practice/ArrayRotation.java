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
		
		//System.out.println(missingNumber(nums));
		
		System.out.println(rotateString("abcde", "abced"));
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
    
    public static boolean rotateString(String s, String goal) 
    {
        char[] wordArr = s.toCharArray();
        char[] wordArr1 = s.toCharArray();
        for(int i =0;i<wordArr.length;i++)
        {
            System.out.println(Arrays.toString(wordArr));
            int len=wordArr.length;
		
		    char temp =wordArr[0];
		    for(int j=0;j<len-1;j++)
		    {
			    wordArr[j] = wordArr[j+1];				
		    }
			wordArr[len-1] = temp;

            if(Arrays.equals(wordArr1,wordArr))
            {
                return true;
            }
        }
        return false;
       
    }

    public char[] rotateRight(char[] arr)
	{
		int len=arr.length;
		
		char temp =arr[0];
		for(int i=0;i<len-1;i++)
		{
			arr[i] = arr[i+1];				
		}
			arr[len-1] = temp;
            return arr;

		
	}
	
	
}
