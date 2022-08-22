package com.design.pattern;

public class Examp3 
{
	int a;int b=9;
	public static void main(String[] args) 
	{
		Examp3 e = new Examp3();
		System.out.println(e.sum()+e.result()+e.add());
	}
	public int sum()
	{
		return a+b;
	}
	private int add()
	{
		return a+b;
	}
	int result()
	{
		return new Examp3().add();
	}

}
