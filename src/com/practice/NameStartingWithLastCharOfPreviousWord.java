package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NameStartingWithLastCharOfPreviousWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ip = {"Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"};
		
		System.out.println(Arrays.toString(returnInOrder(ip)));
		
		
	}
	public static String[] returnInOrder(String[] ip)
	{
		String[] op = new String[ip.length];
		
		Set<Character> start = new HashSet<Character>();
		Set<Character> end = new HashSet<Character>();
		
		Map<Character, String> hm= new HashMap<Character,String>();
		
		
		
		String firstWord = "";
		
		for(String word2: ip)
		{
			String word = word2.toLowerCase();
			if(!end.contains(word.charAt(0)))
			{
				firstWord = word2;
			}
			start.add(word.charAt(0));
			end.add(word.charAt(word.length()-1));
			hm.put(word.charAt(0), word2);		
		}
		op[0] = firstWord;
		int i=1;
		while(i<ip.length)
		{
			op[i] = hm.get(firstWord.charAt(firstWord.length()-1));
			
			firstWord = op[i];
			i++;
		}
		
		return op;
		
	}
	

}
