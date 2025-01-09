package com.temporary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RingCentralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ip = {6,2, 5, 2, 8, 5, 6, 8, 8,};
		
		System.out.println(Arrays.toString(sortByFreq(ip)));
	}
	
	public static int[] sortByFreq (int[]ip)
	{
		int[] op = new int[ip.length];
		
		Map<Integer,Integer> hm = new LinkedHashMap();
		
		for(int i:ip)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		hm = sortMapByValue(hm);
		System.out.println(hm);
		
		
		return op;
	}
	public static Map<Integer,Integer> sortMapByValue(Map<Integer,Integer> input)
	{
		Map<Integer,Integer> output = new LinkedHashMap();
		
		List<Map.Entry<Integer,Integer>> al = new ArrayList(input.entrySet());
		
		Collections.sort(al, new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() == o2.getValue())
				{
					return 1;
				}
				return o2.getValue() - o1.getValue();	
			}
		});
			for(int i=0;i<al.size();i++)
			{
				output.put(al.get(i).getKey(), al.get(i).getValue());
			}
				
			
		return output;
		
	}


}
