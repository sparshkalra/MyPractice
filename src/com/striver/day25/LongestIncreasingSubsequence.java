package com.striver.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101,18};
		int[] nums1 = {0,1,0,3,2,3};
		int[] nums2 = {7,7,7,7,7,7,7};
		
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		
		System.out.println(lis.lengthOfLIS2(nums));
		System.out.println(lis.lengthOfLIS2(nums1));
		System.out.println(lis.lengthOfLIS2(nums2));

	}
	public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            int idx=bs(nums[i],list);
            if(idx==list.size())
            	list.add(nums[i]);
            else
            	list.set(idx,nums[i]);
        }
        return list.size();
    }
    
    public int bs(int target,List<Integer> list){
        int i=0,j=list.size()-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(list.get(mid)==target) 
            	return mid;
            else if(list.get(mid)<target) 
            	i=mid+1;
            else 
            	j=mid-1;
        }
        return i;
    }
    //N square solution
    //{10,9,2,5,3,7,101,18};
    /*
     * Count number of elements before it that are less than the number.
     */
    public int lengthOfLIS2(int[] nums) {
        if(nums == null || nums.length ==0) 
        	return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    dp[i] = Math.max(dp[i],dp[j] +1);
                }
            }
        }
        int m = 0;
        for(int c:dp){
            m = Math.max(m,c);
        }
        return m;
    }

}
