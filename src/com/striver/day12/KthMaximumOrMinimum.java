package com.striver.day12;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaximumOrMinimum 
{
	public static void main(String[]args)
	{
		int[] nums = {3,2,1,5,6,4};
	
		System.out.println(kLargestElement(nums,3));
		System.out.println(kSmallestElement(nums,2));
	}
	
	public static int kLargestElement(int[]arr, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
			
			if(pq.size() > k)
			{
				pq.poll();
			}
		}
		return pq.poll();
	}
	public static int kSmallestElement(int[]arr, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
			
			if(pq.size() > k)
			{
				pq.poll();
			}
		}
		return pq.poll();
	}
}
