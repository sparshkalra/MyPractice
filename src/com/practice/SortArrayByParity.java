package com.practice;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,2,4};
		int[] arr1 = {0,2,1};
		//System.out.println(Arrays.toString(sortArrayByParity(arr)));
		System.out.println(Arrays.toString(sortArrayByParity(arr1)));

	}
	
	public static int[] sortArrayByParity(int[] nums) 
    {
        int[]op = new int[nums.length];

        int k=0;
        int odd = 0;
        for(int i:nums)
        {
            
            if(i%2 == 0)
            {
                op[k] = i;
                k++;
            }
            else
            {
                odd++;
            }
        }
        if(k == 0 || odd ==0)
        {
            return nums;
        }
        int l =0;
        for(int i:nums)
        {
            if(i%2 != 0)
            {
                op[l+k] = i;
                l++;
            }
        }
        return op;    
    }
}
