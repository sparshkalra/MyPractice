package com.practice;

import java.util.HashMap;

public class AircallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,2,2,2,4,4,4,4,-1,7,36,8,9,3};
		int sum = 6;
		

		returnCount(a,sum);
	}

	public static int returnCount(int[]a, int sum)
	{
		int count =0;
		
		
		HashMap<Integer,Integer>hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int val = hm.get(a[i]);
				hm.put(a[i], val+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			
			if(hm.containsKey(sum - a[i]))
			{
				//count = count +hm.get(sum-a[i]);
				
				if(sum/2 == a[i])
				{
					if(hm.get(a[i]) > 1)
					{
						System.out.println("Pair value:" + a[i]+ ":" + String.valueOf(sum-a[i]));
					}
				}
				else
				{
					System.out.println("Pair value:" + a[i]+ ":" + String.valueOf(sum-a[i]));
				}
			
			}
			
			
		}
		
		
		
		
		return count;
	}
	
	
}
