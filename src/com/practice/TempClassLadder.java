package com.practice;

public class TempClassLadder 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(doStuff(args));
		}
		catch(Exception e)
		{
			System.out.println("Hi");
			doStuff(args);
		}
		
	}
	
	static int doStuff(String[] args)
	{
		return Integer.parseInt(args[0]);
	}
}
