package com.practice;

import java.util.Arrays;

public class UniqueElementsArray {

	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		int unique = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if (nums[i] == nums[j]) {
					nums[j] = Integer.MAX_VALUE;
				} else {
					break;
				}
			}

		}
		Arrays.sort(nums);

		for (int i = 0; i < len; i++) {
			if (nums[i] == Integer.MAX_VALUE) {
				break;
			}
			unique++;
		}

		return unique;
	}
	
	public static void main(String[] args)
	{
		int []arr = {1,1,2};
		int []arra = {0,0,1,1,1,2,2,3,3,4};
		int []arrb = {1,2};
		int []arrc = {1,1};
		
	//	System.out.println(new UniqueElementsArray().removeDuplicates(arr));
		//System.out.println(new UniqueElementsArray().removeDuplicates(arra));
		System.out.println(new UniqueElementsArray().removeDuplicates(arrc));
	}
}
