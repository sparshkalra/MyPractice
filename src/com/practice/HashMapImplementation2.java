package com.practice;

import com.practice.HashMapImplementation2.Entry.Key;
import com.practice.HashMapImplementation2.Entry.Value;

public class HashMapImplementation2 
{
	
	public int size = 16;
	public Entry[] map = new Entry[size];
	
	public void put(Key k, Value v)
	{
		int hash = k.hashCode()%size;
		Entry e = map[hash];
		if(e!=null)
		{
			if(e.getKey().equals(k))
			{
				e.setValue(v);
			}
			else
			{
				while(e.next!=null)
				{
					e = e.next;
				}
				Entry newEntryInOldBucket = new Entry(k, v);
				
				e.next = newEntryInOldBucket;
			}
		}
		Entry entryInNewBucket = new Entry(k, v);
		
		map[hash] = entryInNewBucket;
	}
	
	public Value get(String key)
	{
		int hash = key.hashCode()%size;
		Entry e = map[hash];
		
		if(e == null)
			return null;
		if(e.next==null && e.key.equals(key))
		{
			return e.value;
		}
		else
		{
			while(e.next!=null)
			{
				if(e.getKey().equals(key))
					return e.value;
				e = e.next;
			}
			return null;
		}
	}
	
	
	
	class Entry
	{
		Key key;
		Value value;
		
		Entry next;
		
		Entry(Key key, Value value)
		{
			this.key = key;
			this.value = value;
			
			this.next = null;
		}

		public Key getKey() {
			return key;
		}

		public void setKey(Key key) {
			this.key = key;
		}

		public Value getValue() {
			return value;
		}

		public void setValue(Value value) {
			this.value = value;
		}
		
		class Key
		{
			
		}
		class Value
		{
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		HashMapImplementation2 h1 = new HashMapImplementation2();

		
		System.out.println(h1.get("1"));
	}
}
