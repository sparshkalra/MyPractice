package com.striver.day11;

public class MinElementInSortedRotatedArray {

	public static void main(String[] args) {
		
		 int arr6[] =  {};
		 int[] arr = {2,3,4,5,1};
	        int n6 = arr6.length;
	       System.out.println("The minimum element is "+ findMin(arr));
	       //System.out.println("The minimum element is "+ findMin(arr6));
	        int[] arrFindMin = {4,5,6,7,0,1,2};
	        int[] arrFindMin2 = {3,1};
	        int target = 9;
	        
	        System.out.println(search2(arrFindMin,1));
	       //System.out.println(search2(arrFindMin2, 1));
	}
	
	public static int findMin(int[]arr)
	{
		
		int low = 0;
		int high = arr.length -1;
		
		while(low <=high)
		{
			int mid = low + (high - low)/2;
			
			if(mid < high && arr[mid+1] < arr[mid])
			{
				return arr[mid+1];
			}
			if(mid > low && arr[mid] < arr[mid-1])
			{
				return arr[mid];
			}
			if(arr[mid] > arr[low])
			{
				low = mid+1;
			}
			else
			{
				high = mid -1;
			}
		}
		return arr[0];
		
	}


    public static int search2(int[] nums, int target)
    {
    	int low =0;
    	int high = nums.length-1;
    	
    	while(low <= high)
    	{
    		int mid = low+ (high-low)/2;
    		
    		if(target == nums[mid])
    		{
    			return mid;
    		}
    		if(nums[mid] >= nums[low])
    		{
    			if(target >= nums[low] && target < nums[mid])	
    			{
    				high = mid-1;
    			}
    			else
    			{
    				low = mid+1;
    			}
    		}
    		else
    		{
    			if(target <= nums[high] && target > nums[mid])
    			{
    				low = mid+1;
    			}
    			else
    			{
    				high = mid-1;
    			}
    		}
    	}
    	
    	return -1;
    	
    }

 
    
    private static int search2(int[]nums, int target, int low, int high)
    {
    	
    	int mid = low+(high - low)/2;
    	
    	if(low > high)
    	{
    		return -1;
    	}
    	
    	if(nums[mid] == target)
    	{
    		return mid;
    	}
    	
    	
    	// 7 1 2 3 4 5 6
    	
    	
    	
    	if(nums[mid] >= nums[low])
    	{
    		if(target >= nums[low] && target < nums[mid])
    		{
    			return search2(nums, target, low, mid-1);
    		}
    		else
    		{
    			return search2(nums, target, mid+1, high);
    		}
    	}
    	else
    	{
    		if(target <= nums[high] && target > nums[mid])
    		{
    			return search2(nums, target, mid+1, high);
    		}
    		else
    		{
    			return search2(nums, target, low, mid-1);
    		}
    	}    		
    }
    
    public static int search(int[] nums, int target) 
	{
        int l = 0, r = nums.length-1;
        while(l<r)
        {
            int mid = (int)(l+r)/2;
            if(nums[mid] > nums[l] && nums[mid] > nums[r])
            	l = mid;
            else  r = mid;
        }
        int res = 0;
        if(target <= nums[r] && target >= nums[0]) 
        	res = binarySearch(nums, 0, r, target);
        else res = binarySearch(nums, r+1, nums.length-1, target);
        
        return res;
    }
    private static int binarySearch(int[] nums, int l, int r, int target){
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) 
            	l = mid+1;
            else
            	r = mid-1;
        }
        return -1;
    }

}
