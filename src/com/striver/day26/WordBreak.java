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
		boolean flag = true;
		while(flag)
		{
			if(A.equals(""))
			{
				return 1;
			}
			flag = false;
			
			for(String temp:bList)
			{
				if(A.startsWith(temp))
				{
					flag = true;
					A = A.substring(temp.length());
				}
			}
		}
		return 0;
		
    }
}
