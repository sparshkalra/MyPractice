package com.striver.day27;

import java.util.HashMap;
import java.util.Map;

class Trie {
    TrieNode root;
    
    public static void main(String[] args)
    {
    	Trie trie = new Trie();
    	trie.insert("apple");
    	trie.search("apple");   // return True
    	trie.search("app");     // return False
    	trie.startsWith("app"); // return True
    	trie.insert("app");
    	trie.insert("appy");
    	trie.insert("apples");
    	trie.search("app"); 
    	
    	//System.out.println(trie.searchCount("app"));
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
        
    public Trie() {
        root = new TrieNode();
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
	    }
	    currentNode.endOfString = true;
    }
    
    public boolean search(String word) {
        TrieNode currentNode = root;
	    for (char c : word.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return false;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    return currentNode.endOfString;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
	    for (char c : prefix.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return false;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    return true;
    }
}