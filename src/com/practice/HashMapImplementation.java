package com.practice;

public class HashMapImplementation 
{
	
	public int size = 16;
	public Entry[] map = new Entry[size];
	
	
	public void put(String key,String value)
	{
		
		int hashCode = key.hashCode();
		
		int bucket = hashCode%size;
		
		Entry entry = new Entry(key, value);
		if(map[bucket] == null)
		{
			map[bucket] = entry;
		}
		else
		{
			Entry entries = map[bucket];
			
			Entry prev = null;
			while(entries !=null)
			{
				if(entries.getKey().equals(key))
				{
					entries.setValue(value);
					return;
				}
				prev = entries;
				entries = entries.next;
			}
			prev.next = entry;
		}
		
	}
	
	public String getForKey(String key)
	{
		int hashCode = key.hashCode();
		
		int bucket = hashCode%size;
		
		if(map[bucket] == null)
		{
			return null;
		}
		else
		{
			Entry entries = map[bucket];
			
			while(entries !=null)
			{
				if(entries.getKey().equals(key))
				{
					return entries.getValue();
				}
				entries = entries.next;
			}
		}
		return null;
	}

		
	
	class Entry
	{
		String key;
		String value;
		
		Entry next;
		
		Entry(String key, String value)
		{
			this.key = key;
			this.value = value;
			
			this.next = null;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		
	}
	
	public static void main(String[] args)
	{
		HashMapImplementation h1 = new HashMapImplementation();
		h1.put("1", "Sparsh");
		h1.put("2", "Sparsh1");
		h1.put("3", "Sparsh2");
		h1.put("4", "Sparsh3");
		h1.put("1", "Sparsh4");
		
		System.out.println(h1.getForKey("1"));
	}
}
