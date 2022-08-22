package com.striver.day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class AllPossibleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(allPossibleStrings("abc"));
		System.out.println(allPossibleStrings("sds"));
	}

	public static int allPossibleStrings(String s)
    {
		TrieNode root = new TrieNode();
	    int n = s.length();
	    int count = 0;

	    for (int i = 0; i < n; i++) 
	    {
	    	TrieNode node = root;

	      for (int j = i; j < n; j++) {
	        if (!node.children.containsKey(s.charAt(j))) {
	          node.children.put(s.charAt(j), new TrieNode());
	          count++;
	        }
	        node = node.children.get(s.charAt(j));
	      }
	    }
	    return count + 1;
    }
}
