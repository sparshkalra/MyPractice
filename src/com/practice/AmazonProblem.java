package com.practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AmazonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "*|*|*|";
		
		List<Integer> startIndices = new ArrayList<Integer>();
		
		List<Integer> endIndices = new ArrayList<Integer>();
		
		startIndices.add(1);
		endIndices.add(6);
		
		//System.out.println(noOfItems(s, startIndices, endIndices));
		
		getSubStr("aabbcc");
	}
	
	public static void getSubStr(String s)
	{
		int n = s.length();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String temp = s.substring(i,j+1);
				
				System.out.println(temp);
			}
		}
	}
	
	
	
	public static List<Integer> noOfItems(String s , List<Integer> startIndices, List<Integer> endIndices)
	{
		List<Integer> op = new ArrayList<Integer>();
		
		for(int i=0;i<startIndices.size();i++)
		{
			int start = startIndices.get(i);
			int end = endIndices.get(i);
			
			String temp = s.substring(start-1, end);
			
			System.out.println(temp);
			int count =0;int count2 = 0;
			boolean found = false;
			for(int k=0;k<temp.length();k++)
			{
				if(temp.charAt(k) == '|')
				{
					if(!found)
					{
						found = true;
						continue;
					}
					
					if(found)
					{
						count = count + count2;
						count2 = 0;
					}
				}
				else if(found && temp.charAt(k) == '*')
				{
					while(k<temp.length() && temp.charAt(k) == '*')
					{
						count2++;
						k++;
					}
					k--;
				}
			}
			op.add(count);
		}
		
		return op;
	}

}
