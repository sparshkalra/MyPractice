package com.practice;

public class DBTemp {

	public static void main(String[] args) 
	{
		new B2().add();
		int num,String value;
		boolean a,b;
		double d1,double d2;
		int h;j;
	
	}
	void printNumber()
	{
		System.out.println("ABC");
	}

}

class B1
{
	public B1() {
		
	}
	private int a = 10;
	protected int b = 30;
	
	protected void sum()
	{
		new B1().get();
	}
	private void get() {
		System.out.println(a+b);
	}
}

class B2 extends B1
{
	protected int c = 10;
	
	protected void add()
	{
		sum();
	}
}
