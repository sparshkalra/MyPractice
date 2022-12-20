package com.practice;

public class PrintPattern {

	public static void main(String[] args) {
		
		
		int n=4;
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n-i;j++)
			{
				System.out.print("O");
			}
			for (int k=0;k<i;k++)
			{
				System.out.print("XO");
			}
			System.out.print("X");
			for (int j=0;j<n-i;j++)
			{
				System.out.print("O");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		
		testMethod(4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void testMethod(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("O");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("XO");
			}
			System.out.print("X");
			for(int j=0;j<n-i;j++)
			{
				System.out.print("O");
			}
			System.out.println();
		}
	}
	
	

}
