package com.practice;

import java.util.Arrays;

public class StonesGame {

	public static void main(String[] args) 
	{
		int[] stones = {2,7,4,1,8,1};
		
		System.out.println(lastStoneWeight(stones));

	}
	
	public static int lastStoneWeight(int[] stones) 
    {
        if(stones.length == 1)
            return stones[0];
        
        Arrays.sort(stones);
        
        int l=0;
        int r = stones.length-1;
        while(l <r)
        {
            stones[r-1] = stones[r] - stones[r-1];
            r--;
        }
        return stones[r];
    }

}
