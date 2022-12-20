package com.practice;

public class RakutenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countAndSay(3));

	}
	
	public static String countAndSay(int n)
	{
		if(n==1)
		{
			return "1";
		}
		String prev = countAndSay(n-1);
		
		char[] prevArr = prev.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		int start =0;
		int end = 0;
		
		while(end < prevArr.length)
		{
			int count =0;
			
			while(end < prevArr.length && prevArr[start] == prevArr[end])
			{
				count++;
				end++;
			}
			sb.append(count);
			sb.append(prevArr[start]);
			start = end;
		}
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String countAndSay2(int n)
	{
		if (n==1)
		{
			return "1";
		}
		
		String prev = countAndSay2(n-1);
		
		char[]prevArr = prev.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		int start = 0;
		int end = 0;
		while(end < prevArr.length)
		{
			int count = 0;
			while(end< prevArr.length-1 && prevArr[start] == prevArr[end])
			{
				start ++;
				count ++;
			}
			sb.append(count);
			sb.append(prevArr[start]);
			start = end;
		}
	}
	
	
	
	

}
