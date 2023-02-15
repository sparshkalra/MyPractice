package com.practice;

import java.util.Arrays;

public class StringInclusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(checkInclusion("abcdxabcde", "abcdeabcdx"));
	
	//lznomzggwrvrkxecjaq      rvwrk
	
		
	}
	
	public static boolean checkInclusion(String s1, String s2) 
    {

	        int[] arr = new int[26];
	        int[] window = new int[26];
	        int n = s2.length();
	        int p = s1.length();
	        if(p>n) return false;
	        for(int i = 0; i < s1.length(); i++){
	            arr[s1.charAt(i)-'a']++;
	            window[s2.charAt(i)-'a']++;
	        }
	        if(Arrays.equals(arr,window)) return true;
	        int l = 0;
	        while(l<n-p){
	            window[s2.charAt(l++)-'a']--;
	            window[s2.charAt(l+p-1)-'a']++;
	            if(Arrays.equals(arr,window)) return true;
	        }
	        return false;
	    }

}
