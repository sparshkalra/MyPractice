package com.striver.day6;

import java.util.Stack;

import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class IsPalindromeLinkedList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList myList = new LinkedList();
		LinkedList myList1 = new LinkedList();
		
		
		myList.insertNode(1);
		myList.insertNode(2);
		myList.insertNode(2);
		myList.insertNode(1);
	
		System.out.println(isPalindrome(myList.head));
	}
	
	 public static boolean isPalindrome(Node head) 
	    {
	        Stack<Node> s = new Stack<Node>();
	        Node temp = head;
	        while(temp!=null)
	        {
	            s.push(temp);
	            temp = temp.next;
	        }
	        while(head!=null)
	        {
	            if(head.data!=s.pop().data)
	            {
	                return false;
	            }
	            head = head.next;
	        }
	        return true;
	    }

}
