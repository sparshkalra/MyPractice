package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCombinationMaxNumber 
{
	public static void main(String[] args)
	{
		int[] arr = {3,30,34,5,9};
		int[] arr2 = {0,0};
		int[] arr3 = {0,1,2,3,4,5,6,7,8,9};
		
		
		System.out.println(returnMax(arr));
		System.out.println(returnMax(arr2));

		System.out.println(returnMax(arr3));
		//System.out.println(new ArrayCombinationMaxNumber().reverse(2147483647));
	}
	
	public static String returnMax(int[] arr)
	{
		String s = "";
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i< arr.length;i++)
		{
			al.add(String.valueOf(arr[i]));
		}
			
			Collections.sort(al, new Comparator<String>()
			{

				@Override
				public int compare(String x, String y) {
					
					 String a1 = x+y;
	                    String a2 = y+x;
	                    
	                    return a2.compareTo(a1);
				}
					
			});
			if(al.get(0).equals("0"))
				return "0";
			for(Object a: al)
			{
				s = s + String.valueOf(a);
			}
			
			return s;
			
	}
	
	public int reverse(int x) 
    {
        int output = 0;
        boolean negFlag = false;
        
       
        if(x < 0)
        {
            negFlag = true;
            x = 0 -x;
        }
        
        while(x >0)
        {
            int div = x%10;
            
            output = output*10;
             output = output+ div;
            x = x/10;
        }
        
        if(negFlag)
            output = 0 - output;
        
        if(output > Integer.MAX_VALUE/10 -1 || output < Integer.MIN_VALUE)
        {
            return 0;
        }
        
       
        return output;
    }   

}
