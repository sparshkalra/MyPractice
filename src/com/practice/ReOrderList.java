package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ReOrderList {

	public static void main(String[] args) {

		ListNode l1= new ListNode(5);
		ListNode l2= new ListNode(4,l1);
		ListNode l3= new ListNode(3,l2);
		ListNode l4= new ListNode(2,l3);
		ListNode l5= new ListNode(1,l4);
		
		reorderList(l5);
		
	}
	public static void reorderList(ListNode head) 
    {
        List<ListNode> hs = new ArrayList();
        ListNode head2 = head;
        while(head2!=null)
        {
            hs.add(head2);
            head2 = head2.next;
        }
        head2 = head;
        int i=0;
        while(i<hs.size()/2)
        {   
            ListNode backup = head2.next;
            head2.next = hs.get(hs.size()-1-i);
            head2.next.next = backup;
            i++;
            head2 = head2.next.next;

        }
        head2.next = null;
        while(head!=null)
        {
        	System.out.println(head.val+ "->");
        	head = head.next;
        }
    	
  	  }
}

	
