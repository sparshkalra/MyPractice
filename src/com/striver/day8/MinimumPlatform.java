package com.striver.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class MinimumPlatform {

	public static void main(String[] args) {
		
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		
		
		System.out.println(findPlatform(arr,dep,arr.length));

	}
	
	static int findPlatform(int arr[], int dep[], int n)
    {
		int op =0;
		
		int maxCurrent = 1;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i=0;int j=0;
		while(i <n && j< n)
		{
			if(arr[i] <= dep[j])
			{
				maxCurrent++;
				i++;
			}
			else
			{
				j++;
				maxCurrent--;
				op = Math.max(maxCurrent, op);
			}
		}
		
		return op;
    }

}
