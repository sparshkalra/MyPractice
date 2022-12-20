package com.striver.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] B = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go",
				"mango" };
		String A = "ilikesamsung";
		List<String> bList = Arrays.asList(B);
		System.out.println(wordBreak(A, bList));
	}

	public static int wordBreak(String A, List<String> bList )
    {
		int n = A.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        
        for(int i=0; i<=n; i++) 
        {
            for(int j=0; j<i; j++) 
            {
                String word = A.substring(j, i);
                 if(dp[j] && bList.contains(word))
                 {
                    dp[i] = true;
                    break;
                 }
            }
        }
        
        if(dp[n])
        {
            return 1;
        }
        return 0;
    

    }
}
