package com.striver.day7;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class LinkedListRightRotate {

	public static void main(String[] args) 
	{
		LinkedList myList = new LinkedList();
		
		myList.insertNode(5);
		myList.insertNode(4);
		myList.insertNode(3);
		myList.insertNode(2);
		myList.insertNode(1);
		
		LinkedListImplementationTest.printLinkedList(rotateRight(myList.head,2));

	}
	
	public static Node rotateRight(Node head, int k) 
    {
		Node backup = head;
        int len =0;
        while(backup !=null)
        {
            len++;
            backup = backup.next;
            
        }
        if(k ==0 || len ==0 || k%len == 0)
        {
            return head;
        }
        k = k%len;
        backup = head;
        for(int i=0;i<len-k-1;i++)
        {
            backup = backup.next;   
        }
        Node backup2 = backup.next;
        backup.next = null;
        
        backup = backup2;
		while(backup2.next!=null)
		{
			backup2 = backup2.next;
		}
		backup2.next = head;
		
		
		
		return backup;
		
		
        
    }

}
