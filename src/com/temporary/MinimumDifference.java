package com.temporary;

import java.util.Arrays;

public class MinimumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {1,5,0,10,14};
		
		System.out.println(minDifference(nums));
	}

    public static int minDifference(int[] nums) {
        if(nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        //0,1,5,10,14
        int ans = nums[nums.length - 1] - nums[0];
        for(int i = 0; i <= 3; i++) {
        	System.out.println("For i= "+i+" , left side number is :"+nums[i]+ " and right side number is :"+nums[nums.length - (3 - i) - 1]);
            ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
        }
        return ans;
    }
}
