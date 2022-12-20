package com.striver.day11;

public class SingleNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,2,3,3,4,4,8,8};
		int[] nums1 = {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate(nums));
		System.out.println(singleNonDuplicate(nums1));
	}
	
	   public static int singleNonDuplicate(int[] nums) 
	    {
	        int l =0;int r = nums.length-1;
	        
	        while(l<=r)
	        {
	            int mid = l+ (r-l)/2;
	            
	            if(mid ==0 || mid == nums.length-1)
	            {
	                return nums[mid];
	            }
	            
	            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
	            {
	                 return nums[mid];
	            }
	            else if(nums[mid] == nums[mid-1])
	            {
	                if(mid %2 ==0)
	                {
	                    r = mid-2; 
	                }
	                else
	                {
	                    l = mid+1;
	                }
	            }
	            else
	            {
	                if(mid%2 == 0)
	                {
	                    l = mid+2;
	                }
	                else
	                {
	                    r = mid-1;   
	                }
	            }
	        }
	        return -1;
	    }

}
