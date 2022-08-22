package com.java.concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.java.concepts.CompositionExample.ChildClass;

public class CollectionIteration {
	
	public static void main(String[] args)
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.get("");
		
		for(Entry<String, String> es : hm.entrySet())
		{
			System.out.println(es.getValue());
		}
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.forEach(abc ->{
			System.out.println(abc);
		});
		
		al.stream().filter(abc -> abc.equals("hello")).findFirst().orElse(null);
		
	}
	
}
