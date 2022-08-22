package com.practice;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };

		moveZeroes(nums);

	}

	public static void moveZeroes(int[] nums) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			} else {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			nums[nums.length - 1 - i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

}
