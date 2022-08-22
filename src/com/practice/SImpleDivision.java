package com.practice;

public class SImpleDivision {
	
	public static void main(String[] args)
	{
		System.out.println(divide(-20,3));
		System.out.println(divide(20,-3));
		System.out.println(divide(-20,-1));
		System.out.println(divide(-2147483648,-1));
		
		System.out.println("////////////////////////");
		
		System.out.println(divideWithoutOperator(-20,3));
		System.out.println(divideWithoutOperator(20,-3));
		System.out.println(divideWithoutOperator(-20,-3));
	}
	public static int divide(int dividend, int divisor) {
        
		System.out.println("Minimum integer value is  "+ Integer.MIN_VALUE);
        return dividend/divisor;
}
	
public static int divideWithoutOperator(int dividend, int divisor) {
        
	int rem =0;
	boolean negFlag = false;
	
	if(dividend < 0)
	{
		int divTemp = 0 - dividend;
		dividend = divTemp;
		
		
		
		negFlag = !negFlag;
		
	}
	if(divisor < 0)
	{
		int divisorTemp = 0 - divisor;
		divisor = divisorTemp;
		
		negFlag = !negFlag;
	}
	while(dividend>divisor)
	{
		rem = dividend - divisor;
		dividend = dividend - divisor;
		
	}
	if(negFlag)
		return 0 - rem;
		return rem;
}
}