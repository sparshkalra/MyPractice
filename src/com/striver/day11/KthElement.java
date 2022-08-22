package com.striver.day11;

import java.util.Arrays;

public class KthElement {

	public static void main(String[] args) 
	{
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
		
		//System.out.println(kthElementOptimised(arr1, arr2, arr1.length, arr2.length, k));
		
		int arr11[] = {2, 3, 6, 7, 9};
		int arr22[] = {11, 14, 18, 100};

		
		System.out.println(kthElementOptimised(arr11, arr22, arr11.length, arr22.length, 6));
	
		
/**
 * int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
 */
	}
	
	public static long kthElementOptimised( int arr1[], int arr2[], int n, int m, int k) 
    {
        int count = 0;
        
        if(count == k-1)
        {
        	
        }
        int i=0, j=0;
        while(i <n && j <m)
        {
        	if(arr1[i] < arr2[j])
        	{
        		i++;
        		count++;
        		
        	}
        	else
        	{
        		j++;
        		count++;
        	}
        	if(count == k-1 && i<n && j<m )
    		{
    			return Math.min(arr1[i], arr2[j]);
    		}
        	
        	
        }
        if(i == n)
        {
        	if(j <m)
        	{
        		return Math.min(arr2[j+1], arr2[j]);
        	}
        	else
        		return arr2[j];
        	
        }
        if(j == m)
        {
        	if(i <n)
        	{
        		return Math.min(arr1[i+1], arr1[i]);
        	}
        	else
        		return arr1[i];
        	
        }
        return 0;
    }
	public static long kthElement( int arr1[], int arr2[], int n, int m, int k) 
    {
        int []arr = new int[m+n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = arr1[i];   
        }
        for(int i=0;i<m;i++)
        {
            arr[n+i] = arr2[i];   
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
	
	

}
