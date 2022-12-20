package com.practice;

public class NumberDecodings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numDecodings("12"));
		System.out.println(numDecodings("226"));
		System.out.println(numDecodings("06"));
		System.out.println(numDecodings("10"));
		System.out.println(numDecodings("27"));
	}
	
	public static int numDecodings(String s) 
    {
		int count = 1;
        if(s.charAt(0) == '0')
        {
                return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '0')
            {
            	continue;
            }
            if(i > 0)
            {
                if(s.charAt(i-1) == '1')
                {
                    count++;
                }
                else if(s.charAt(i-1) == '2')
                {
                    if(Integer.parseInt(String.valueOf(s.charAt(i))) < 7)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
