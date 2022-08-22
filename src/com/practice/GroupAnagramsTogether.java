package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsTogether {

	public static void main(String[] args)
	{
		String[] words = {"cat","tac","act","dog","god","spa"};
		
		System.out.println(groupingWords(words));
	}
	
	
	public static List<List<String>> groupingWords(String[] words)
	{
		List<List<String>> op = new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(int i=0;i< words.length;i++)
		{
			String word = words[i];
			char[] wordArr = word.toCharArray();
			Arrays.sort(wordArr);
			String sortedWord = new String(wordArr);
			
			if(map.get(sortedWord)!=null)
			{
				map.get(sortedWord).add(word);
			}
			else
			{
				ArrayList<String> tempObj = new ArrayList<String>();
				tempObj.add(word);
				map.put(sortedWord, tempObj);
								
			}
			
			
		}	
		
		map.entrySet().stream().filter(c->c.getValue().size()>1).forEach(c-> op.add(c.getValue()));
			
		
		
		return op;
	}
}
