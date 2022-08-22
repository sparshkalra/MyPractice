package com.practice;

import java.util.*;

public class Oyo1 {
	
	public static void main(String[] args)
	{
		Oyo1 obj = new Oyo1();
		
		int arr[][] = {{2, 1, 0, 2, 1},
                	   {1, 0, 1, 2, 1},
                	   {1, 0, 0, 2, 1}};
		
		int[][]arr1 = 	{ {2, 1, 0, 2, 1},
            {0, 0, 1, 2, 1},
            {1, 0, 0, 2, 1}};
		
		System.out.println(obj.findMaxTime(arr));
		System.out.println(obj.findMaxTime(arr1));
	}
	HashMap<String, Integer> hm = new HashMap<String, Integer>();

	public int findMaxTime(int[][] v) {
		int max = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				if (v[i][j] == 2) {
					traverse(v, i, j + 1, i, j);
					traverse(v, i, j - 1, i, j);
					traverse(v, i + 1, j, i, j);
					traverse(v, i - 1, j, i, j);
				}
			}

		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				if (v[i][j] == 1) {
					return -1;
				}
			}

		}

		for (Map.Entry<String, Integer> obj : hm.entrySet()) {
			max = Math.max(max, obj.getValue());
		}

		return max;
	}

	public void traverse(int[][] v, int i, int j, int currI, int currJ) 
	{
		if(!isSafe(v,i, j))
		{
			return;
		}
		if (v[i][j] == 1) 
		{
			v[i][j] = 2;
			String loc = String.valueOf(i) + String.valueOf(j);
			String key = String.valueOf(currI) + String.valueOf(currJ);
			int val =0;
			if(hm.containsKey(key))
			{
				val = hm.get(key);
			}

			if (val == 0) {
				hm.put(loc, 1);
			} else 
			{
				if(isSafe(v, i+1, j) && !hm.containsKey(String.valueOf(i+1) + String.valueOf(j)) && v[i+1][j] ==2)
				{
					hm.put(loc, 1);
				}
				if(isSafe(v, i-1, j) && !hm.containsKey(String.valueOf(i-1) + String.valueOf(j)) && v[i-1][j] ==2)
				{
					hm.put(loc, 1);
				}
				if(isSafe(v, i, j+1) && !hm.containsKey(String.valueOf(i) + String.valueOf(j+1)) && v[i][j+1] ==2)
				{
					hm.put(loc, 1);
				}
				if(isSafe(v, i+1, j) && !hm.containsKey(String.valueOf(i) + String.valueOf(j-1)) && v[i][j-1] ==2)
				{
					hm.put(loc, 1);
				}
				else
				{
					hm.put(loc, val+1);
				}
				
			}
		}
	}
	public boolean isSafe(int[][]v,int i, int j)
	{
		if (i < 0 || i > v.length - 1 || j < 0 || j > v[0].length - 1) 
		{
			return false;
		}
		return true;
	
	}

}
