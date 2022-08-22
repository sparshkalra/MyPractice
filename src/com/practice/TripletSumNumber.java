package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumNumber {
	
	public static void main(String[] args)
	{
		int[]arr = {12, 3, 4, 1, 6, 9};
		int[]arr1 = {1,2,2,3,4,5};
		int n1 = 9;
		int n = 24;
		List<List<Integer>> op = triplets(arr,n);
		List<List<Integer>> op1 = triplets(arr1,n1);
		op.stream().forEach(m-> System.out.println(m));
		op1.stream().forEach(m-> System.out.println(m));
	}
	
	public static List<List<Integer>> triplets(int[]arr, int n)
	{
		
		Arrays.sort(arr);
		List<List<Integer>> op = new ArrayList<List<Integer>>();
		for(int i=0;i<arr.length-2;i++)
		{
			if(i>0 && arr[i] == arr[i-1])
			{
				continue;
			}
			int ele = arr[i];
			int l = i+1;
			int r = arr.length-1;
			
			while(r>l)
			{
				if(arr[l]+arr[r]+ele == n)
				{
					List<Integer>abc = new ArrayList<Integer>();
					abc.add(arr[l]);
					abc.add(arr[r]);
					abc.add(ele);
					op.add(abc);
					l++;
					r--;
				}
				else if(l+r+ele > n)
				{
					r--;
				}
				else
				{
					l++;
				}

			}
			
						
		}
		
		return op;
		
	}
}
