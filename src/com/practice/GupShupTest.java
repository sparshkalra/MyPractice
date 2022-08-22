package com.practice;

public class GupShupTest {
	
	private static int x = 10;
	private static int y = 10;
	
	private GupShupTest() {
		this(5);
	}
	private GupShupTest(int x) {
		this(x,y);
	}
	private GupShupTest(int x, int y) {
		System.out.println(x * y);
	}
	
	public static void main(String[] args)
	{
		//GupShupTest t = new GupShupTest();
		
		getWork(Hacker.obj);
	}
	
	public static void getWork(Hacker obj)
	{
		obj.work();
	}

}


interface Hacker
{
	public void work();
	
	class Nowork implements Hacker
	{
		private Nowork()
		{
			System.out.println("a");
		}
		public void work()
		{
			System.out.println("b");
		}
	}
	
	Hacker obj = new Nowork();
}
