package com.striver.day27;

public class FindMAximumXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,10,5,25,2,8};
		System.out.println(findMaximumXOR(nums));	
	}
	public static int findMaximumXOR(int[] nums) 
    {
		int op = nums[0];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int xor = nums[i] ^ nums[j];
				
				op = Math.max(xor, op);
			}
		}
		return op;
    }

}
