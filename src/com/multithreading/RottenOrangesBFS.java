package com.multithreading;

import java.util.Queue;

public class RottenOrangesBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{2, 1, 0, 2, 1},
         	   {1, 0, 1, 2, 1},
         	   {1, 0, 0, 2, 1}};
	
	int[][]arr1 = 	{ {2, 1, 0, 2, 1},
     {0, 0, 1, 2, 1},
     {1, 0, 0, 2, 1}};
	
	System.out.println(rottenOranges(arr));
	System.out.println(rottenOranges(arr1));
	}
	
	public static int rottenOranges(int[][]grid)
	{
		int fresh=0;
		Queue<int[]> q = new java.util.LinkedList<int[]>();

		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j] == 2)
				{
					q.offer(new int[] {i,j});
				}
				if(grid[i][j] !=0)
				{
					fresh++;
				}
			}
		}
		if(fresh ==0)
		{
			return 0;
		}
		int[]dx = {0,0,1,-1};
		int[]dy = {-1,1,0,0};
		
		int countMin = 0;
		int cnt=0;
		while(q.isEmpty() == false)
		{
			int size = q.size();
            cnt += size; 
			
			for(int i = 0 ; i < size ; i++) 
			{
				int[] temp = q.peek();
				q.remove();
				for(int j=0;j<4;j++)
				{
					int temp1 = temp[0]+dx[j];
					int temp2 = temp[1]+dy[j];
					
					if(temp1<0 || temp1 >grid.length-1 || temp2 <0 || temp2 >grid[0].length-1 || grid[temp1][temp2] ==0
							||grid[temp1][temp2] ==2)
					{
						continue;
					}
					else
					{
						grid[temp1][temp2] =2;
						q.offer(new int[] {temp1, temp2});
					}
				}
			}
			
			if(q.size() >0)
			{
				countMin++;
			}	
		}
		return fresh == cnt ? countMin : -1;
				
				
	}

}
