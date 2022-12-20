package com.practice;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.practice.LinkedListImplementationTest.Node;

public class HeapTest {
	public static void firstKelements(int arr[], int size, int k) 
	{

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < k; i++) 
		{
			minHeap.add(arr[i]);
		}


		for (int i = k; i < size; i++) {


			if (minHeap.peek() > arr[i])
				continue;


			else {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		Iterator<Integer> iterator = minHeap.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("Kth largest+ "+ minHeap);
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 1,1000, 2, 15, 5, 4,
                45, 88, 96, 50, 45 };
		
		//firstKelements(arr, arr.length,2);
   
		System.out.println(kthLargestImpl(arr, 2));
	}
	
	
	public static int kthLargest(int[]arr, int k)
	{
		Queue<Integer> pq = new PriorityQueue<>(); 
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
			if(pq.size() > k)
			{
				pq.poll();
			}
		}
		return pq.poll();
	}
	
	public static int kthLargestImpl(int[]arr, int k)
	{
		LinkedList pq = new LinkedList(); 
		for(int i=0;i<arr.length;i++)
		{
			pq.insertNode(arr[i]);
		
			if(pq.size > k)
			{
				pq.poll();
			}
		}
		return pq.poll();
	}
	
	public static class LinkedList
	{
		int size = 0;;
		public Node head;
		public LinkedList()
		{
			
		}
		
		public void insertNode(int data)
		{
			Node newNode = new Node(data);
			if(head!=null)
			{
				if(head.data < data)
				{
					newNode.next = head;
					head = newNode;
				}
				else
				{
					Node backup = head;
					Node backup2 = head;
					while(backup!= null && backup.data > data)
					{
						backup2 = backup;
						backup = backup.next;
					}
					backup2.next = newNode; 
					newNode.next = backup;
				}
				
			}
			else
			{
				head = newNode;
			}
			size++;
		}
		
		public int poll()
		{
			if(head == null)
			{
				return 0;
			}
			size--;
			Node backup = head;
			Node backup2 = head;
			while(backup.next!=null)
			{
				backup2 = backup;
				backup = backup.next;
			}
			if(backup2 == backup)
			{
				int val = head.data;
				head = null;
				return val;
				
			}
			
			backup2.next = null;
			return backup.data;
			
		}

		@Override
		public String toString() {
			return "LinkedList [head=" + head + "]";
		}
		
		public static void printLinkedList(Node head)
		{
			while(head!=null)
			{
				System.out.print(head.data+ " ");
				head = head.next;
			}
			
		}

	}
	public static class Node
	{
		public int data;
		public Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
		
	}
}
