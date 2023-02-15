package com.practice;

public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
		
		System.out.println(lemonadeChange(arr));
	}
	public static boolean lemonadeChange(int[] bills) 
    {
        int[]coins = new int[3];

        for(int i:bills)
        {
            if(i == 5)
            {
                coins[0]++;
            }
            else if(i == 10)
            {
                coins[1]++;
                if(coins[0] == 0)
                {
                    return false;
                }
                else
                {
                    coins[0]--;
                }
            }
            else if(i == 20)
            {
                coins[2]++;
                if(coins[0] == 0)
                {
                    return false;
                }
                else if(coins[1] == 0 && coins[0] <3)
                {
                	 return false;
                }
                else
                {
                	if(coins[1] == 0)
                	{
                		coins[0] = coins[0] -3;
                	}
                	else
                	{
                		 coins[0]--;
                         coins[1]--;
                	}
                }                
            }
        }
        return true;    
    }

}
