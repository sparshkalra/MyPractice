package com.striver.day14;

import java.util.Stack;

public class MinimumElement 
{

	Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    public MinimumElement() 
    {
        stack = new Stack<Integer>();
    }
    
    public void push(int val) 
    {
        if(val <= min){          
            stack.push(min);
            min=val;
        }
        stack.push(val);   
    }
    
    public void pop() 
    {
        if(stack.pop() == min) 
            min=stack.pop();
    }
    
    public int top() 
    {
        return stack.peek();    
    }
    
    public int getMin() 
    {
        return min;    
    }


}
