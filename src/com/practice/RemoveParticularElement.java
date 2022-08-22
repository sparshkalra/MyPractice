package com.practice;

public class RemoveParticularElement 
{
	 public int removeElement(int[] nums, int val) 
	    {
	        int len = nums.length;
	        int count = 0;
	        
	        for(int i=0; i< len; i++)
	        {
	            if(nums[i] !=  val)
	            {
	               nums[count] = nums[i]; 
	                count++;
	            }
	        }
	        
	        return count;
	        
	    }
	 
	 public static void main(String[] args)
	 {
		 int[] arr1 = {3,2,2,3};
		 
		 int[] arr2 = {0,1,2,2,3,0,4,2};
		 
		 RemoveParticularElement rpe = new RemoveParticularElement();
		 
		 rpe.removeElement(arr1, 3);
		 rpe.removeElement(arr2, 2);
		 
		 
	 }
}
