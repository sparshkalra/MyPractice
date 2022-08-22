package com.practice;

public class SixtInterviewQues {

	public static void main(String[] args) 
	{
		int[] arr = {3,4,5,1,2};
		System.out.println(maxInSortedArray(arr));
		String s = "forgeeksskeegfor";
		
		System.out.println(longestPalSubstr(s));
	}
	
	public static int maxInSortedArray(int[] arr)
	{		
		 int n = arr.length;
		 int l =0;
		 int r = n-1;
		 
		 while(l<= r)
		{
			if(l==r)
				return arr[l];
			int mid = l + (r - l) / 2;

			if (mid == 0 && arr[mid] > arr[mid + 1]) 
			{
				return arr[mid];
			}

			if (arr[l] > arr[mid]) 
			{
				r = mid - 1;
			} else 
			{
				l = mid + 1;
			}
		}
		 return 0;
	}
	
	

}
