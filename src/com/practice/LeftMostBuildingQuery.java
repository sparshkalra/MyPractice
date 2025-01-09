package com.practice;

import java.util.Arrays;

public class LeftMostBuildingQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] heights = {6,4,8,5,2,7};
		int[][]queries = {{0,1},{0,3},{2,4},{3,4},{2,2}};
		
		System.out.println(Arrays.toString(leftmostBuildingQueries(heights, queries)));
	}
	public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) 
    {
		int[] opArr = new int[queries.length];
	    int k=0;
	    for(int[] query:queries)
	    {
	    	 int op = Integer.MAX_VALUE;
	         int alice = query[0];
	         int bob = query[1];
	         int max = Math.max(alice, bob);
	         if(alice == bob)
	         {
	        	 opArr[k] = alice;
	             k++;
	        	 continue;
	         }
	         else if(heights[max] > heights[Math.min(alice,bob)])
	         {
	            opArr[k] = max;
	            k++;
	            continue;
	         }
	         
	         
	         for(int i=max;i<heights.length;i++)
	         {
	        	 boolean flag = false;
	        	 if(flag)
	        	 {
	        		 break;
	        	 }
	        	 for(int j=i+1;j<heights.length;j++)
	        	 {
	        		 if(heights[j] > heights[i] && heights[j] > heights[alice] && heights[j] > heights[bob])
	        		 {
	                         op = Math.min(op,j);
	                         flag = true;
	                         break;
	        		 }
	        	 }
	        	 
	         }
	         if(op == Integer.MAX_VALUE)
	         {
	             opArr[k] = -1;
	         }
	         else
	         {
	             opArr[k] = op;
	         }
	         k++;
	         
	    } 
	    	return opArr;
    }

}
