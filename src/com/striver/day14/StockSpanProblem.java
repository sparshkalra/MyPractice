package com.striver.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) 
	{
		StockSpanProblem obj = new StockSpanProblem();
		
		System.out.println(obj.next(100));
		System.out.println(obj.next(80));
		System.out.println(obj.next(60));
		System.out.println(obj.next(70));
		System.out.println(obj.next(60));
		System.out.println(obj.next(75));
		System.out.println(obj.next(85));
		
		

	}
    Stack<Custom> s;
    public StockSpanProblem() 
    {
        s = new Stack<>();
    }
    
    public int next(int price) 
    {
    	if(s.empty())
    	{
    		s.push(new Custom(price,1));
    		return 1;
    	}
    	int op =1;
    	while(s.empty() == false && s.peek().getKey() <= price)
    	{
    		Custom obj = s.pop();
    		op = op+obj.getValue();
    	}
    	s.push(new Custom(price,op));
    	return op;
    }
}
class Custom
{
	int key;
	int value;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Custom(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}
