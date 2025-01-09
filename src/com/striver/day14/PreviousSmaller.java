package com.striver.day14;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 5, 2, 10, 8};
		int[]arr1 = {5,1,4,2};
		
		System.out.println(Arrays.toString(prevSmaller(A)));
		System.out.println(Arrays.toString(nextGreater(arr1)));
	}
	
	public static int[] nextGreater(int[] A)
	{
		Stack<Integer> s = new Stack<Integer>();
        int[] op = new int[A.length];
        Arrays.fill(op,-1);
        
        s.push(0);
        for(int i=1;i<A.length;i++)
        {
        	int num = A[i];
        	
        	while(s.empty() == false && num >A[s.peek()])
        	{
        		int index = s.pop();
        		op[index] = num;
        	}
        	s.push(i);
        }
        
        return op;
	}

	public static int[] prevSmaller(int[] A) 
    {
        Stack<Integer> s = new Stack<Integer>();
        int[] op = new int[A.length];
        Arrays.fill(op,-1);
        for(int i=0;i<A.length;i++)
        {
            int num = A[i];
            
            while(s.empty() == false)
            {
                int popped = s.pop();
                
                if( popped < num)
                {
                    op[i] = popped;
                    s.push(popped);
                    break;
                }
            }
            s.push(num);
        }
        return op;
    }
}

