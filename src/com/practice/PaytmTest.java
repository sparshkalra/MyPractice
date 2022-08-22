package com.practice;

public class PaytmTest 
{
	public static void main(String[] args)
	{
		String s1 = "ababcd";
		String s2 = "bc";

		System.out.println(isStringPresent(s1,s2));
	}
	
	public static boolean isStringPresent(String s1, String s2)
	{
		
		int index =0;
		for(int i=0;i<s1.length();i++)
		{
			if(index == s2.length())
			{
				return true;
			}
			if(s2.charAt(index) == s1.charAt(i))
			{
				index++;
			}
			else
			{
				if(index >0)
				{
					i -=index;
				}
				index= 0;
			}
		}
		if(index == s2.length())
		{
			return true;
		}
		return false;
	}
	
	
	

}
