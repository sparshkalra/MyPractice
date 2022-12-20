package com.striver.day1;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pascalTriangle(5));
	}
	
	public static List<List<Integer>> pascalTriangle(int numRows)
	{
		List<List<Integer>> output = new ArrayList<>(numRows);
		for(int i=0;i<numRows;i++)
		{
			output.add(new ArrayList<Integer>(i));
		}
		for(int i=0;i<numRows;i++)
		{
			for (int j = 0; j <= i; j++) 
			{

				if (j == 0)
					output.get(i).add(1);
				else if (j == i)
					output.get(i).add(1);
				else
					output.get(i).add(output.get(i - 1).get(j) + output.get(i - 1).get(j - 1));
			}
		}
    return output;
    
	}

}
