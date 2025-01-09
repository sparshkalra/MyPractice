package com.gfg.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubStringRepeatedChars {
	
	public static void main(String[] args)
	{
		System.out.println(maximumLength("aaaa"));
	}
	
	public static int maximumLength(String s) 
    {
        int op=0;
        List<String> subArrays = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int index =i;
            while(index <s.length() && s.charAt(i) == s.charAt(index))
            {
                subArrays.add(s.substring(i,index+1));
                index++;
            }
        }
        System.out.println(subArrays);
        Map<String,Integer> hm = new HashMap();
        for(String s1:subArrays)
        {
            hm.put(s1,hm.getOrDefault(s1,0)+1);
        }
         System.out.println(hm);

        for(Map.Entry<String,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>2)
            {
                op = Math.max(op,entry.getKey().length());
            }
        }
            if( op == 0)
            {
                return -1;
            }
            return op;
    }
}
