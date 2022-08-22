package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CharsNotTogether 
{	
	public static void main(String[]args)
	{
		char[] ip = {'a','a','a','a','a','b','b','c','c'};
		char[] ip1 = {'a','a','a','a','a','b','c','c'};
		char[] ip2 = {'a','a','a','a','a','b','c','c','d','d'};
		char[] ip3 = {};
		
		checkChars(ip3);
		//checkChars(ip);
	}
	
	public static void checkChars(char[] ip)
	{
		Map<Character,Integer>hm = new LinkedHashMap<Character,Integer>();
		
		if(ip.length == 0 || ip == null)
		{
			System.out.println("Invalid input");
			return;
		}
		
		for(int i=0;i< ip.length;i++)
		{
			if(hm.containsKey(ip[i]))
			{
				hm.put(ip[i], hm.get(ip[i])+1);
			}
			else
			{
				hm.put(ip[i], 1);
			}
		}
		
		int max =0;int sum =0;
		System.out.println(hm);
		hm = sortMapByValue(hm);
		System.out.println(hm);
		Map.Entry<Character, Integer> maxObj = hm.entrySet().stream().findFirst().orElse(null);
		
		max = maxObj.getValue();
		Character maxChar = maxObj.getKey();
		for(Map.Entry<Character, Integer> obj:hm.entrySet())
		{
			if(obj.getKey() == maxObj.getKey())
			{
				continue;
			}
			sum = sum+obj.getValue();
		}
		
		if(max > sum+1)
		{
			System.out.println("Not possible");
			return;
		}
		
		char[]op = new char[ip.length];
		
		for(int i=0;i<op.length;i=i+2)
		{
			if(max >0)
			{
				op[i] = maxChar;
				max--;
			}
			else
			{
				Character c = null;
				for(Map.Entry<Character, Integer> obj:hm.entrySet())
				{
					if(obj.getKey() == maxObj.getKey() || obj.getValue() == 0)
					{
						continue;
					}
					if(obj.getValue() >1)
					{
						c = obj.getKey();
						
						obj.setValue(obj.getValue()-1);
						break;
					}
					
				}
				op[i] = c;
			}
		}
		for(int i=1;i<op.length;i=i+2)
		{
			Character c = null;
			for(Map.Entry<Character, Integer> obj:hm.entrySet())
			{
				if(obj.getKey() == maxObj.getKey() || obj.getValue() == 0)
				{
					continue;
				}
				if(obj.getValue() >0)
				{
					c = obj.getKey();
					obj.setValue(obj.getValue()-1);
					break;
				}
				
			}
			op[i] = c;
		}
		
		for(int i=0;i<op.length;i++)
		{
			System.out.print(op[i] + ",");
		}
	}
	
	public static Map<Character,Integer> sortMapByValue(Map<Character, Integer> hm)
	{
		Map<Character,Integer>hm1 = new LinkedHashMap<Character,Integer>();
		List<Map.Entry<Character,Integer>> list1 = new ArrayList<Map.Entry<Character,Integer>>(hm.entrySet());
		
		Collections.sort(list1, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		});
		for(int i=0;i<list1.size();i++)
		{
			hm1.put(list1.get(i).getKey(), list1.get(i).getValue());
		}
		return hm1;
	}

}
