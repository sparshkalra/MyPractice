package com.practice;

import java.util.Arrays;

public class AlgoSecInterview {

	public static void main(String[] args) {
		
		int[] arr = {-1000,3,2,-600,0,-300};
		
		Arrays.sort(arr);
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max1)
			{
				max3= max2;
				max2=max1;
				max1= arr[i];
				
			}
			else if(arr[i] >max2)
			{
				max3= max2;
				max2=arr[i];
			}
			else if(arr[i] >max3)
			{
				max3= arr[i];
			}
			else if(arr[i] <min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i] <min2)
			{
				min2 = arr[i];
			}
			
			
		}
		
		if(arr[arr.length]-1 <0)
		{
			//return sum of last 3;
		}
		if(Math.abs(min1)>Math.abs(max1))
			{
				if(min2<0)
				{
					//return min1,min2 and max 
				}
			}
			else
			{
				//Multiply max1,max2,max3
			}
		

	}

}
