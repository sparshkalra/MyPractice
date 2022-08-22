package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AmazonTest 
{
	public static void main(String[] args)
	{
		String s = "bags";
		
		for(int i=2;i<s.length();i++)
		{
			System.out.println(s.substring(0,i));
		}
	}
	
	
	public List<Integer> myMethod(List<String>al)
	{
		List<Integer> op = new ArrayList<Integer>();
		
		
		for(String coupon:al)
		{
			if(coupon.equals(""))
			{
				op.add(1);
			}
			if(new StringBuilder(coupon).reverse().toString().equals(coupon))
			{
				op.add(1);
			}
			else
			{
				Stack<Character> s = new Stack<Character>();
				
				s.push(coupon.charAt(0));
				
				for(int i=1;i<coupon.length();i++)
				{	
					if(!s.isEmpty())
					{
						char c = s.peek();
						
						if(c == coupon.charAt(i))
						{
							s.pop();
						}
						else
						{
							
						}
					}
					else
					{
						s.push(coupon.charAt(i));
					}
					
				}
				if(s.isEmpty())
				{
					op.add(1);
				}
				else
				{
					op.add(0);
				}
				
			}
		}
		
		return op;
		
	}

}
