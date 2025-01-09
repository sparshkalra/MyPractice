package com.temporary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode sortList(ListNode head) 
    {
        List<ListNode> al = new ArrayList<ListNode>();
        while(head!=null)
        {
            al.add(head);
            head = head.next;
        }
        al.sort(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}

			
		});
        return al.get(0);

    }
}
class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
