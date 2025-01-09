 package com.striver.day4;

public class LengthOfLongestSubstring {

	//Without repeat
	public static void main(String[] args) 
	{	
		String s = "abcabcbb";
		//myFuncToTestSubString();
		
		  System.out.println(lengthOfLongestSubstring(s));
		  System.out.println(lengthOfLongestSubstring("bbbbb"));
		  System.out.println(lengthOfLongestSubstring("pwwkew"));
		 
		System.out.println(lengthOfLongestSubstring(" "));
		
	}
	
	public static void myFuncToTestSubString()
	{
		String s = "sparsh";
		
		System.out.println(s.substring(1));
	}
	public static int lengthOfLongestSubstring(String s) 
    {
        String op = "";
        int max = 0;
        int count =0;
        for(int i=0; i <s.length();i++)
        {
            if(op.contains(String.valueOf(s.charAt(i))))
            {
                max = Math.max(count,max);
                op = op.substring(op.indexOf(String.valueOf(s.charAt(i)))+1);
                op = op+String.valueOf(s.charAt(i));
                count = op.length();
            }
            else
            {
            	count++;
            	op = op + String.valueOf(s.charAt(i));
            	max = Math.max(count,max);
            }
        }
        return max;
    }

}
