package com.practice;

import java.util.ArrayList;

public class PalindromeString {
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("nittin"));
		System.out.println(isPalindrome("sparshsraps"));
		
		new PalindromeString().checkWhile();
		
	}
	public boolean isPalindromeCheck(String s) 
    {
        s = s.toLowerCase();
        s=s.replaceAll(" ","");
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(al.contains((Character)s.charAt(i)))
            {
                al.remove((Character)s.charAt(i));
            }
            else
            {
                al.add((Character)s.charAt(i));
            }
        }
        
        if(al.size() == 0 || al.size() == 1)
        {
            return true;
        }
        return false;
    }
	public static boolean isPalindrome(String s)
	{
		boolean flag = false;
		
		String s1 = "strawberries";
		System.out.println(s1.substring(2,5));
		
		char mychar = "piper".charAt(3);
		
		System.out.println(mychar);

		
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i=0; i<s.length();i++)
		{
			if(charList.contains(s.charAt(i)))
			{
				charList.remove((Character)s.charAt(i));
			}
			else
			{
				charList.add(s.charAt(i));
			}
		}
		if(charList.size() == 0 || charList.size() == 1 )
		{
			flag = true;
		}	
		
		return flag;
	}
	public void checkWhile()
	{
		int i =0;
		
		while(i<100)i++;
		 System.out.println(i);
	}

}
