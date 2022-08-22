package com.practice;

public class SquareRoot {

	public static void main(String[] args) {
		
	//	System.out.println(mySqrt(8));
		System.out.println(mySqrt(6));
		System.out.println(mySqrt(2));
		
		int[] arr = {3,6,8};
		
		System.out.println(convertArrayToNum(arr));

	}

	public static int mySqrt(int x) 
	{
		if(x==0)
			return 0;
		int start = 1;
		int end = x;
		int op = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid * mid == x) {
				return mid;
			} else if (mid * mid > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
				op = mid;
			}
		}
		return op;
	}
	
	public static int convertArrayToNum(int[]arr)
	{
		int op = 0;
		
		for(int i =0;i < arr.length;i++)
		{
			op = op*10 + arr[i];
		}
		
		return op;

	}

}
