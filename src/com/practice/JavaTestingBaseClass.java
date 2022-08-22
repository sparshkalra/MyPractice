package com.practice;

import java.io.IOException;


public abstract class JavaTestingBaseClass 
{
	String classDef = "I am parent";
	
	public int i;
	public JavaTestingBaseClass()
	{
		
	}
	public String method1(int a, int b)
	{
		System.out.println("abc");
		
		return null;
	}
	
	public void methodA()
	{
		System.out.println("Parent method a");
	}
	public void methodB()
	{
		this.methodA();
		System.out.println("Parent method b");
	}
	

	
	
	
}
