package com.striver.day16;

public class ZFunction {

	public static void main(String[] args) 
	{
		String haystack = "mississippi";
		String needle = "issip";
		
		System.out.println(strStr(haystack, needle));
	}

	 public static int strStr(String haystack, String needle) 
	    {
	        if(needle.length() == 0)
	        {
	            return 0;
	        }
	        if(haystack.length() == 0)
	        {
	            return -1;
	        }
	        int k =0;
	        int op =0;
	        for(int i=0;i<haystack.length();i++)
	        {
	            if(haystack.charAt(i) == needle.charAt(k))
	            {
	                op = i;
	                while(i< haystack.length() && haystack.charAt(i) == needle.charAt(k))
	                {
	                    
	                    k++;
	                    i++;
	                    if(k == needle.length())
	                    {
	                        return op;
	                    }
	                }
	                i = i - k;
	                k = 0;
	            }
	        }
	        return -1;
	    }
}
