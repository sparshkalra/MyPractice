package com.striver.day16;

public class MinCharsToAdd {

	public static void main(String[] args) 
	{
		String s = "ABC";
		String s1 = "banana";
		
		/*
		 * System.out.println(minChar(s)); System.out.println(minChar(s1));
		 */
		System.out.println(minChar("AACECAAAA"));
		
	}

	static int minChar(String str)
	{
	    // Write your code here
		
	    int n = str.length();
	    int left = 0;
	    int right = n - 1;
	    int added = 0;
	    while (left < right) {
	        // if left and right characters are same increase
	        // left and decrease right pointer
	        if (str.charAt(left) == str.charAt(right)) {
	            left++;
	            right--;
	        }
	        // else think of adding some characters at front and
	        // start comparing the elements again
	        else {
	            left = 0;
	            added = n - right;
	            while (str.charAt(left) == str.charAt(right)) {
	                added--;
	                left++;
	            }
	            right--;
	        }
	    }
	    return added;
	}
}
