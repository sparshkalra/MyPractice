package com.practice;

import java.util.Arrays;

public class MaximumRcks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[][]input = {{0,0,0,0,5},{0,1,1,1,0},{2,0,0,0,0}};
			
			System.out.println(optimalPath(input));
	}
	
	public static int optimalPath(int[][] grid) {
	    // Todo: Implement optimalPath
	    int row = grid.length;
	    int col = grid[0].length;
	    int[][] dp = new int[row][col];

	    for(int i=0; i<row;i++)
	    {
	        for(int j=col-1;j>=0;j--)
	        {
	            if(i == 0 && j == col-1)
	            	dp[i][j] = grid[i][j];
	            else if(i == 0)
	            	dp[i][j] = grid[i][j] + dp[i][j+1];
	            else if(j==col-1)
	            	dp[i][j] = grid[i][j] + dp[i-1][j];
	            else 
	            	dp[i][j] = grid[i][j] + Math.max(dp[i-1][j], dp[i][j+1]);
	        }
	    }
	    return dp[row-1][0];
	  }

}
