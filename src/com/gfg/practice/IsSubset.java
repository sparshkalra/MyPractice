package com.gfg.practice;

import java.util.Arrays;

public class IsSubset 
{
	public static void main(String[] args)
	{
		long[] a1 = {8, 4, 5, 3, 1, 7, 9};
		long[] a2 = {5, 1, 3, 7, 9};
		System.out.println(isSubset(a1,a2,a1.length,a2.length));
		
		
	}
	
	public static String isSubset( long a1[], long a2[], long n, long m) 
    {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int k = 0;
        
        for(int i=0;i<n;i++)
        {
            if(k == m)
            {
                return "Yes";
            }
            if(a1[i] == a2[k])
            {
                k++;
            }
        }
        if(k == m)
        {
            return "Yes";
        }
        return "No";
        
    }
}
