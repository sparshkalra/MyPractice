package com.multithreading;

import java.util.concurrent.Callable;

public class ThreadOddEven {
	int i=1;
	
	
	/*
	 * employees.sort(Comparator.comparing(Employee::getSalary)
                         .thenComparing(Employee::getName));
	 */
	public static void main(String[] args)
	{
		ThreadOddEven toe = new ThreadOddEven();
		
		Runnable r1 = () ->
		{
			try {
				toe.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                	toe.printOdd();
                	} catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

		
		
		Thread t1 = new Thread(r1);
		
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
	

