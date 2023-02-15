package com.striver.day27;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.striver.day27.Trie.TrieNode;

public class CompleteString {

	static TrieNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] a = {"abc","a","bp","ab"};
		String[] a1 = {"g", "l", "lm", "ga", "lmn", "gaz"};
		
		//System.out.println(completeString(a));
		//System.out.println(completeString(a1));
		
		System.out.println("------------------------------------------");
		
		
	}
	public static String completeString(String[] a) 
	{
		String op = "";
		int maxLen = 0;
		Arrays.sort(a);
		Arrays.sort(a, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) 
			{
				return o1.length() - o2.length();
			}
			
		});
		System.out.println(Arrays.toString(a));
		Set<String> hs = new HashSet<>();
		for(String s:a)
		{
			boolean foundAll = true;
			hs.add(s);
			String temp = "";
			for(int i=0;i<s.length()-1;i++)
			{
				temp = temp+s.charAt(i);
				if(!hs.contains(temp))
				{
					foundAll = false;
					break;
				}
				
			}
			if(foundAll)
			{
				if(s.length() > maxLen)
				{
					maxLen = s.length();
					op = s;
				}
			}
			
		}
		
		if(maxLen == 0)
		{
			return "None";
		}
		return op;
	}

	

}

class TrieNode 
{
   Map<Character,TrieNode> children;
   boolean endOfString;
   public TrieNode() {
	   this.children = new HashMap<>();
	   this.endOfString = false;
    }
   
   @Override
	public String toString() {
		return "TrieNode [children=" + children;
	}
}