package com.striver.day5;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class ReverseLinkedList 
{

	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		
		
		myList.insertNode(5);
		myList.insertNode(4);
		myList.insertNode(3);
		myList.insertNode(2);
		myList.insertNode(1);
		
		LinkedListImplementationTest.printLinkedList(myList.head);
		System.out.println();
		LinkedListImplementationTest.printLinkedList(reverseList(myList.head));
	}
	
	public static Node reverseList(Node head)
	{
		Node head2 = head;
		Node prev = null;
		Node next = null;
		while(head2!= null)
		{
			next = head2.next;
			head2.next = prev;
			prev = head2;
			head2 = next;
			 
					
		}
		return prev;
	}
}
