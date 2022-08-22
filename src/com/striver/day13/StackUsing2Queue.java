package com.striver.day13;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue 
{
    Queue<Integer> q1 = null;
    Queue<Integer> q2 = null;
    int top =0;
    
    public StackUsing2Queue() 
    {
       
	    q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();    
    }
    
    public void push(int x) 
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
    
    public int pop() 
    {
        if (q1.isEmpty())
    	{
    		return -1;
    	}
    	else
    	{
    		top--;
    		return q1.remove();
    		
    	}    
    }
    
    public int top() 
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();   
    }
    
    public boolean empty() 
    {
        return top ==0;    
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */