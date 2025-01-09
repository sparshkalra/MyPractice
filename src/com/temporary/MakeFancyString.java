package com.temporary;

import java.util.Stack;

public class MakeFancyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(makeFancyString("leeetcode"));
		System.out.println(makeFancyString("aaabaaaa"));
	}
	public static String makeFancyString(String s)
	{
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(st.size() <2 )
			{
				st.push(c);
				continue;
			}
			if(c == st.peek())
			{
				char c1 = st.pop();
				
				char c2 = st.pop();
				
				if(c1 != c2)
				{
					st.push(c2);
					st.push(c1);
					st.push(c);
				}
				else
				{
					st.push(c2);
					st.push(c1);
				}
			}
			else
			{
				st.push(c);
			}
		}
		StringBuffer sb = new StringBuffer();
		while(st.isEmpty() == false)
		{
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}	

}
