package com.striver.day4;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 2, 6, 4};
		int[] aSum = {1,2,1,2,1};
		int[] arr = {6, 3, -1, -3, 4, -2, 2,
	             4, 6, -12, -7};
		
		System.out.println(returnSubArrayCount(a,6));
		
		System.out.println(returnSubArrayCountSum(arr, 0));
	}

	public static int returnSubArrayCount(int[]a, int b)
	{
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int op = 0;
		
		int xor = 0;
		
		for(int i=0;i<a.length;i++)
		{
			xor = a[i]^xor;
			if(xor == b)
			{
				op++;
			}
			
			if (hm.get(xor ^ b) != null) 
			{
				op = op + hm.get(xor ^ b);
			} 
			if (hm.get(xor) != null) 
			{
				hm.put(xor, hm.get(xor) + 1);
			} else
				hm.put(xor, 1);
		}
		
		
		
		return op;
	}
	
	//{6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
	
	/*
	 *  -1,-3,4
	 *  -2,2
	 *  2,4,6,-12
	 *  -1, -3, 4, -2, 2
	 *  whole
	 */	
	public static int returnSubArrayCountSum(int[]a, int b)
	{
		int sum = 0;
		int op =0;
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
			
			if(sum == b)
			{
				op++;
			}
			if(hm.containsKey(sum - b))
			{
				op = op+hm.get(sum - b);
			}
			hm.put(sum, hm.getOrDefault(sum, 0)+1);
		}
		
		return op;
	}
}
