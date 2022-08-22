package com.striver.day2;

import java.util.Arrays;

public class RepeatedAndMissingNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] A = {3, 1, 2, 5, 3};
		
		System.out.println(Arrays.toString(repeatedNumber(A)));
	}
	public static int[] repeatedNumber(final int[] A) 
    {
		int[]B = new int[A.length];
        int[]op = new int[2];
        
        Arrays.fill(B,0);  
        for(int i=0;i<A.length;i++)
        {
            int num = A[i];
            if(B[num-1] < 0)
            {
                op[0] = num;
            }
            else
            {
                B[num -1] = -1;
                
            }
        }
        for(int i=0;i<B.length;i++)
        {
            if(B[i] ==0)
            {
                op[1] = i+1;
                break;
            }
        }
        return op;

    }

}
