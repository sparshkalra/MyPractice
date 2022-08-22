package com.ds;

import java.util.Arrays;

public class WindowSliding {
	
	public static void main(String[] args)
	{
		int[] arr= {12,45,72,900,8,3,76,90,82};
		int k =2;
		int n= arr.length;
		
		int[] arr1 = {1,0,0,1,1,0,0,1};
		
		int[]arr2 = {2,10,8,17,34,1};
		
		System.out.println(calculateMinimumLengthOfRoof(arr2,3));
		//System.out.println(calculateMax(arr, n, k));
		//System.out.println(calculateMaxWindowSlide(arr, n, k));
		
		//System.out.println(calculateMinimumSwaps(arr1));
	}
	
	public static int calculateMax(int arr[], int n, int k)
	{
		int sum =0;
		int maxSum =0;
		
		for(int i =0;i<n-k+1;i++)
		{
			sum=0;
			for(int j=0;j<k;j++)
			{
				sum = sum + arr[j+i];
				
			}
			maxSum = Math.max(sum, maxSum);
		}
		
		
		return maxSum;
	}
	
	public static int calculateMaxWindowSlide(int arr[], int n, int k)
	{
		
		//Creating first window
		int max_sum = 0;
		
		for(int i =0;i<k;i++)
		{
			max_sum = max_sum + arr[i];
		}
		
		int window_sum = max_sum;
		
		for (int i = k; i < n; i++) 
		{
			window_sum = window_sum + arr[i] - arr[i - k];
			max_sum = Math.max(max_sum, window_sum);
		}
		
		
		return max_sum;
	}
	
	public static int calculateMinimumSwaps(int arr[])
	{
		
		//Creating first window
		int numberZero = 0;
		int numberOne = 0;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] ==0)
				numberZero++;
				
			else
				numberOne++;
		}
		
		int window_size = numberOne;
		int maxSum =0; 		
		int sum = arr[0]+arr[1]+arr[2]+arr[3];
		maxSum = sum;
		for(int i=window_size;i<arr.length-window_size;i++)
		{
			sum = maxSum -arr[i-window_size]+arr[i];
			
			maxSum = Math.max(maxSum, sum);
		}
		
		return window_size - maxSum;
	}
	
	public static int calculateMinimumLengthOfRoof(int[]arr, int k)
	{
		int min =Integer.MAX_VALUE;
		

		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-k;i++)
		{
			
			min = Math.min(min, -arr[i]+arr[i+k-1]+1);
		}
		return min;
	}

}
