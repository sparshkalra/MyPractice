package com.striver.day5;

import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class MiddleOfLinkedList 
{
	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		
		
		myList.insertNode(5);
		myList.insertNode(4);
		myList.insertNode(3);
		myList.insertNode(2);
		myList.insertNode(1);
	
		System.out.println(middleNode(myList.head));
	}
	public static Node middleNode(Node head) 
    {
        int len =0;
        
        Node head2 = head;
        
        while(head2!=null)
        {
            head2 = head2.next;
            len++;
        }
        int req = len/2+1;
        len =0;
        head2=head;
        while(head2!=null)
        {
            len++;
            if(len == req)
            {
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
}
