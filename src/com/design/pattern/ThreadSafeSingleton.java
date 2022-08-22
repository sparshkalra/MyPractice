package com.design.pattern;

public class ThreadSafeSingleton 
{
	// Java code to explain double check locking

	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton()
	{
		// private constructor
	}

	public static ThreadSafeSingleton getInstance()
	{
		if (instance == null)
		{
		//synchronized block to remove overhead
		synchronized (ThreadSafeSingleton.class)
		{
			if(instance==null)
			{
			// if instance is null, initialize
			instance = new ThreadSafeSingleton();
			}
		
		}
		}
		return instance;
	}

}
