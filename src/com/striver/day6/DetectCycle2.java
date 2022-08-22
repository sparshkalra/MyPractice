package com.striver.day6;

import java.util.HashSet;
import java.util.Set;

import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class DetectCycle2 
{

	public static Node detectCycle(Node head) 
    {
        Set<Node> s = new HashSet<Node>();
        
        while(head!=null)
        {
            if(s.contains(head))
            {
                return head;
            }
            s.add(head);
            head = head.next;
        }
        return null;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList myList = new LinkedList();
		
		
		myList.insertNode(1);
		myList.insertNode(2);
		myList.insertNode(2);
		myList.insertNode(1);
	
		System.out.println(detectCycle(myList.head));
	}
}
