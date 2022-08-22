package com.practice;

import java.util.List;

public class TestBlume {

	public static void main(String[] args) 
	{
		String s = "               This  senetence has                    many              spaces         ";
		
		String s1 = " This sentence has many spaces";
		
		//1 5 6 8 9
		//1 5 8 9 11


	}
	
	
	
	@SuppressWarnings("deprecation")
	public static String formatString(List<Character> s1)
	{
		String op = "";
		StringBuilder sb = new StringBuilder();
		boolean first = false;
		
		
		for(int i=0;i<s1.size();i++)
		{
			Character c = s1.get(i);
			if(Character.isSpace(c))
			{
				
			}
			else
			{
				if(i>0 && Character.isSpace(s1.get(i-1)))
				{
					sb.append(" ");
					sb.append(c);
				}
				else
				{
					sb.append(c);
				}
				
			}
		}
		
		op = sb.toString();
		return op;
		
	}
	public Pair countNumbers(int[] arr)
	{
		Pair p = new Pair(); 
		int even = 0;
		int odd = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		
		return p;
	}

}

class Pair
{
	int even;
	int odd;
	@Override
	public String toString() {
		return "Pair [even=" + even + ", odd=" + odd + "]";
	}
	
	
}
