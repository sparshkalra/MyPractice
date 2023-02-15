package com.practice;

public class CoinStairs {

	public static void main(String[] args) 
	{
		System.out.println(arrangeCoins(7));
	}
	
	public static int arrangeCoins(int n) 
    {
        if(n<2)
        {
            return n;
        }
        int n2= n;
        int op =0;
        for(int i=1;i<n2;i++)
        {
            if(i >n)
            {
                return op;
            }
            n = n-i;
            op++;
            
        }
        return op;    
    }

}
