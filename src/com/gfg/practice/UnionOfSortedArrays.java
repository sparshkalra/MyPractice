package com.gfg.practice;

import java.util.Arrays;

public class UnionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2	= {1, 2, 3};
		
		System.out.println(doUnion(arr1, arr1.length, arr2, arr2.length));
		
		int[] arr3 = {85, 25, 1, 32, 54, 6};
		int[] arr4 = {85, 2};
		
		System.out.println(doUnion(arr3, arr3.length, arr4, arr4.length));
	}

	// Use set/map since set only contains unique
	public static int doUnion(int a[], int n, int b[], int m) 
    {
		int[] com = new int[n+m];
		
		for(int i=0;i<n;i++)
		{
			com[i] = a[i];
		}
		for(int i=n;i<n+m;i++)
		{
			com[i] = b[i-n];
		}
		
		int count = 0;
		Arrays.sort(com);
		for(int i=0;i<com.length;i++)
		{
			while(i < n+m-1 && com[i+1] == com[i])
			{
				i++;			
			}
			count++;
		}
		return count;
		
		
    }
}
