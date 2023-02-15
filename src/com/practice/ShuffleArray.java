package com.practice;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,1,3,4,7};
		
		System.out.println(Arrays.toString(shuffle(arr, 3)));
	}

	public static int[] shuffle(int[] nums, int n) 
    {
        int[]op = new int[nums.length];
        int count =0;
        op[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(i%2 !=0)
            {
                op[i] = nums[count+n];
                count++;
            }
            else
                op[i] = nums[count];
            
        }
        return op;
    }
}
