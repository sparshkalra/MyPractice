package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class TemoTest {
	
	interface one{
		int operation(int a, int b);
	}
	private int operate(int a, int b, one t)
	{
		return t.operation(a, b);
	}
	
	public static void main(String[] args)
	{
		one div = (int x, int y) -> x/y;
		
		TemoTest t = new TemoTest();
		
		System.out.println("dividend is "+ t.operate(6, 3, div));
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		
		arrL.add(1);arrL.add(2);arrL.add(3);arrL.add(4);arrL.add(5);arrL.add(6);
		
		
		arrL.forEach(i -> {
			if(i%2 ==1)
			{
				System.out.println(i);
			}
		});
		
		int sum = Arrays.asList(1,2,3,4,5).parallelStream().mapToInt(n ->n).sum();
		
		System.out.println(sum);
	}

}
