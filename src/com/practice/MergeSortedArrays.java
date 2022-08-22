package com.practice;

public class MergeSortedArrays {

	public static void main(String[] args) 
	{
		int a[] = {2,5,8};
		int b[] = {2,7,14,19};
		
		int []c = new MergeSortedArrays().merge(a,b);
		
		for(int i =0;i < c.length ; i++)
		{
			System.out.println(c[i]);
		}
	}
	
	public int[]merge(int[]arr1, int []arr2)
	{
		int[]op = new int[arr1.length+arr2.length];
		int i=0;int j=0;int k=0;
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i]> arr2[j])
			{
				op[k] = arr2[j];
				k++;
				j++;
			}
			else
			{
				op[k] = arr1[i];
				k++;
				i++;
			}
		}
		
		if(i == arr1.length)
		{
			for(int l=j;l<arr2.length;l++)
			{
				op[k] = arr2[l];
				k++;
			}
		}
		else if(j == arr2.length)
		{
			for(int l=i;l<arr1.length;l++)
			{
				op[k] = arr1[l];
				k++;
			}
		}
		
		return op;
	}

}
