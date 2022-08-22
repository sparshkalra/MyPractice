package com.practice;

public interface JavaTestingInterface {
	
	
	public static int a = 10;
	
	public default int justTesting()
	{
		System.out.println("Default method");
		return 0;
	}
		

}
