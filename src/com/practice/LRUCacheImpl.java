package com.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheImpl 
{
	private LRUCacheImpl(int capacity)
	{
		this.capacity = capacity;
		lru = new LinkedHashSet<Integer>(capacity);
	}
	int capacity;
	Set<Integer> lru;

	public void add(int data)
	{
		if(lru.size() == capacity)
		{
			int key = lru.iterator().next();
			lru.remove(key);
		}
		lru.add(data);
	}
	
	public boolean get(int key)
	{
		if(!lru.contains(key))
			return false;
		
		lru.remove(key);
		lru.add(key);
		return true;
	}
	public void display()
	{
		LinkedList<Integer> ll = new LinkedList<>(lru);
		
		Iterator<Integer> it = ll.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+ ",");
		}
	}
	
	public static void main(String[] args)
	{
		LRUCacheImpl newCache = new LRUCacheImpl(4);
		
		newCache.add(4);
		newCache.add(40);
		newCache.add(400);
		newCache.add(4000);
		newCache.add(4);
		newCache.add(40000);
		
		newCache.display();
	}
}
