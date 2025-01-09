package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public static void main(String[] args)
	{
		//System.out.println(convert("PAYPALISHIRING", 4));
		System.out.println(convert("ABC", 2));
	}
	public static String convert(String s, int numRows) 
    {
		if(numRows ==1)
		{
			return s;
		}
        StringBuilder op = new StringBuilder();
        List<List<Character>> al = new ArrayList();
        for(int i=0;i<numRows;i++)
        {
            al.add(new ArrayList<Character>());
        }
        for(int i=0;i<numRows;i++)
        {
        	if(i<s.length())
        	{
                al.get(i).add(s.charAt(i));

        	}
        }
        int k=1;
        for(int i=numRows;i<s.length();i++)
        {
            if(k <numRows-1)
            {
                al.get(al.size()-k-1).add(s.charAt(i));
                k++;
            }
            else
            {
               for(int j=0;j<numRows;j++)
               {
            	   if(i<s.length())
            	   {
            		   al.get(j).add(s.charAt(i));
            		   i++;
            	   }
            	  
               }
               i--;
               k=1;
                
            }
            
        }
        for(List<Character> obj:al)
        {
        	op.append(obj);
        }
        return op.toString();
    }

}
