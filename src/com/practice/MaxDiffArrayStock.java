package com.practice;

public class MaxDiffArrayStock {

	public static void main(String[] args) {
		
		int[]prices = {7,1,5,3,6,4};
		System.out.println(maxProfitMultipleSales(prices));

	}
	
	public static int maxProfit(int[] prices) 
    {
        int op =0;
        int min =Integer.MAX_VALUE;
        for(int i=0; i < prices.length;i++)
        {
           if(prices[i] < min)
               min = prices[i];
            else if(prices[i] - min > op)
                op = prices[i] - min;
        }
        
        return op;
    }
	
	public static int maxProfitMultipleSales(int[] prices)
	{
		 int op=0;
	      for(int i=1; i< prices.length;i++)
	      {
	          if(prices[i] > prices[i-1])
	          {
	              op = op + prices[i] - prices [i-1];
	          }
	      }
	        return op;
	 }

}
