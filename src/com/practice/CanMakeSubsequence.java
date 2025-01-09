package com.practice;

public class CanMakeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canMakeSubsequenceMethod("abc", "ad"));
	}
	    public static boolean canMakeSubsequenceMethod(String str1, String str2) 
	    {
	        int i = 0, j = 0;

	       
	        
	        while (i < str1.length() && j < str2.length()) {
	            if (str1.charAt(i) == lessChar(str2.charAt(j)) || str1.charAt(i) == str2.charAt(j)) {
	                j++;
	            }
	            i++;
	        }
	        
	        return j == str2.length();
	    }
	    static char lessChar(char ch) {
            return ch == 'a' ? 'z' : (char)(ch - 1);
        }
	

}
