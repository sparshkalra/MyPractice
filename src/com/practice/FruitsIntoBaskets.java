package com.practice;

import java.util.HashMap;
import java.util.Map;


//https://leetcode.com/problems/fruit-into-baskets/
public class FruitsIntoBaskets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int[] arr1 = {0,1,2,2};
		int[] arr2 = {1,2,3,2,2};
		int[] arr3 = {1,1,2,3,2,2};
		//System.out.println(totalFruit2(arr));
		//System.out.println(totalFruit2(arr1));
		//System.out.println(totalFruit2(arr2));
		System.out.println(totalFruit2(arr3));

	}
	
	public static int totalFruit2(int[] fruits) {
        int n = fruits.length, ans = 0, i = 0, j = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while (j < n) 
        {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);
            while (mp.size() > 2) 
            {
                mp.put(fruits[i], mp.get(fruits[i]) - 1);
                if (mp.get(fruits[i]) == 0) {
                    mp.remove(fruits[i]);
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
