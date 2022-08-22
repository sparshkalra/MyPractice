package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestLengthOfPalindrome 
{
	  public static int longestPalindrome(String s) 
	    {
	        int maxLen = 0;
	        int maxOdd = 0;
	        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	        for(int i=0;i<s.length();i++)
	        {
	            if(hm.containsKey(s.charAt(i)))
	            {
	                int val = hm.get(s.charAt(i));
	                hm.put(s.charAt(i),val+1);
	            }
	            else
	            {
	                hm.put(s.charAt(i),1);
	            }
	        }
	        
	        for(Map.Entry<Character,Integer> obj: hm.entrySet())
	        {
	            if(obj.getValue()%2 ==0)
	            {
	                maxLen = maxLen+obj.getValue();
	            }
	            else
	            {
	                maxOdd = Math.max(maxOdd,obj.getValue());
	            }
	        }
	        return maxLen+maxOdd;
	    }
	  
	  public static void main(String[] args)
	  {
		  System.out.println(longestPalindrome("aabbccdddeeeee"));
	  }
}
