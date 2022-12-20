package com.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ProducerConsumerPool 
{
	List<Integer> p1 = new LinkedList<Integer>();
	int max = 2;
	int value = 0;
	public static void main(String[] args) throws InterruptedException
	{
		ProducerConsumerPool pcp = new ProducerConsumerPool();
		List<Callable<String>> al = pcp.createCallables();
		
		ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2); 
		List<Future<String>> futures = threadPool.invokeAll(al);
		
		
		System.out.println("-------------------------------------");
		futures.stream().forEach(x-> {
			try {
				System.out.println(x.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public List<Callable<String>> createCallables()
	{
		List<Callable<String>> al = new ArrayList<Callable<String>>();
		
		
		Callable<String> c1 = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				
				produce();
				return null;
			}
		};
		
		Callable<String> c2 = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				
				consume();
				return null;			}
		};
		
		al.add(c1);
		al.add(c2);
		return al;
	}
	
	
	void produce() throws InterruptedException
	{
		while(value<=10)
		{
			synchronized (this) 
			{
				while(p1.size() == max)
				{
					wait();
				}
				p1.add(value);
				System.out.println(value);
				value++;
				notify();
			}
		}
	}
	
	void consume() throws InterruptedException
	{
		while(value<=10)
		{
			synchronized (this) 
			{
				while(p1.isEmpty())
				{
					wait();
				}
				p1.remove(0);
				notify();
			}
		}	
	}
}