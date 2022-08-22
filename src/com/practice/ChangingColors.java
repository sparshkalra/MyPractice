package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChangingColors 
{

	public static void main(String[]args)
	{
		
		
		
		
		/*List<Integer> a = new ArrayList<Integer>();
		a.add(1);a.add(2);a.add(3);
		a.stream().map(i -> i+42);
		
		System.out.println(a);
		a.stream().map(i -> i =42);
		System.out.println(a);*/
		
		/*String text = null;
		File file = new File("/mettlFolder", text);
		try
		{
			file.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		ChangingColors obj = new ChangingColors();
		
		int[][] input3 = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,1,0}, {0,0,0,0,0,0}, {0,0,0,1,0,0}};
		
	//	System.out.println(obj.changingColors(2, 3, input3)+1);
		
	}
	public int changingColors(int input1, int input2, int[][]input3)
	{
		Res11 res = new Res11();
		res.val = 0;
		changingColors(input1, input2, input3, res);
		if(res.isFOund)
		{
			return res.val;
		}
		return -1;
	}
	public void changingColors(int input1, int input2, int[][]input3, Res11 res)
	{
		
		for(int i=0;i<input3[0].length;i++)
		{
			if(input3[input1][i] ==1)
			{
				if(i == input2)
				{
					res.isFOund = true;
					return;
				}
				else
				{
					res.val++;
					changingColors(i,input2,input3,res);
				}
			}
		}
	}
}

class Res11
{
	int val;
	boolean isFOund = false;
}


