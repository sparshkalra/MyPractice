package com.practice;

public class LeftSumProblem {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5 };

		System.out.println(isSumEqual(arr));
	}

	public static boolean isSumEqual(int[] arr) {
		int right_sum = 0, left_sum = 0;
		// Maintains left cumulative sum
		left_sum = 0;
		int size = arr.length;

		// Maintains right cumulative sum
		right_sum = 0;
		int i = -1, j = -1;

		for (i = 0, j = size - 1; i < j; i++, j--) {
			left_sum += arr[i];
			right_sum += arr[j];

			// Keep moving i towards center until
			// left_sum is found lesser than right_sum
			while (left_sum < right_sum && i < j) {
				i++;
				left_sum += arr[i];
			}
			// Keep moving j towards center until
			// right_sum is found lesser than left_sum
			while (right_sum < left_sum && i < j) {
				j--;
				right_sum += arr[j];
			}
		}
		if (left_sum == right_sum && i == j)
			return true;
		else
			return false;
	}

}
