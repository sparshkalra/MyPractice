package com.striver.day25;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 101, 2, 3, 100};
		
		System.out.println(maxSumIS(arr, arr.length));
	}
	
	public static int maxSumIS(int arr[], int n)  
	{  
		int op = arr[0];
		
		int[] dp = new int[arr.length];
		dp[0] = arr[0];

		for(int i=0;i<n;i++)
		{
			dp[i] = arr[i];
		}
		for (int i = 1; i < n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				 if (arr[i] > arr[j] && dp[i] < dp[j] + arr[i])
	             {
					 dp[i] = dp[j] + arr[i];
	             }	
			}  
		}
            
        for(int i=0;i<dp.length;i++)
        {
        	op = Math.max(op, dp[i]);
        }
        return op;

	}  
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		ArrayList<Integer> op = new ArrayList<Integer>();
        
        for(ArrayList<Integer> temp: kArrays)
        {
            op.addAll(temp);
        }
        
        return op;
            
	}
}
