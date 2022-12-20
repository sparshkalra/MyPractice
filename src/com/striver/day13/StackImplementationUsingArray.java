package com.striver.day13;

public class StackImplementationUsingArray 
{
	int top;
	int[]arr = new int[5];
	
	public boolean push(int value)
	{
		if(top == 5)
			return false;
		arr[top] = value;
		top++;
		return true;
	}
	
	public int pop()
	{
		if(top == 0)
		{
			System.out.println("Underflow error");
			return -1;
		}
			
		else
		{
			top--;
			return arr[top];
		}
	}
	boolean isEmpty()

	{
		if(top ==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		//pop();
		StackImplementationUsingArray s11 = new StackImplementationUsingArray();
		
		/*s11.push(30);
		s11.push(1000);
		*/
/*		int arr[] = {  13, 11, 21, 3 };
		printNGE(arr);
		*/
		
		System.out.println(parathesisProblem("([{}])"));
	}
	
	public static void printNGE(int[]arr)
	{
		StackImplementationUsingArray s1 = new StackImplementationUsingArray();
		
		s1.push(arr[0]);
		
		
		for(int i=1; i< arr.length;i++)
		{
			int arrayEle = arr[i];
			
			if(s1.isEmpty() == false)
			{
				int elementStack = s1.pop();
				
				while(arrayEle > elementStack)
				{
					
					System.out.println("Next greater for element:" + elementStack + " is :"+ arrayEle);
					
					if(s1.isEmpty())
						break;
					elementStack = s1.pop();	
				}
				if(elementStack > arrayEle)
				{
					s1.push(elementStack);
				}
				
			}
			s1.push(arrayEle);
		}
		
		while(s1.isEmpty() == false)
		{
			int elementStack = s1.pop();
			System.out.println("Next greater for element:" + elementStack + " is not found");
		}
	}
	
	public static boolean parathesisProblem(String s)
	{
		StackImplementationUsingArray chars = new StackImplementationUsingArray();
		for(int i=0;i< s.length();i++)
		{
			char x = s.charAt(i);
			if(x == '(' || x == '{' || x == '[') 
			{
				chars.push(s.charAt(i));
				continue;
			}
			
			if(chars.isEmpty())
				return false;
			
			char c = (char) chars.pop();
			
			switch(x)
			{
			case ')':
				if (c == '{' || c == '[') {
					return false;
				}
				break;
			case '}':
				if (c == '(' || c == '[') {
					return false;
				}
				break;
			case ']':
				if (c == '(' || c == '{') {
					return false;
				}
				break;
			}
			
		}
		return chars.isEmpty();
	}
}
