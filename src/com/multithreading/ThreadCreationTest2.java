package com.multithreading;

import java.util.concurrent.Callable;

public class ThreadCreationTest2{

	
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		Thread t2 = new Thread();
		
	}

}
