package com.design.pattern;

public class DeutscheBank implements SubInterface{

	public static void main(String[] args) {
		
		DeutscheBank ob = new DeutscheBank();
		ob.proc1();
		ob.proc2();
		ob.proc3();
	
	}
	public void proc1()
	{
		System.out.println("React");
	}
	public void proc2()
	{
		System.out.println("Java");
	}
	public void proc3()
	{
		System.out.println("Python");
	}
	static void testFunction() throws IllegalAccessException
	{
		System.out.println("Inside Test Function");
		throw new IllegalAccessException("Error::Java");
	}

}

interface SupInterface
{
	void proc1();
	void proc2();
}
interface SubInterface extends SupInterface
{
	void proc3();
}