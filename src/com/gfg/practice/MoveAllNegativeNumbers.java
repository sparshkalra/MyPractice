package com.gfg.practice;

import java.util.Arrays;

public class MoveAllNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		move(arr);
		
		
	}
	
	public static void move(int[] arr)
    {
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] <0)
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));
    }

}
