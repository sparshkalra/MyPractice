package com.practice;

import java.util.Arrays;

public class LCMGCD {

	public static void main(String[] args) 
	{
		int a = 6;
		int b = 20;
		
		System.out.println(lcm(a,b));
		int[] arr = {7,20,21,28};
		Arrays.sort(arr);
	//	printMissingElements(arr);
		String s = "1101001";
		//System.out.println(zeroPlusOccurence(s));
		//System.out.println(zeroPlusOccurence("1001001100100"));
	}
	
	public static int lcm(int a, int b)
	{
		int hcf = hcf(a,b);
		return a * b/hcf;
	}
	public static int hcf(int a, int b)
	{
		if(a==0)
			return b;
		return hcf(b%a,a);
	}
	
	public static void printMissingElements(int[]arr)
	{
		for(int i=0;i < arr.length-1;i++)
		{
			if(arr[i+1]-arr[i] ==1)
			{
				continue;
			}
			else
			{
				for(int j=arr[i]+1;j<arr[i+1];j++)
				{
					System.out.println(j);
				}
			}
		}
	}
	
	public static int zeroPlusOccurence(String s)
	{
		int counter = 0;
		boolean zeroFound = false;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='1')
			{
				zeroFound = false;
				i++;
				if(s.charAt(i) != '0')
				{
					i--;
				}
				else
				{
					while(s.charAt(i)=='0' && i<s.length()-1)
					{
						i++;
						zeroFound = true;
					}
				}
				
				
				if(s.charAt(i)=='1' && zeroFound)
				{
					counter++;
					i--;
				}
			}
		}
		return counter;
	}
}
