package com.striver.day27;

import java.util.HashMap;
import java.util.Map;

public class Trie2WithCOunt {


    TrieNode root;
    
    public static void main(String[] args)
    {
    	Trie2WithCOunt trie = new Trie2WithCOunt();
    	trie.insert("apple");
    	trie.search("apple");   // return True
    	trie.search("app");     // return False
    	trie.startsWith("app"); // return True
    	trie.insert("app");
    	trie.insert("appy");
    	trie.insert("apples");
    	trie.search("app"); 
    	
    	System.out.println(trie.searchCount("app"));
    	System.out.println(trie.startsWithCount("app"));
    	System.out.println(trie.searchCount("app"));
    	
    	trie.remove("app");
    	System.out.println(trie.searchCount("app"));
    	System.out.println(trie.startsWithCount("app"));
    }
    
    class TrieNode 
    {
	   Map<Character,TrieNode> children;
	   boolean endOfString;
	   int countEndOFWord;
	   int countStartWithWord;
	   int searchedHowManyTimes;
	   public TrieNode() 
	   {
		   this.children = new HashMap<>();
		   this.endOfString = false;
		   countEndOFWord = 0;
		   countStartWithWord = 0;
	    }

	   
    }
        
    public Trie2WithCOunt() {
        root = new TrieNode();
    }
    
    public void remove(String word)
    {
    	TrieNode currentNode = root;
	    for (char c : word.toCharArray()) 
	    {
	        if (!currentNode.children.containsKey(c))
	        {
	            return;
	        }
	        currentNode = currentNode.children.get(c);
	        currentNode.countStartWithWord--;
	    }
	    currentNode.endOfString = false;
	    currentNode.countEndOFWord--;
    }
    
    public void insert(String word) {
        TrieNode currentNode = root;
	    for (char c : word.toCharArray()) 
	    {
	        if (!currentNode.children.containsKey(c))
	        {
	            currentNode.children.put(c, new TrieNode());
	        }
	        currentNode = currentNode.children.get(c);
	        currentNode.countStartWithWord++;
	    }
	    currentNode.endOfString = true;
	    currentNode.countEndOFWord++;
    }
    
    public boolean search(String word) {
        TrieNode currentNode = root;
	    for (char c : word.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return false;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    currentNode.searchedHowManyTimes++;
	    return currentNode.endOfString;
    }
    
    public Integer searchCount(String word) {
        TrieNode currentNode = root;
        
	    for (char c : word.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return 0;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    currentNode.searchedHowManyTimes++;
	    return currentNode.countEndOFWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
	    for (char c : prefix.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return false;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    currentNode.searchedHowManyTimes++;
	    return true;
    }
    
    public Integer startsWithCount(String prefix) {
        TrieNode currentNode = root;
        int op =0;
	    for (char c : prefix.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return op;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	   
	    return currentNode.countStartWithWord;
    }
    
    public Integer countSearched(String prefix) {
        TrieNode currentNode = root;
        int op =0;
	    for (char c : prefix.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return op;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	   
	    return currentNode.searchedHowManyTimes;
    }
}