package com.striver.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 
{
	public static void main(String[]args)
	{
		// Element more than n/3
		int[] nums = {3,2,3};
		int[] nums1 = {1};
		int[] nums2 = {1,2};
		int[] nums3 = {3,2,3,2};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement(nums1));
		System.out.println(majorityElement(nums2));
		System.out.println(majorityElement(nums3));

	}
	 public static List<Integer> majorityElement(int[] nums) 
	    {
	        Arrays.sort(nums);
	        int lenReq = nums.length/3;
	        List<Integer> op = new ArrayList<>();
	        int count =1;
	        for(int i=0;i<nums.length;i++)
	        {
	            while(i <nums.length-1 && nums[i] == nums[i+1])
	            {
	                count++;
	                i++;
	            }
	            if(count > lenReq)
	            {
	                op.add(nums[i]);
	            }
	            count =1;
	        }
	        return op;
	    }
	 
	 public List majorityElementOptimized(int[] nums) {
		 int candidate1=0,candidate2=0,count1=0,count2=0;
		 int n=nums.length;
		 for(int i=0;i<nums.length;i++){

		         if(candidate1==nums[i]){
		             count1+=1;
		         }
		         else if(candidate2==nums[i]){
		             count2+=1;
		         }
		         else if(count1==0){
		             candidate1=nums[i];
		             count1=1;
		         }
		         else if(count2==0){
		             candidate2=nums[i];
		             count2=1;
		         }
		         else{
		             // dont forget this step wasted around 10 minutes
		             // focus while coding
		             count1-=1;
		             count2-=1;
		         }
		         
		     }
		     System.out.println(count1+" bu "+count2);
		     count1=count2=0;
		     for(int i=0;i<nums.length;i++){
		         if(candidate1==(nums[i])){
		             count1+=1;
		         }
		        else if(candidate2==(nums[i])){
		             count2+=1;
		         }
		     }
		     List <Integer> l = new ArrayList<>();
		     if(count1>(n/3))
		         l.add(candidate1);
		     if(count2>(n/3))
		         l.add(candidate2);
		     
		     return l;
		     
		     
		 }
}
