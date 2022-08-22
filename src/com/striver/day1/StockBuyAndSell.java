package com.striver.day1;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) 
    {
        int max = 0;
        int min =Integer.MAX_VALUE;
        for(int i=0;i< prices.length;i++)
        {
            if(prices[i] <min)
            {
                min = prices[i];
            }
            else
            {
                max = Math.max(max,prices[i]-min);
            }
        }
        return max;
    }

}
