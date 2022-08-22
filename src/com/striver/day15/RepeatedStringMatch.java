package com.striver.day15;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringMatch {

	public static void main(String[] args) 
	{
		
		  System.out.println(repeatedStringMatch("abcd", "cdabcdab"));
		  System.out.println(repeatedStringMatch("a", "aa"));
		  
		  System.out.println(repeatedStringMatch("ab", "aa"));
		 
		
		System.out.println(repeatedStringMatch("abc", "cabcabca"));
	}
	
//abcabcabcabc	
	public static int repeatedStringMatch(String a, String b) 
    {
		int len = a.length();
		int len2 = b.length();
		
		int val = len2/len;
		int count =0;
		
		if(a.equals(b) || a.contains(b))
        {
            return 1;
        }
		String a1 = new String(a);
		for(int i=0;i<val+1;i++)
		{
			a1 = a1+a;
			count++;
			if(a1.contains(b))
			{
				return count+1;
			}
		}
		return -1;
    }

}
