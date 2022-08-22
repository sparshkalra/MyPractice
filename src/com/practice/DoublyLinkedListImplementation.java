package com.practice;

public class DoublyLinkedListImplementation 
{
	
	public DoublyLinkedListImplementation(int data)
	{
		NodeDLL head = new NodeDLL(data);
		this.head = head;
	}
	NodeDLL head;
	
	public void insertNodeDLL(int data)
	{
		NodeDLL newNodeDLL = new NodeDLL(data);
		if(head == null)
		{
			this.head = newNodeDLL;
			
			newNodeDLL.next = null;
			newNodeDLL.prev = null;
		}
		else
		{
			head.prev = newNodeDLL;
			newNodeDLL.next = head;
			this.head = newNodeDLL;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedListImplementation obj = new DoublyLinkedListImplementation(45);
		
		obj.insertNodeDLL(35);
		obj.insertNodeDLL(135);
		obj.insertNodeDLL(235);
		
		obj.printList(obj.head);
	}
	
	public void printList(NodeDLL head)
	{
		while(head.next!=null)
		{
			System.out.println(head.data);
			head = head.next;
			
		}
	}
}

class NodeDLL
{
	NodeDLL next;
	NodeDLL prev;
	int data;
	
	public NodeDLL(int data)
	{
		this.data = data;
		next = null;
		prev = null;
	}
}
