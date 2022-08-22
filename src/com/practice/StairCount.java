package com.practice;

public class StairCount {

	public static void main(String[] args) {

		
		//new StairCount().fibonacci(10);
	}

	public int climbStairs(int n) {
	    int newSum = 0;
	    int sum = 1;
	    int prevSum = 1;
	    
	    //linear constant space algo for fibs.
	    for(int i = 0; i < n; i++){
	        newSum = sum  + prevSum;
	        prevSum = sum;
	        sum = newSum;
	    }    
	    
	    return prevSum;
	}
	
	public void fibonacci(int n)
	{
		int start =1;
		int start2= 1;
		int i =2;
		

		
		while(i <n )
		{
			int temp = start2;
			start2 = start + start2;
			start = temp;
			i++;
		}
		System.out.println(start2);
	}
}
