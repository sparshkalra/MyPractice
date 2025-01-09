package com.striver.day26;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[]args)
	{
		int[] a = {2,5};
		int[] b = {186,419,83,408};
				
		System.out.println(coinChange(a, 23));
	}
    public static int coinChange(int[] coins, int amount) 
    {
    	int[] dp = new int[amount + 1];
        for (int i=1; i < dp.length; i++) {
          dp[i] = dp.length;
          for (int j=0; j < coins.length; j++) {
            if (i >= coins[j])
            {
            	dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
            }
            	
          }
        }
        if(dp[amount] == dp.length)
        {
        	return -1;
        }
        return dp[amount];
    }
}
