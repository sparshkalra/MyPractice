package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) 
	{
		String s = "appleapenapple"; 
		String[] wordDict = {"apple","pen"};
		
		//System.out.println(wordBreak(s,Arrays.asList(wordDict)));
		System.out.println(findComplement(2));
	}

	
	   public static boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> set = new HashSet<>();
	        for(String word : wordDict) {
	            set.add(word);
	        }
	        
	        int n = s.length();
	        boolean[] dp = new boolean[n];
	        
	        for(int i=0; i<n; i++) {
	            for(int j=0; j<=i; j++) {
	                String word = s.substring(j, i+1);
	                if(set.contains(word)) {
	                    if(j== 0 || dp[j-1]) {
	                        dp[i] =true;
	                    }
	                }
	            }
	        }
	        
	        return dp[n-1];
	    }
	   
	   public static int findComplement(int num) 
	    {String binary = "";
        
        while(num >0)
        {
            int i = num%2;
            binary = binary+String.valueOf(i);
            num = num/2;
        }
        
        binary = new StringBuilder(binary).reverse().toString();
        
        int mult = 1;
        int num1 = 0;
        for(int i=binary.length()-1;i>=0;i--)
        {
            int j = binary.charAt(i)-'0';
            if(j==1)
            {
                j =0;
            }
            else
                j =1;
            num1 = num1 + j*mult;
            mult = mult*2;
        }
        return num1;
    }

}
