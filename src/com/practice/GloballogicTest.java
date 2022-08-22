package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GloballogicTest {

	//2 strings. 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "dtoday ais  ymonday";
		String s2 = "day";
		
	}
	
	public static int countOccurence(String s1, String s2)
	{
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		int op = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(hm1.containsKey(s1.charAt(i)))
			{
				hm1.put(s1.charAt(i), hm1.get(s1.charAt(i))+1);
			}
			else
			{
				hm1.put(s1.charAt(i), 1);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(hm2.containsKey(s2.charAt(i)))
			{
				hm2.put(s2.charAt(i), hm2.get(s2.charAt(i))+1);
			}
			else
			{
				hm2.put(s2.charAt(i), 1);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(!hm1.containsKey(s2.charAt(i)))
			{
				return 0;
			}
		}
		
		for(Map.Entry<Character, Integer> obj:hm2.entrySet())
		{
			count.add(hm1.get(obj.getKey())/obj.getValue());
		}
		

		
		Collections.sort(count);
		
		return count.get(0);
		
	}

}
