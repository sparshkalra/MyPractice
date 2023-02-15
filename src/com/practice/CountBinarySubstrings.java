package com.practice;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(countBinarySubstrings("00110011"));
	System.out.println(countBinarySubstrings("10101"));
	System.out.println(countBinarySubstrings("010011"));
	System.out.println(countBinarySubstrings("0001110010"));
	
	
	
	}
	
	public static int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == s.charAt(i-1))
            {
            	curr++;
            }
            else 
            {
                ans = ans + Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        return ans + Math.min(curr, prev);
    }

}
