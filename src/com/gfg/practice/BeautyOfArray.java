package com.gfg.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BeautyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {4,6,1,2};
		int[]b = {1,1,1,1};
		int[]c = {49,26};
		System.out.println(maximumBeauty(a, 2));
		System.out.println(maximumBeauty(b, 10));
		System.out.println(maximumBeauty(c, 12));
	}
	
	public static int maximumBeauty(int[] nums, int k) 
    {
		int[] freq = new int[300001];
		for(int i=0; i<nums.length; i++)
		{
			int left = Math.max(nums[i]-k,0); 
			int right = nums[i]+k;
			freq[left]++;
			freq[right+1]--;
		}
		int max = freq[0];
		for(int i=1; i<freq.length; i++)
		{
		//add to have final frequency
			freq[i]+=freq[i-1];
			max = Math.max(freq[i],max);
		}
		return max;
    }

}
