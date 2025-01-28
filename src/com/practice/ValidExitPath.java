package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ValidExitPath {
	static boolean output = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] arr = {
		{ 0, 0, 0, -1, 0}, 
		{-1, 0, 0, -1, -1}, 
		{ 0, 0, 0, -1, 0}, 
		{-1, 0, 0, 0, 0}, 
		{ 0, 0, -1, 0, 0}};
System.out.print(isPathValid(arr));

int[][]arr1 = {
		{ 0, 0, 0, -1, 0}, 
		{-1, 0, 0, -1, -1}, 
		{ 0, 0, 0, -1, 0}, 
		{-1, 0, -1, 0, 0}, 
		{ 0, 0, -1, 0, 0}} ;

System.out.println(isPathValid(arr1));
	}
	
	


	public static boolean isPathValid(int[][] arr)
	{
		Queue<PairExit> q = new LinkedList<PairExit>();
		q.add(new PairExit(0, 0));
		
		int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
		
		while(q.isEmpty() == false)
		{
			PairExit obj = q.peek();
			
			q.poll();
			
			arr[obj.x][obj.y] = -1;
			if(obj.x == arr.length-1 && obj.y == arr[0].length-1)
			{
				return true;
			}
			
			for(int i=0;i<4;i++)
			{
				int a = obj.x+dir[i][0];
				int b = obj.y+dir[i][1];
				
				if(isSafe(a,b,arr) && arr[a][b] !=-1)
				{
					if(a == arr.length-1 && b == arr[0].length-1)
					{
						return true;
					}
					q.add(new PairExit(a, b));
				}	
			}
			
		}
		
		return false;
	}
	
	public static boolean isSafe(int i, int j, int[][]arr)
	{
		if(i <0 || i >=arr.length || j<0 || j>=arr[0].length)
		{
			return false;
		}
		return true;
	}
	
}

class PairExit
{
	int x;
	int y;
	public PairExit(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
