package com.design.pattern;

import com.practice.Exam;

public class ExamImpl 
{
/*	public ExamImpl(int a,int b)
	{
		super(a,b);
	}
	public static void main(String[] args)
	{
		ExamImpl e = new ExamImpl(15, 10);
		e.add();
	}*/
	
	public static void main(String[] args)
	{
		try
		{
			int i,sum;
			sum = 10;
			for(i = -1;i < 3;++i)
			{
				sum = sum/i;
				System.out.print(i);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print(0);
		}
	}
}
