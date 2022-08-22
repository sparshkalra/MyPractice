package com.practice;

import java.util.Arrays;

public class PlusOne 
{
	public static void main(String[] args)
	{
		int[] digits = {1,2,3};
		int[] digits1 = {4,3,2,1};
		int[] digits2 = {9};
		int[] digits3 = {1,9};
		int[] digits4 = {9,9};
		int[] digits5 = {9,8,7,6,5,4,3,2,1,0};
		int[] digits6 = {9,8,9};
		
		System.out.println(Arrays.toString(plusOne(digits)));
		System.out.println(Arrays.toString(plusOne(digits1)));
		System.out.println(Arrays.toString(plusOne(digits2)));
		System.out.println(Arrays.toString(plusOne(digits3)));
		System.out.println(Arrays.toString(plusOne(digits4)));
		System.out.println(Arrays.toString(plusOne(digits5)));
		System.out.println(Arrays.toString(plusOne(digits6)));
	}

	public static int[] plusOne(int[] digits) 
    {
		boolean addedFlag = false;
		boolean nineFlag = false;
		boolean allNine = true;
        int opLen = 0;
        for(int i=0;i<digits.length;i++)
        {
        	if(digits[i]!=9)
        	{
        		allNine = false;
        		break;
        	}
        }
        if(allNine)
        {
            opLen = digits.length+1;
            nineFlag = true;
        }
        else
            opLen = digits.length;
        int[] op= new int[opLen];
        
        for(int i=digits.length-1;i>=0;i--)
        {
            int digit = digits[i];
            
            if(digit == 9 && !addedFlag)
            {
                op[i] = 0;
            }
            else
            {
            	if(!addedFlag)
            	{
            		 op[i] = digit+1;
                     addedFlag = true;
            	}
            	else
            	{
            		op[i] = digits[i];
            	}
               
            }
        }
        if(nineFlag)
        {
        	op[0] = 1;
        }
        return op;
    }
}
