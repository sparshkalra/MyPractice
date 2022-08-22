package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 1, 3, 4, 2, 3};//, K = 4
		int[] arr1 = {1, 2, 4, 4};//, K = 2
		
		countDistinct(arr,4);
		countDistinct(arr1,2);
	}
	static void countDistinct(int arr[], int k)
    {
		System.out.println();
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<k;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
				hm.put(arr[i], 1);
		}
		System.out.print(hm.size());
		for(int i=k;i<arr.length;i++)
		{
			if(hm.get(arr[i-k]) == 1)
			{
				hm.remove(arr[i-k]);
			}
			else
			{
				hm.put(arr[i-k], hm.get(arr[i-k]) -1);
			}
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
				hm.put(arr[i], 1);
			System.out.print(hm.size());
		}
    }
	
}
