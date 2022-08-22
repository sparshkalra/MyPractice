package com.striver.day14;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 5, 2, 10, 8};
	}

	public int[] prevSmaller(int[] A) 
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
}
