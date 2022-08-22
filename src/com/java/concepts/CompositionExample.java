package com.java.concepts;

public class CompositionExample 
{
	private ChildClass obj;
	
	public CompositionExample() {
		
		obj = new ChildClass();
	}
	public static void main(String[] args)
	{
		CompositionExample ce = new CompositionExample();
		ce.test();
		System.out.println(ce.hashCode());
	}
	
	void test()
	{
		obj.test();
	}
	
	class ChildClass
	{
		private ChildClass()
		{
			
		}
		public void test()
		{
			System.out.println("Reached child class");
		}
	}
	
}
