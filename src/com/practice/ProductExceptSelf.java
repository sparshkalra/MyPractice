package com.practice;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        int product = 1;
        for(int i=0; i<n; i++){
            product *= nums[i];
            output[i] = product;
        }

        product = 1;
        for(int i=n-1; i>0; i--){
            output[i] = output[i-1] * product;
            product *= nums[i];
        }
        output[0] = product;
        return output;
    }

}
