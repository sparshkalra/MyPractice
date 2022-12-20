package com.gfg.practice;

public class AverageOFStream 
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,1,2,-3,0};
		
		printAverage(arr, 3);
	}
	
	public static void printAverage(int[] arr, int k)
	{
		double sum = 0;
		double avg = 0;
		for(int i=0;i<k;i++)
		{
			sum = sum+arr[i];
		}
		avg = sum/k;
		System.out.println(avg);
		for(int i=k;i<arr.length;i++)
		{
			sum = sum + arr[i];
			sum = sum - arr[i-k];
			avg = sum/k;
			System.out.println(avg);
		}
	}
}
