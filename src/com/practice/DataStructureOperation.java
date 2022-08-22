package com.practice;

public class DataStructureOperation 
{
	int size = 100;
	Entry[] map = new Entry[size];
	class Entry
	{
		Integer key;
		Integer value;
		Entry next;
		public Entry(int key, int value)
		{
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	public Integer push(int key, int value)
	{
		int hashcode = String.valueOf(key).hashCode();
		
		int bucket = hashcode%size;
		
		Entry newElement = new Entry(key, value);
		
		if(map[bucket] == null)
		{
			map[bucket] = newElement;
			return value;
		}
		else
		{
			
			Entry oldEntry = map[bucket];
			while(oldEntry.next!=null)
			{
				if(oldEntry.key == key)
				{
					oldEntry.value = value;
					return value;
				}
				oldEntry = oldEntry.next;
			}
			oldEntry.next = newElement;
			return value;
		}
		
				
	}
	
	public Integer getValue(int key)
	{
		int hashcode = String.valueOf(key).hashCode();
		
		int bucket = hashcode%size;
		
		if(map[bucket] == null)
			return null;
		
		else
		{
			Entry oldEntry = map[bucket];
			while(oldEntry.next!=null)
			{
				if(oldEntry.key == key)
					return oldEntry.value;
				oldEntry = oldEntry.next;
			}
			return null;
		}
	}
	
	public boolean deleteRandom()
	{
		int r1 = 0;
		int r2 = 30;
		Entry firstEntry = map[r1];
		int i=0;
		Entry s =firstEntry;
		Entry s1= null;
		//We have minimum of r2 elements
		while(firstEntry.next!=null)
		{
			if(i==r2)
			{
				
			}
			s = firstEntry;
			s1 = firstEntry.next;
			i++;
			
		}
		if(i < r2)
		{
			return false;
		}
		s.next = s1.next;
		return true;
		
		
		
	}
}
