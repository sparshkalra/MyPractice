package com.multithreading;



import java.io.IOException;
import java.util.LinkedList;

public class ProducerConsumerProblem {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		// Object of a class that has both produce()
		// and consume() methods

		ProducerConsumerProblem pcb = new ProducerConsumerProblem();
		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pcb.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pcb.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
/*		t1.join();
		t2.join();*/
	}
	public void produce() throws InterruptedException
	{
		int value = 0;
		while (value <=10) {
			synchronized (this)
			{
				// producer thread waits while list
				// is full
				while (list.size() == capacity)
					wait();

				System.out.println("Producer produced-"
								+ value);

				// to insert the jobs in the list
				list.add(value++);

				// notifies the consumer thread that
				// now it can start consuming
				notify();

			}
		}
	}

	// Function called by consumer thread
	public void consume() throws InterruptedException
	{
		while (true) {
			synchronized (this)
			{
				// consumer thread waits while list
				// is empty
				while (list.size() == 0)
					wait();

				// to retrieve the ifrst job in the list
				int val = list.removeFirst();

				System.out.println("Consumer consumed-"
								+ val);

				// Wake up producer thread
				notify();

				// and sleep
			}
		}
	}	
}