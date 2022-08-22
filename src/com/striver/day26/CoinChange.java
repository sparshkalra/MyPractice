package com.striver.day26;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[]args)
	{
		int[] a = {1,2,5};
		int[] b = {186,419,83,408};
				
		System.out.println(coinChange(b, 6249));
	}
    public static int coinChange(int[] coins, int amount) 
    {
        Arrays.sort(coins);
        int op =0;
        boolean flag = true;
        while(flag)
        {
            flag = false;
            for(int i = coins.length-1;i>=0;i--)
            {
                int value = coins[i];
            
                if(amount <value)
                {
                    continue;
                }
                int div = amount/value;
                flag = true;
                amount = amount - div*value;
                op = op+div;
            }   
        }
        
        if(amount !=0)
        {
            return -1;
        }
        return op;
    }
}
