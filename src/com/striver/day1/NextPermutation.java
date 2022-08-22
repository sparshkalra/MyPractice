package com.striver.day1;

public class NextPermutation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] nums = {1,3,2};
		new NextPermutation().nextPermutation(nums);
	}

	/*
	 * Find 1st number less than next(start from back) Then find 1st no greater than number found in
	 * 1st step Then reverse the array from 1st number to end
	 */
	public void nextPermutation(int[] nums) 
	{
		 if(nums ==null || nums.length <= 1)
	     {
	          return;
	     }
		int ind = 0, n = nums.length;
		boolean flag=false;
		
		//Find 1st number smaller than next starting from back
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i] < nums[i+1])
			{
				ind = i;
				flag = true;
				break;
				
			}
		}
		// If number is increasing order only, then return smallest.
		if (flag == false) {
			reverse(nums, ind, n - 1);
			System.out.print(nums);
			return;
		}

		//Swap 1st number greater than index number with index number
		for (int i = n - 1; i >= 0; i--) 
		{
			if (nums[i] > nums[ind]) 
			{
				int temp = nums[i];
				nums[i] = nums[ind];
				nums[ind] = temp;
				break;
			}
		}

		reverse(nums, ind + 1, n - 1);

		System.out.print(nums);

	}

	public void reverse(int a[], int l, int h) {
		while (l < h) {
			int temp = a[l];
			a[l] = a[h];
			a[h] = temp;
			l++;
			h--;
		}
	}
}
