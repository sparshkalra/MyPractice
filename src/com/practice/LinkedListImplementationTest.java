package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class LinkedListImplementationTest {

	public static class LinkedList
	{
		public Node head;
		public LinkedList()
		{
			
		}
		
		public void insertNode(int data)
		{
			Node newNode = new Node(data);
			if(head!=null)
			{
				newNode.next = head;
			}
			head = newNode;
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
	public static void printLinkedList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	public static void main(String[]args)
	{
		LinkedList myList = new LinkedList();
		
	
		myList.insertNode(5);
		myList.insertNode(4);
		myList.insertNode(3);
		myList.insertNode(2);
		myList.insertNode(1);
		
		//myList.insertNode(30);
		//myList.insertNode(60);
		
		printLinkedList(myList.head);
		
		System.out.println("");
		
		Node head2 = rotateRight(myList.head, 2);
		printLinkedList(head2);
		
		
		System.out.println("/////////////////////////////////////////////");
		
		/*Node reversedNode = recursionReverse(myList.head);
		System.out.println("After reverse");
		printLinkedList(reversedNode);*/
		/*System.out.println("");
		System.out.println("After deletion");
		System.out.println("");
		deleteNodeFromEnd(myList.head, 2);
		printLinkedList(myList.head);*/
		
		System.out.println("");
		
		printLinkedList(normalReverse(myList.head));
		/*System.out.println("After rotation right");
		System.out.println("");
		Node head2 = rotateRight(myList.head, 2);
		printLinkedList(head2);*/
		
		//Node head2 = deleteForParticularKey(myList.head,10);
		
		//printLinkedList(head2);
		
		//Node head2 = detectLoopAndDelete(myList.head);
		
		//printLinkedList(head2);
		
		//printLinkedList(reverseBetween(myList.head, 2, 4));
		
	
	}
	
	public static Node deleteForParticularKey(Node node, int data)
	{
		Node temp = node;
		Node prev = null;
		
		if(node.data == data)
			return node.next;
		while(temp!=null)
		{
			prev = temp;
			temp = temp.next;
			if(temp.data == data)
				break;
		}
		
		prev.next = temp.next;
		
		return node;
	}
	
	public static Node recursionReverse(Node head)
	{
		if(head == null)
			return head;
		
		if(head.next == null)
			return head;
		
		Node newHeadNode = recursionReverse(head.next);
				
		head.next.next = head;
		head.next = null;
		
		return newHeadNode;
	}
	
	public static Node normalReverse(Node head)
	{
		if(head == null)
			return head;
		
		if(head.next == null)
			return head;
		
				
		Stack<Node> s = new Stack<Node>();
		Node temp = head;
		while(temp.next!=null)
		{
			s.add(temp);
			temp = temp.next;
			
		}
		head = temp;
		
		while(s.isEmpty() == false)
		{
			temp.next = s.peek();
			s.pop();
			temp = temp.next;
		}
		temp.next = null;
		return head ;
	}
	
	public static Node deleteNodeFromEnd(Node head, int k)
	{
		Node lenNode = head;
		int len =0;
		
		while(lenNode!=null)
		{
			lenNode=lenNode.next;
			len++;
		}
		Node temp = head;
		Node prev = null;
		for(int i=0;i < len -k;i++)
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		
		return head;
	}
	
	public static Node rotateRight(Node head, int k)
	{
		Node lenNode = head;
		int len =0;
		
		while(lenNode!=null)
		{
			lenNode=lenNode.next;
			len++;
		}
		
		k = k%len;
		Node temp = head;
		for(int i=1; i < len-k;i++)
		{
			temp = temp.next;
		}
		
		Node temp2 = temp.next;
		temp.next = null;
		temp = temp2;
		while(temp2.next!=null)
		{
			temp2 = temp2.next;
		}
		temp2.next = head;
		
		return temp;
	}
	
	
	public static Node detectLoopAndDelete(Node head)
	{
		if(head == null || head.next == null)
			return head;
		
		Set<Integer> llSet = new HashSet<Integer>();
		
		Node head2 = head;
		Node temp = null;
		boolean isAdded = true;
		
		llSet.add(head2.data);
		
		while(head2!= null)
		{
			temp = head2;
			head2 = head2.next;
			
			isAdded = llSet.add(head2.data);
			
			if(!isAdded)
			{
				break;
			}
		}
		if(!isAdded)
		{
			temp.next = head2.next;
		}
		
	
		return head;
	}
	
	public static Node reverseBetween(Node head, int left, int right) 
    {
        Node head2 = head;
        int count =1;
        List<Node> tempList = new ArrayList<Node>();
        while(head2!=null)
        {
            head2 = head2.next;
            count++;
            if(count >=left && count<=right)
            {
                tempList.add(head2);
            }
        }
        
        head2 = head;
        int i=1;
        count=1;
        while(head2!=null)
        {
           count++;
           if(count >=left && count<=right)
           {
                head2.next = tempList.get(tempList.size()-1);
                tempList.remove(tempList.size()-1);
           } 
        }
        return head;
    }
}
