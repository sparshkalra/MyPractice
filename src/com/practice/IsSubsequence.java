package com.practice;

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "abc"; String t = "ahbgdc";
		
		System.out.println(isSubsequence(s,t));

	}
	
	 public static boolean isSubsequence(String s, String t) 
	    {
	        int index = 0;
	        
	        
	        for(int i=0;i < t.length();i++)
	        {
	            if(t.charAt(i) == s.charAt(index))
	            {
	                index++;
	                if(index == s.length()-1)
	    	        {
	    	            return true;
	    	        }
	            }
	            
	        }
	        
	       
	        return false;
	    }

}
