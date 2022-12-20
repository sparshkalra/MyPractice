package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) 
	{
		String s = "applepenapple"; 
		String[] wordDict = {"apple","pen"};
		
		System.out.println(wordBreak(s,Arrays.asList(wordDict)));
		//System.out.println(findComplement(2));
	}

	
	   public static boolean wordBreak(String A, List<String> B) 
		{
			int n = A.length();
			boolean[] dp = new boolean[n + 1];
			dp[0] = true;

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < i; j++) {
					String word = A.substring(j, i);
					if (dp[j] && B.contains(word)) {
						dp[i] = true;
						break;
					}
				}
			}

			return dp[n];
		}
	   
	   public static int findComplement(int num) 
	   {
		   String binary = "";
        
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
