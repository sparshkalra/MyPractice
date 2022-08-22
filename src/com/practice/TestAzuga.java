package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestAzuga 
{
	public static void main(String[] args)
	{
		List<String> al = new ArrayList<String>();
		al.add("the");al.add("day");al.add("is");al.add("sunny");al.add("the");al.add("the");al.add("the");al.add("sunny");al.add("is");al.add("is");al.add("sunny");
		
		// the 4, day 1,is 3,sunny 3
		System.out.println(returnMaxValues(al, 2));
	}
	public static List<String> returnMaxValues(List<String> input, int k)
	{
		List<String> op = new ArrayList<String>();
		
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
		
		
		for(String ip:input)
		{
			if(hm.containsKey(ip))
			{
				hm.put(ip, hm.get(ip)+1);
			}
			else
			{
				hm.put(ip, 1);
			}
		}
		System.out.println(hm);
		hm = sortMapByValue(hm);
		
		
		if(k > hm.size())
		{
			//throw Error
		}
		int i=0;
		
		for(Map.Entry<String, Integer> entry: hm.entrySet())
		{
				if(i<k)
				{
					op.add(entry.getKey());
					i++;	
				}
				else
					break;
			
		}

		return op;
	}
	
	
	public static LinkedHashMap<String,Integer> sortMapByValue(LinkedHashMap<String,Integer>hm)
	{
		List<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(al, new Comparator<Map.Entry<String, Integer>>() 
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		LinkedHashMap<String,Integer> temp = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer>obj:al)
		{
			temp.put(obj.getKey(), obj.getValue());
		}
		return temp;
	}
	
	
}
