package com.striver.day2;

import java.util.Arrays;

public class InversionCount {
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		System.out.println(new InversionCount().inversionCount(a));
	}

	public int inversionCount(int[] a) {
		return mergeSort(a, 0, a.length - 1);
	}

	int mergeSort(int[] a, int l, int r) {
		int m = 0;
		int invCount = 0;

		if (r > l) {
			m = (r + l) / 2;

			invCount = invCount + mergeSort(a, l, m);
			invCount = invCount + mergeSort(a, m + 1, r);

			invCount = invCount + merge(a, l, m, r);
		}

		return invCount;
	}

	int merge(int[] arr, int l, int m, int r) {
		int[] left = Arrays.copyOfRange(arr, l, m + 1);

// Right subarray
		int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

		int i = 0, j = 0, k = l, swaps = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				arr[k++] = left[i++];
			else {
				arr[k++] = right[j++];
				swaps += (m + 1) - (l + i);
			}
		}
		while (i < left.length)
			arr[k++] = left[i++];
		while (j < right.length)
			arr[k++] = right[j++];
		return swaps;
	}
}
