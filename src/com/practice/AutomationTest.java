package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {1,3,4,2};
		
		
		
		
		
		
		int[]arr1 = {5,1,4,2};
		int[] op = nextGreater(arr1);
		System.out.println(Arrays.toString(op));
	}
	
	
	
	
	public static int[] nextGreater(int[]arr)
	{
		int[] op = new int[arr.length];
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(0);
		for(int i=1;i<arr.length;i++)
		{
			int arrayElement = arr[i];
			
			if(s1.isEmpty() == false)
			{	
				int index = s1.pop();
				int element = arr[index];
				
				while(arrayElement > element)
				{
					op[index] = arrayElement;
					
					if(s1.isEmpty())
					{
						break;
					}
					index = s1.pop();
					element = arr[index];
				}
				if(element >= arrayElement)
				{
					s1.push(index);
				}
			}
			s1.push(i);
		}
		
		while(s1.isEmpty() == false)
		{
			int index = s1.pop();
			op[index] = -1;
		}
		
		
		return op;
	}
	
	

}
