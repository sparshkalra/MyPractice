package com.striver.day13;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingStack {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	public static void main(String[] args)
	{
		QueueUsingStack qus = new QueueUsingStack();
		qus.add(1);
		qus.add(2);
		qus.add(3);
		
		System.out.println(qus.remove());
		System.out.println(qus.remove());
		System.out.println(qus.remove());
		
		
	}
	public void add(int x)
	{
		
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	public int remove()
	{
		if(s1.isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			
			
			return s1.pop();
		}
		
		
		
	}

}
