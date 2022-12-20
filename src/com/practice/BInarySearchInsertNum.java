package com.practice;

public class BInarySearchInsertNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,7,11,17,24,35};
		System.out.println(searchInsert(nums,18));
		System.out.println(searchInsert(nums,38));
		
	}	
	
	
	public static int searchInsert(int[] nums, int target) 
    {
        int l=0;
        int r = nums.length-1;
        
        while(l<=r)
        {
            int mid = l +(r-l)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return l;
    }

}
