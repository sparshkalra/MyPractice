package com.striver.day13;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue 
{
	static int top;
	static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    
    static void push(int x)
    {
    	top++;
    	q2.add(x);
    	
    	while(!q1.isEmpty())
    	{
    		q2.add(q1.peek());
    		q1.remove();
    	}
    	Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    static int pop()
    {
    	if (q1.isEmpty())
    	{
    		System.out.println("Underflow error");
    		return -1;
    	}
    	else
    	{
    		top--;
    		return q1.remove();
    		
    	}
    }
    
    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size()
    {
        return top;
    }
    
    public static void main(String[] args)
    {
    	pop();
    	push(5);
    	push(15);
    	push(25);
    	pop();
    	push(35);
    	System.out.println(top());
    	System.out.println(size());
    }
}
