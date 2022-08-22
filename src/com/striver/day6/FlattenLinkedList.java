package com.striver.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlattenLinkedList 
{
	public static void main(String[] args)
	{
		Node a = new Node(5);
		a.bottom = new Node(7);
		a.bottom.bottom = new Node(8);
		a.bottom.bottom.bottom = new Node(30);
		a.next = new Node(10);
		a.next.bottom = new Node(20);
		a.next.next = new Node(19);
		a.next.next.bottom = new Node(22);
		a.next.next.bottom.bottom = new Node(50);
		a.next.next.next = new Node(28);
		a.next.next.next.bottom = new Node(35);
		a.next.next.next.bottom.bottom = new Node(40);
		a.next.next.next.bottom.bottom.bottom = new Node(45);
		
		Node op = new FlattenLinkedList().flatten(a);
		
		while(op.bottom!=null)
		{
			System.out.println(op.data);
			op = op.bottom;
		}
	}
	
	Node flatten(Node root)
    {
	    List<Integer> al = new ArrayList<Integer>();
	    
	    while(root!=null)
	    {
	    	Node backup = root;
	        while(root!=null)
	        {
	            al.add(root.data);
	            root = root.bottom;
	        }
	        root = backup;
	        root = root.next;
	    }
	    Collections.sort(al);
	    Node backup = new Node(al.get(0));
	    Node backup2 = backup;
	    int i=1;
	    while(i< al.size())
	    {
	        Node new2 = new Node(al.get(i));
	        backup.bottom = new2;
	        backup= backup.bottom;
	        i++;
	    }
	    return backup2;
	    
    }
}
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
