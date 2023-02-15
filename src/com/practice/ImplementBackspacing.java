package com.practice;

public class ImplementBackspacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab###c", t = "ad#c";
		
		System.out.println(backspaceCompare(s, t));
		
		
	}

	public static boolean backspaceCompare(String s, String t) 
    {
        String op1 = "";
        String op2 = "";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!= '#')
            {
                op1 = op1 + s.charAt(i);
            }
            else
            {
            	if(op1.length() == 0)
            	{
            		continue;
            	}
                op1 = op1.substring(0,op1.length()-1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!= '#')
            {
                op2 = op2 + t.charAt(i);
            }
            else
            {
            	if(op2.length() == 0)
            	{
            		continue;
            	}
            	
                op2 = op2.substring(0,op2.length()-1);
            }
        }
        return op1.equals(op2);    
    }
}
