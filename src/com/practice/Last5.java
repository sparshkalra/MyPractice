package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Last5 
{
	public static void main(String[] args)
	{
		CustomObject c = new CustomObject(10);
		CustomObject c1 = new CustomObject(11);
		CustomObject c2 = new CustomObject(13);
		CustomObject c3 = new CustomObject(16);
		
		List<CustomObject> al = new ArrayList<CustomObject>();
		al.add(c);al.add(c1);al.add(c2);al.add(c3);
		
		returnLast5(al);
		
	}
	
	public static List<String> returnLast5(List<CustomObject> al)
	{
		List<String> op = new ArrayList<String>();
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(al.get(0).time);
		for(int i=1;i<al.size();i++)
		{
			if (minHeap.peek() > al.get(i).time +5)
				continue;


			else if(minHeap.peek() < al.get(i).time)
			{
				while(minHeap.isEmpty() == false && minHeap.peek()+5<al.get(i).time)
				{
					minHeap.poll();
				}
			}
			
				minHeap.add(al.get(i).time);
		}
		System.out.println(minHeap);
		
			return op;
	}
}

class CustomObject
{
	
	public CustomObject(Integer time) {
		super();
		this.time = time;
	}
	Integer time;
	String info;
}

