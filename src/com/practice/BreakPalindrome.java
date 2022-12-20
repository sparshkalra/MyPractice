package com.practice;

public class BreakPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(breakPalindrome("abccba"));
		System.out.println(breakPalindrome("aaabaaa"));
	}
	
	public static String breakPalindrome(String palindrome) 
    {
		if(palindrome.length() < 2)
		{
			return "";
		}
		StringBuffer sb = new StringBuffer(palindrome);
        for(int i=0;i<sb.length()/2;i++)
        {
        	if(sb.charAt(i) !='a')
        	{
        		sb.setCharAt(i, 'a');
        		return sb.toString();
        	}
        	
        }
        sb.setCharAt(sb.length()-1, 'b');
        return sb.toString();
    }

}
