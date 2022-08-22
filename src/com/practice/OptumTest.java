package com.practice;

import java.util.ArrayList;
import java.util.*;

public class OptumTest 
{
	public static void main(String[] args)
	{
/*		NY , 01-01-2021, 100

		NY, 15-01-2021, 200

		DC, 15-02-2021, 1900

		VI, 15-03-2021, 1000

		MN, 15-03-2021, 100

		ABC, 15-03-2021, 700

		ABC, 15-05-2021, 350

		MN, 15-07-2021, 350

		MN, 15-07-2021, 350*/
		
		List<Data> al = new ArrayList<Data>();
		
		String maxCity = "";
		int maxCityValue = 0;
		int maxMonthVal = 0;
		int maxMonthKey = 0;
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		for(Data data: al)
		{
			if(map1.containsKey(data.city))
			{
				int quantity = map1.get(data.city);
				map1.put(data.city, quantity+data.quantity);
			}
			else
			{
				map1.put(data.city, data.quantity);	
			}
		}
		for(Data data: al)
		{
			if(map2.containsKey(data.month))
			{
				int quantity = map2.get(data.month);
				map2.put(data.month, quantity+data.quantity);
			}
			else
			{
				map2.put(data.month, data.quantity);	
			}
		}
		
		for(Map.Entry<Integer, Integer>obj:map2.entrySet())
		{
			if(obj.getValue() > maxMonthVal)
			{
				maxMonthKey = obj.getKey();
			}
		}
		for(Map.Entry<String, Integer>obj:map1.entrySet())
		{
			if(obj.getValue() > maxCityValue)
			{
				maxMonthKey = obj.getKey();
			}
		}
		
		
	}
}

class Data
{
	String city;
	String date;
	int month;
	int quantity;
}
