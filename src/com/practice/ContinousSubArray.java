package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArray {

	public static void main(String[] args) {
		int[]nums = {5,4,2,4};
		
		System.out.println(continuousSubarrays(nums));

	}
	public static long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int j = 0;
        long cnt = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while ((i - j + 1) > getCount(nums[i], map)) {
                map.put(nums[j], map.get(nums[j]) - 1);

                j++;
            }

            cnt += (i - j + 1);
        }

        return cnt;
    }
	 private static int getCount(int num, Map<Integer, Integer> map) {
	        return map.getOrDefault(num, 0) + map.getOrDefault(num - 1, 0) +
	            map.getOrDefault(num + 1, 0) + map.getOrDefault(num - 2, 0) +
	            map.getOrDefault(num + 2, 0);
	    }

}
