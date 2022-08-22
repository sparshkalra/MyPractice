package com.striver.day1;

import java.util.HashSet;
import java.util.Set;

public class SetArrayElementsZero {

	public static void main(String[] args) 
	{
		int[][]arr = {{1,1,1},{1,0,1},{1,1,1}};
		int[][]arr1 = {{0,1,2,0},
					   {3,4,5,2},
					   {1,3,1,5}};
		
		setElementsToZero(arr1);

	}

	public static void setElementsToZero(int[][]matrix)
	{
		Set<Integer> row = new HashSet<Integer>();
		Set<Integer> coloumn = new HashSet<Integer>();
		
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j =0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] == 0)
				{
					row.add(i);
					coloumn.add(j);
				}
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			for(int j =0;j<matrix[0].length;j++)
			{
				if(row.contains(i) || coloumn.contains(j))
				{
					matrix[i][j] =0;
				}
			}
		}
	}
}
