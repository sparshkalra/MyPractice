package com.multithreading;

public class LinkedListDelete {
	
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.insertNewNode(5);
		ll.insertNewNode(4);
		ll.insertNewNode(3);
		ll.insertNewNode(2);
		ll.insertNewNode(1);
		
		ll.print();
		LinkedListDelete lld = new LinkedListDelete();
		System.out.println();
		ll.head = lld.deletenNodeFromBehind(ll.head, 2);
		ll.print();
		
	}
	
	public LinkedList.Node deletenNode(LinkedList.Node head, int k)
	{
		if(head == null)
		{
			return null;
		}
		if(k ==1)
		{
			head = head.next;
			return head;
		}
		LinkedList.Node head2 = head;
		int count=1;
		while(head2!=null)
		{	
			count++;
			if(count == k)
			{
				head2.next = head2.next.next;
			}
			
			head2 = head2.next;
		}
		return head;
	}
	
	public LinkedList.Node deletenNodeFromBehind(LinkedList.Node head, int k)
	{
		if(head == null)
		{
			return null;
		}
		LinkedList.Node start = head,end = head;
		LinkedList.Node head2 = start;
		
		for(int i=0;i<k;i++)
		{
			end = end.next;
		}
		while(end.next!=null)
		{	
			
			start = start.next;
			end = end.next;
		}
		start.next = start.next.next;
		return head2;
	}

}

class LinkedList
{
	Node head;
	
	public void insertNewNode(int data)
	{
		Node node = new Node(data);
		if(head !=null)
		{
			node.next = head;
		}
		head = node;
		
	}
	public void print()
	{
		Node head2 = head;
		while(head2!= null)
		{
			System.out.print("Data is:"+ head2.val+"->");
			head2 = head2.next;
		}
	}
	
	class Node
	{
		Node next;
		int val;
		public Node(int val)
		{
			this.val = val;
			this.next = null;
		}
		@Override
		public String toString() {
			return "Node [next=" + next + ", val=" + val + "]";
		}
		
		
	}
}

