package com.striver.day15;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinString {
	
	public static void main(String[] args)
	{
		String s = "the sky is blue";
		
		//System.out.println(reverseWords(s));
		
		System.out.println(reverseWords("  Bob    Loves  Alice   "));
	}

	public static String reverseWords(String s) {
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			} else {
				String s1 = "";

				while (i < s.length() && s.charAt(i) != ' ') {
					s1 = s1 + s.charAt(i);
					i++;
				}
				al.add(s1);

			}
		}
		String op = "";

		for (int i = al.size() - 1; i >= 0; i--) {
			op = op + al.get(i);
			op = op + " ";
		}
		return op.substring(0, op.length()-1);
	}
}
