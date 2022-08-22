package com.multithreading;

public class ThreadCreationTest extends Thread{

	public static void main(String[] args) 
	{
		
		ThreadCreationTest t1 = new ThreadCreationTest();
		ThreadCreationTest t2 = new ThreadCreationTest();
		
		t1.run();
		t2.run();
		
		

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("My thread");
	}

}
