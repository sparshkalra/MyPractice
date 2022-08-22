package com.practice;

public class PowerProblem 
{
	public static void main(String[] args)
	{
		//System.out.println(calculatePower(2,4));
		System.out.println(calculatePower(2,3));
		System.out.println(calculatePower(2,-2));
		System.out.println(calculatePower(2,Integer.MIN_VALUE));
		System.out.println(calculatePower(2,Integer.MAX_VALUE));
		
	}
	
	public static double calculatePower(double x, int n)
	{ 
		double ans = 1;
		while (n != 0) 
		{
			if (n % 2 != 0) 
			{
				ans = (n > 0) ? ans * x : ans * (1 / x);
			}
			x = x * x;
			n /= 2;
		}
    return ans;
    }
}
