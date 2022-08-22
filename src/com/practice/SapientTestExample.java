package com.practice;

import java.util.HashMap;
import java.util.Map;

public class SapientTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map map1 = new HashMap<>();
		
		map1.put("abc", 1);
		map1.computeIfAbsent("abc", k ->getAsciiValue(k));
		map1.computeIfAbsent("bcd", k ->getAsciiValue(k));

		
		System.out.println(map1.get("abc"));
	}
	
	static Integer getAsciiValue(String str)
	{
		return str.length();
	}

}


enum MySap implements Comparable<MySap>
{
	Object a;
	static int ab;
	
	private MySap()
	{
		
	}
}
