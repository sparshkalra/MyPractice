package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class EvenSUmProblem 
{
	public static void main(String[]args)
	{
		int[] arr = {2,4,6,8,2101,1,7001}; int k = 5;
		
		System.out.println(findMaxEvenSum(arr, k));
	}
	public static int findMaxEvenSum(int[]arr, int k)
	{
		int maxSum = 0;
		
		ArrayList<Integer>even = new ArrayList<Integer>();
		ArrayList<Integer>odd = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 ==0)
			{
				even.add(arr[i]);
			}
			else
				odd.add(arr[i]);
		}
		Collections.sort(even);
		Collections.sort(odd);
		int i = even.size()-1;
		int j = odd.size()-1;
		
		while(k > 0)
		{
			if(k %2 !=0)
			{
				if(i==0)
					return -1;
				else
				{
					maxSum = maxSum + even.get(i);
					i--;
					k--;
				}
			}
			else
			{
				if(i >=1 && j >=1)
				{
					if(even.get(i) + even.get(i-1) > odd.get(j) + odd.get(j-1))
					{
						maxSum = maxSum + even.get(i) + even.get(i-1);
						i = i-2;
						
					}
					else
					{
						maxSum = maxSum + odd.get(j) + odd.get(j-1);
						j = j-2;;
					}
				}
				else if(j>1)
				{
					maxSum = maxSum + even.get(i) + even.get(i-1);
					j = j-2;
				}
				else if(i >1)
				{
					maxSum = maxSum + even.get(i) + even.get(i-1);
					i = i-2;
				}
				else
				{
					return -1;
				}
				k = k-2;
			}
			
		}			
		
		return maxSum;
	}
}
