package com.multithreading;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arrFindMin = {4,5,6,7,0,1,2};
		 
		 System.out.println(findElement(arrFindMin, 6));
		 
		 System.out.println(findMinElement(arrFindMin));
	}
	
	public static int findElement(int[]arr, int k)
	{
		int low = 0, high = arr.length-1;
		while(high>=low)
		{
			int med = (low+ high)/2;
			
			if(k == arr[med])
			{
				return med;
			}
			if(arr[med] >= arr[low])
			{
				if(k >= arr[low] && k<=arr[med])
				{
					
					high = med-1;
				}
				else
				{
					low = med+1;
				}
			}
			else
			{
				if(arr[high] >=k && arr[med]<=k)
				{
					low = med+1;
				}
				else
				{
					high= med-1;
				}
			}
		}
		return -1;
	}
	
	//4,5,6,7,0,1,2
	
	public static int findMinElement(int[]nums)
	{
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) 
		{
			int mid = low + (high - low) / 2;

			if (mid < high && nums[mid + 1] < nums[mid]) {
				return nums[mid + 1];
			}
			if (mid > low && nums[mid] < nums[mid - 1]) {
				return nums[mid];
			}
			if (nums[mid] > nums[low]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return nums[0];
	}

}
