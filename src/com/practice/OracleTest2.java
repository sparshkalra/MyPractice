package com.practice;

public class OracleTest2 {
	
	int[]arr = new int[5];
	int top;
	int minELe;
	
	public void push(int data)
	{
		if(top ==5)
		{
			System.out.println("Overflow error");
		}
		if(top ==0)
		{
			arr[top] = data;
			minELe = data;
		}
		else if(data < minELe)
		{
			arr[top] = (2*data) - minELe;
			minELe = data;
		}
		else
			arr[top] = data;
		top++;
	}
	
	public void pop()
	{
		if(top ==0)
		{
			System.out.println("Underflow error");
		}
		
		top--;
	}
	public Integer popWithReturn()
	{
		int ret = 0;
		
		if(top ==0)
		{
			System.out.println("Underflow error");
			return null;
		}
		else
		{
			int ele = arr[top];
			if(ele < minELe)
			{
				ret = minELe;
				minELe = 2*minELe - ele;
			}
			else
			{
				ret = ele;
			}
		}
		top--;
		return ret;
		
		
	}
	public int returnMinimumElement()
	{
		return minELe;
	}
	
	public static void main(String[] args)
	{
		OracleTest2 stack1 = new OracleTest2();
		
		stack1.push(10);
		System.out.println("Minimum element is:"+ stack1.returnMinimumElement() );
		stack1.push(20);
		System.out.println("Minimum element is:"+ stack1.returnMinimumElement() );
		stack1.push(5);
		System.out.println("Minimum element is:"+ stack1.returnMinimumElement() );
		System.out.println(stack1.popWithReturn());
		System.out.println(stack1.popWithReturn());

		stack1.push(50);
		
		for(int i=0;i< stack1.top;i++)
		{
			System.out.print(stack1.arr[i]+ ",");
		}
		System.out.println();
		
	}

}
