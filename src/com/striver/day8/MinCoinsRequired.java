package com.striver.day8;

import java.util.ArrayList;
import java.util.List;

public class MinCoinsRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static List<Integer> minPartition(int N)
    {
        List<Integer> op = new ArrayList<Integer>();
        
        int[] coins = {1,2,5,10,20,50,100,200,500,2000};
        
        for(int i=coins.length-1;i>=0;i--)
        {
            int coin = coins[i];
            
            while(N >= coin)
            {
                N = N - coin;
                op.add(coin);
            }
        }
        return op;
    }

}
