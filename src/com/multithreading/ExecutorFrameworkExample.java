package com.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.*;


public class ExecutorFrameworkExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		callableMethod();
		
		/*Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("abc");
				try {
					TimeUnit.MILLISECONDS.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("abcd");
				
				try {
					TimeUnit.MILLISECONDS.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Runnable r3 = new Runnable() {

			@Override
			public void run() {
				System.out.println("abcde");
				
				try {
					TimeUnit.MILLISECONDS.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		
		
		
		ArrayList<Runnable> abc = new ArrayList<Runnable>();
		
		abc.add(r1);abc.add(r2);abc.add(r3);
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		ThreadPoolExecutor cached = new ThreadPoolExecutor(0, 1000, 600, TimeUnit.SECONDS, new SynchronousQueue<>());
		
		ThreadPoolExecutor fixed = new ThreadPoolExecutor(0, 1, 600, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
			
		

		
		ThreadPoolExecutor mThreadPool = new ThreadPoolExecutor(THREAD_POOL_SIZE, 
                THREAD_POOL_SIZE, 0L, 
                TimeUnit.MILLISECONDS, 
                new LifoBlockingDeque<Runnable>());
		
		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
		
		fixed.execute(r1);
		fixed.execute(r2);
		fixed.execute(r3);
		
		cached.execute(r1);
		cached.execute(r2);
		cached.execute(r3);
		
		
		
		System.out.println("Let's check");
		System.out.println("");
		
		executor1.execute(r1);
		executor1.execute(r2);
		executor1.execute(r3);
		*/
		
	}
	
	
	public static void callableMethod() throws InterruptedException, ExecutionException, TimeoutException
	{

		
		Callable<Integer> r1 = new Callable<Integer>() {

			@Override
			public Integer call() {
				System.out.println("abcd");
				
				try {
					TimeUnit.MILLISECONDS.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 123;
				
			}
		};
		Callable<Object> r2 = new Callable<Object>() {

			@Override
			public Object call() {
				System.out.println("abcde");
				
				try {
					TimeUnit.MILLISECONDS.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "Obejct return";
				
			}
		};
		Callable<String> r3 = new Callable<String>() {

			@Override
			public String call() {
				System.out.println("abcdf");
				
				try {
					TimeUnit.MILLISECONDS.sleep(3000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "String return";
				
			}
		};
		
		
		
		ArrayList<Callable<? extends Object>> abc = new ArrayList<Callable<? extends Object>>();
		
		abc.add(r1);abc.add(r2);abc.add(r3);
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		ThreadPoolExecutor cached = new ThreadPoolExecutor(0, 1000, 600, TimeUnit.SECONDS, new SynchronousQueue<>());
		
		ThreadPoolExecutor fixed = new ThreadPoolExecutor(0, 1, 600, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
			
		
		List<Future<?>> x = cached.invokeAll(abc);
		
		for(Future obj:x)
		{
			System.out.println(obj.isDone());
			System.out.println(obj.get(200, TimeUnit.MILLISECONDS));
		}
		
		/*ThreadPoolExecutor mThreadPool = new ThreadPoolExecutor(THREAD_POOL_SIZE, 
                THREAD_POOL_SIZE, 0L, 
                TimeUnit.MILLISECONDS, 
                new LifoBlockingDeque<Runnable>());*/
		
	/*	executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);*/
	/*	
		fixed.execute(r1);
		fixed.execute(r2);
		fixed.execute(r3);*/
		
		
		
		System.out.println("Let's check");
		System.out.println("");
	/*	
		executor1.execute(r1);
		executor1.execute(r2);
		executor1.execute(r3);
		*/
		
	
	}
}
