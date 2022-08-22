package com.ds;

public class BinarySearchTestProgram {
	
	public static void main(String[] args)
	{
		int arr[] = {10,30,54,78,97};
		
		BinarySearchTestProgram bstp = new BinarySearchTestProgram(); 
		int op = bstp.binarySearch(arr, 0, arr.length-1, 117);
		
		System.out.println(op);
	}
	
	int binarySearch(int[] arr, int l, int r,int x)
	{
		if(r>=l)
		{
			int mid = l + (r - l) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else if (arr[mid] < x) {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		
		return -1;
	}

}
