package com.practice;

public class IntegerBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		https://leetcode.com/problems/integer-break/
		System.out.println(integerBreak(11));
		
	}
	
	public static int integerBreak(int n) 
	{
		int[] dp = new int[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; 2 * j <= i; j++) {
				dp[i] = Math.max(dp[i], (Math.max(j, dp[j])) * (Math.max(i - j, dp[i - j])));
			}
		}
		return dp[n];
	}
	
	public static int integerBreak2(int n) {
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int product = 1;
		while (n > 4) {
			product *= 3;
			n -= 3;
		}
		product *= n;

		return product;
	}

}
