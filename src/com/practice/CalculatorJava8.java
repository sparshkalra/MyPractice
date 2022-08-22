package com.practice;

public class CalculatorJava8  {

	public static void main(String[] args) 
	{
	
		Calculator calc = (num1, num2) -> { return num1 + num2; };
		
		System.out.println(calc.calculate(4, 5));
	}

}

interface Calculator
{
	abstract public int calculate(int num1, int num2);
}