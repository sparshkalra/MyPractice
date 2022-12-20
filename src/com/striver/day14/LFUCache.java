package com.striver.day14;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache {

	    private int CAPACITY;
	    private int minFreq;
	    private HashMap<Integer, Node> cacheMap;
	    private HashMap<Integer, LinkedHashSet<Node>> freqMap;
	    
	    public LFUCache(int capacity) 
	    {
	        this.CAPACITY = capacity;
	        this.minFreq = 1;
	        this.cacheMap = new HashMap<>();
	        this.freqMap = new HashMap<>();
	    }
	    
	    public static void main(String[] args)
	    {
	    	LFUCache lfuCache = new LFUCache(2);
	    	
	    	lfuCache.put(1,1);
	    	lfuCache.put(2,2);
	    	System.out.println(lfuCache.get(1));
	    	lfuCache.put(3,3);
	    	System.out.println(lfuCache.get(2));
	    	System.out.println(lfuCache.get(3));
	    	lfuCache.put(4,4);
	    	System.out.println(lfuCache.get(1));
	    	System.out.println(lfuCache.get(3));
	    	System.out.println(lfuCache.get(4));
	    }
	    
	    public int get(int key) 
	    {
	        if(!cacheMap.containsKey(key))
	        {
	        	return -1;	
	        } 
	        Node node = cacheMap.get(key);
	        update(node);
	        return node.value;
	    }
	    
	    public void put(int key, int value) {
	        if(CAPACITY <= 0)
	        {
	        	return;	
	        }          
	        if(cacheMap.containsKey(key))
	        {
	            Node node = cacheMap.get(key);
	            update(node);
	            node.value = value;
	        }
	        else
	        {
	            Node newNode = new Node(key, value, 1);
	            cacheMap.put(key, newNode);
	            if(!freqMap.containsKey(1))
	            {
	            	freqMap.put(1, new LinkedHashSet<Node>());
	            }   
	            freqMap.get(1).add(newNode);
	            if(cacheMap.size() > CAPACITY)
	            {
	                LinkedHashSet<Node> toBeEvictedList = freqMap.get(minFreq);
	                Node toBeEvictedNode = toBeEvictedList.iterator().next();
	                toBeEvictedList.remove(toBeEvictedNode);
	                cacheMap.remove(toBeEvictedNode.key);
	            }
	            minFreq = 1;
	        }
	    }
	    private void update(Node node)
	    {
	        LinkedHashSet<Node> prevFreqNodeSet = freqMap.get(node.freq);
	        System.out.println("Before:"+prevFreqNodeSet.size());
	        prevFreqNodeSet.remove(node);
	        System.out.println("After:"+prevFreqNodeSet.size());
	        if(prevFreqNodeSet.isEmpty() && node.freq == minFreq)
	        {
	        	minFreq++;
	        } 
	        node.freq++;
	        if(!freqMap.containsKey(node.freq))
	        {
	        	freqMap.put(node.freq, new LinkedHashSet<Node>());
	        }        
	        freqMap.get(node.freq).add(node);
	    }
}

class Node
{
    int key;
    int value;
    int freq;
    public Node(int key, int value, int freq){
        this.key = key;
        this.value = value;
        this.freq = freq;
    }
	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", freq=" + freq + "]";
	}    
}
