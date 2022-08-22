package com.practice;

import java.util.HashSet;
import java.util.Set;

public class TestClass {

	
	
	//you have 3 elements let's say a, b & c and you have to create a method which will 
	//return any of these elements in a specified probability for example : a:b:c = .7:.2:.1
	
	//h:t 70:30
	public void returnValues() 
	{
		
	}

	
	
	
	public static void main(String[] args) 
	{
		int[][] arr =  {{5,3,0,0,7,0,0,0,0},
						{6,0,0,1,9,5,0,0,0},
						{0,9,8,0,0,0,0,6,0},
						{8,0,0,0,6,0,0,0,3},
						{4,0,0,8,0,3,0,0,1},
						{7,0,0,0,2,0,0,0,8},
						{0,6,0,0,0,0,2,8,0},
						{0,0,0,4,1,9,0,0,5},
						{0,0,0,0,8,0,0,7,9}};
		
		System.out.println(validSudoku(arr));
	}
	
	public static boolean validSudoku(int[][]arr)
	{
		
		//Assuming a square
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(! validSudoku(arr,i,j))
				{
					return false;
				}
			}
		}
		return true;
		
	}

	public static boolean validSudoku(int[][]arr, int i, int j)
	{
		return validSudokuRow(arr,i,j) && validSudokuCol(arr,i,j) && validSudokuBox(arr,i,j);
	}
	public static boolean validSudokuRow(int[][]arr, int row, int col)
	{
		Set<Integer> rowSet = new HashSet<Integer>();
		
		for(int i=0;i<9;i++)
		{
			if(rowSet.contains(arr[row][i]) && arr[row][i]!=0)
			{
				return false;
			}
			else
				rowSet.add(arr[row][i]);
		}
		return true;
	}
	public static boolean validSudokuCol(int[][]arr, int row, int col)
	{
		Set<Integer> colSet = new HashSet<Integer>();
		
		for(int i=0;i<9;i++)
		{
			if(colSet.contains(arr[i][col]) && arr[i][col]!=0)
			{
				return false;
			}
			else
			{
				colSet.add(arr[i][col]);
			}
		}
		return true;
		
	}
	public static boolean validSudokuBox(int[][]arr, int row, int col)
	{
		Set<Integer> boxSet = new HashSet<Integer>();
		int rowCheck =0;
		int colCheck = 0;
		
	
		if(row%3 == 0)
		{
			rowCheck = 3;
		}
		else if(row%3 == 1)
		{
			rowCheck = 2;
		}
		else
		{
			rowCheck = 1;
		}
		
		if(col%3 == 0)
		{
			colCheck = 3;
		}
		else if(col%3 == 1)
		{
			colCheck = 2;
		}
		else
		{
			colCheck = 1;
		}
		
		for(int i=0;i<rowCheck;i++)
		{
			for(int j=0;j<colCheck;j++)
			{
				int value = arr[row+i][col+j];
				
				if(boxSet.contains(value) && value!=0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
}

/*{5,3,0,0,7,0,0,0,0}
{6,0,0,1,9,5,0,0,0}
{0,9,8,0,0,0,0,6,0}
{8,0,0,0,6,0,0,0,3}
{4,0,0,8,0,3,0,0,1}
{7,0,0,0,2,0,0,0,6}
{0,6,0,0,0,0,2,8,0}
{0,0,0,4,1,9,0,0,5}
{0,0,0,0,8,0,0,7,9}

*/