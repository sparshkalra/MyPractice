package com.striver.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TrieUseCase {


    TrieNode root;
    int count = 3;
    public static void main(String[] args)
    {
    	TrieUseCase trie = new TrieUseCase();
    	trie.insert("apple");
    	trie.search("apple");   // return True
    	//trie.search("app");     // return False
    	trie.startsWith("app"); // return True
    	trie.insert("app");
    	trie.insert("appy");
    	trie.insert("apples");
    	trie.search("app"); 
    	trie.search("apples"); 
    	trie.search("apples"); 
    	
    	System.out.println(trie.printAllWithPrefix("app"));
    	

    }
    
    class TrieNode 
    {
	   Map<Character,TrieNode> children;
	   boolean endOfString;
	   int frequency;
	   String actualWord; 
	   public TrieNode() 
	   {
		   this.children = new HashMap<>();
		   this.endOfString = false;
	    }

	   
    }
        
    public TrieUseCase() {
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
	    }
	    currentNode.endOfString = false;
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
	    currentNode.actualWord = word;
    }
    
    public boolean search(String word) {
        TrieNode currentNode = root;
	    for (char c : word.toCharArray()) {
	        if (!currentNode.children.containsKey(c)) {
	            return false;
	        }
	        currentNode = currentNode.children.get(c);
	    }
	    currentNode.frequency++;
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
    
    public List<String> printAllWithPrefix(String prefix)
    {
    	Map<String, Integer> hm = new HashMap<String, Integer>();
    	
    	 TrieNode currentNode = root;
 	    for (char c : prefix.toCharArray()) 
 	    {
 	        if (!currentNode.children.containsKey(c)) {
 	            return null;
 	        }
 	        currentNode = currentNode.children.get(c);
 	        
 	       
 	    }
 	   if(currentNode.endOfString)
        {
 		  hm.put(currentNode.actualWord, currentNode.frequency);
        }
 	    for(Map.Entry<Character, TrieNode> obj: currentNode.children.entrySet())
 	    {
 	    	if(obj.getValue().endOfString)
 	    	{
 	    		hm.put(currentNode.actualWord, currentNode.frequency);
 	    	}
 	    	else
 	    	{
 	    		updateListDFS(obj.getValue(),hm);
 	    	}
 	    }
 	    
 	    return sortMapByFrequency(hm);
    }
    
    private List<String> sortMapByFrequency(Map<String, Integer> hm) {
		// TODO Auto-generated method stub
    	List<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String,Integer>>();
    	
    	System.out.println(hm);
		for(Map.Entry<String, Integer> obj:hm.entrySet())
		{
			al.add(obj);
		}
		
		Collections.sort(al, new Comparator<Map.Entry<String, Integer>>() 
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() > o2.getValue())
				{
					return -1;
				}
				if(o1.getValue() == o2.getValue())
				{
					return o1.getKey().compareTo(o2.getKey());
				}
				return 1;
			}
			
		});
		
		List<String> op = new ArrayList<String>();
		
		for(int i=0;i<count;i++)
		{
			op.add(al.get(i).getKey());
		}
		return op;
	}

	public static void updateListDFS(TrieNode node, Map<String, Integer> hm)
    {
    	if(node.endOfString)
    	{
	    	hm.put(node.actualWord, node.frequency);
    	}
    	for(Map.Entry<Character, TrieNode> obj: node.children.entrySet())
    	{
    		updateListDFS(obj.getValue(), hm);
    	}
    	
    }
    
}