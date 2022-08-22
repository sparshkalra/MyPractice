package com.striver.day5;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.LinkedList;
import com.practice.LinkedListImplementationTest.Node;

public class AddNumbersAsLinkedList 
{
	public static void main(String[] args)
	{

		
		LinkedList myList = new LinkedList();
		LinkedList myList1 = new LinkedList();
		
		
		myList.insertNode(4);
		myList.insertNode(6);
		myList.insertNode(5);
		
		myList1.insertNode(3);
		myList1.insertNode(4);
		myList1.insertNode(2);
		
		
		LinkedListImplementationTest.printLinkedList(addTwoNumbers(myList.head, myList1.head));
	
	}
	
	public static void test()
	{
		String s1 = "9";
		String s2 = "1999999999";
		
		
		
		s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        Long a = Long.parseLong(s1);
        Long b = Long.parseLong(s2);
        int finalOp = (int) (a+b);
        
        System.out.println(finalOp);
	}
	
    public static Node addTwoNumbers(Node l1, Node l2) 
    {
        int carry = 0;
        Node p, dummy = new Node(0);
        p = dummy;
        while (l1 != null || l2 != null || carry != 0) 
        {
            if (l1 != null) 
            {
                carry += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) 
            {
                carry += l2.data;
                l2 = l2.next;
            }
            p.next = new Node(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }
}
