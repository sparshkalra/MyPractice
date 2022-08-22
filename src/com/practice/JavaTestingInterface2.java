package com.practice;

public interface JavaTestingInterface2 {

	public default int justTesting()
	{
		System.out.println("Default method");
		return 0;
	}
	
}
