package com.striver.day5;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class RemoveNFromEnd {

	public static void main(String[] args) 
	{
	
		LinkedList myList = new LinkedList();
		
		
		  myList.insertNode(5); myList.insertNode(4); myList.insertNode(3);
		myList.insertNode(2);
		myList.insertNode(1);
		
		
		LinkedListImplementationTest.printLinkedList(removeNthFromEnd(myList.head, 5));

	}
	public static Node removeNthFromEnd(Node head, int n) 
    {
        int len =0;
        
        Node head2 = head;
        
        while(head!=null)
        {
            head = head.next;
            len++;
        }
        head = head2;
        
        if (n == len) {
			return head.next;
		}
        if (len == 1)
            return null;
        Node backup = null;
        
        for(int i=0;i < len -n;i++)
        {
        	backup = head;
        	head = head.next;
        }
        backup.next= head.next;
        return head2;
    }

}
