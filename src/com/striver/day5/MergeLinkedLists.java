package com.striver.day5;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class MergeLinkedLists 
{
	public static void main(String[] args)
	{
		LinkedList myList1 = new LinkedList();
		LinkedList myList2 = new LinkedList();
		
		
		myList1.insertNode(4);
		myList1.insertNode(2);
		myList1.insertNode(1);
		
		myList2.insertNode(4);
		myList2.insertNode(3);
		myList2.insertNode(1);
		
		Node op = mergeTwoLists(myList1.head, myList2.head);
		LinkedListImplementationTest.printLinkedList(op);
	}
	
	public static Node mergeTwoLists(Node list1, Node list2) 
    {
		if(list1 == null)
		{
			return list2;
		}
		if(list2 == null)
		{
			return list1;
		}
		Node list12 =null;
		if(list1.data < list2.data)
		{
			list12 = list1;
			list1 = list1.next;
		}
		else
		{
			list12 = list2;
			list2 = list2.next;
			
		}
		
		Node backup = list12;
		
		while(list1 != null || list2 != null)
		{
			if(list1 == null)
			{
				list12.next = list2;
				list2 = list2.next;
				list12 = list12.next;
			}
			else if(list2 == null)
			{
				list12.next = list1;
				list1 = list1.next;
				list12 = list12.next;
			}
			else if(list1.data < list2.data)
			{
				list12.next = list1;
				list12 = list12.next;
				list1 = list1.next;
			}
			else
			{
				list12.next = list2;
				list12 = list12.next;
				list2 = list2.next;
			}
			
		}
		return backup;
    }	
}
