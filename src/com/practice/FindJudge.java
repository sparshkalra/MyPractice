package com.practice;

import java.util.Arrays;

public class FindJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] trust = {{1,2},{2,3}};
		System.out.println(findJudge(3, trust ));
	}

	public static int findJudge(int n, int[][] trust) 
    {
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        for(int[] a:trust)
        {
            int val = a[0]-1;
            arr[val] = -1;
        }

        int count =0;
        int trusted = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
               count++;
               trusted = i+1;
            }
        }
        if(count !=1)
        {
            return -1;
        }
        Arrays.fill(arr,0);
        for(int[] a:trust)
        {
        	if(a[1] == trusted)
        	{
        		 int val = a[0]-1;
                 arr[val] = -1;
        	}
          
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0 && i !=trusted-1)
            {
            	return -1;
            }
        }
        return trusted;


    }
}
