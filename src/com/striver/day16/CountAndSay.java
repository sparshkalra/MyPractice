package com.striver.day16;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countAndSay(6));

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

}
