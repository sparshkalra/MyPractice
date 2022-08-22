package com.practice;

public class DeptchFirstIslandProblem 
{
	public static void main(String[] args)
	{
		int[][] water ={{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};
		
		int[][] water1 ={{0,1,0},{0,1,0},{0,0,0},{1,1,0},{1,0,1},{0,1,1},{1,1,1},{0,1,1},{1,0,1}};
		
		//System.out.println(findNoOfIslands(water));
		System.out.println(findNoOfIslands(water1));
	}
	
	public static int findNoOfIslands(int[][] arr)
	{
		int count =0;
		
		int rows = arr.length;
		int coloumns = arr[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloumns;j++)
			{
				if(arr[i][j] ==1)
				{
					System.out.println("Entering here for i and j " + i + " "+ j);
					count++;
					dfs(arr,rows,coloumns,i-1,j-1);
					dfs(arr,rows,coloumns,i-1,j);
					dfs(arr,rows,coloumns,i-1,j+1);
					dfs(arr,rows,coloumns,i,j-1);
					dfs(arr,rows,coloumns,i,j);
					dfs(arr,rows,coloumns,i,j+1);
					dfs(arr,rows,coloumns,i+1,j-1);
					dfs(arr,rows,coloumns,i+1,j);
					dfs(arr,rows,coloumns,i+1,j+1);
				}
			}
		}
		
		return count;
	}
	
	public static void dfs(int[][]arr, int rows,int coloumns,int i,int j)
	{
		if(i >=rows || j>=coloumns || i<0 || j<0 || arr[i][j] ==0)
		{
			return;
		}
		
		if(arr[i][j] ==1)
		{
			arr[i][j] =0;
			dfs(arr,rows,coloumns,i-1,j-1);
			dfs(arr,rows,coloumns,i-1,j);
			dfs(arr,rows,coloumns,i-1,j+1);
			dfs(arr,rows,coloumns,i,j-1);
			dfs(arr,rows,coloumns,i,j+1);
			dfs(arr,rows,coloumns,i+1,j-1);
			dfs(arr,rows,coloumns,i+1,j);
			dfs(arr,rows,coloumns,i+1,j+1);

		}
	}
}
