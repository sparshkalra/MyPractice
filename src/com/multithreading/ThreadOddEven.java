package com.multithreading;

import java.util.concurrent.Callable;

public class ThreadOddEven {
	int i=1;
	
	public static void main(String[] args)
	{
		ThreadOddEven toe = new ThreadOddEven();
		
	
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			try {
				toe.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					toe.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
				
		t1.start();
		t2.start();
	}
	
	
	public void printOdd() throws InterruptedException
	{
		synchronized (this) 
		{
			while (i < 10) {
				if(i % 2 == 0) 
				{

					wait();
				}
				System.out.println(i);
				i++;
				notifyAll();

			}

		}
	}
	
	public void printEven() throws InterruptedException
	{
		synchronized (this) 
		{
			while (i < 10) {
				if(i % 2 != 0) 
				{

					wait();
				}
				System.out.println(i);
				i++;
				notifyAll();
			}

		}
		
	}
	
	
	
	
}
	

