package com.temporary;

import java.util.HashSet;
import java.util.Set;

public class DeleteFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3};
		ListNode2 head5 = new ListNode2(5);
		ListNode2 head4 = new ListNode2(4,head5);
		ListNode2 head3 = new ListNode2(3,head4);
		ListNode2 head2 = new ListNode2(2,head3);


		ListNode2 head = new ListNode2(1,head2);
		
		System.out.println(new DeleteFromLinkedList().modifiedList(nums, head));
	}
	
	public ListNode2 modifiedList(int[] nums, ListNode2 head) 
    {
		ListNode2 head2 = new ListNode2();
        head2.next = head;
        ListNode2 curr= head2, prev = head2;
        Set<Integer> hs = new HashSet<Integer>();
        for(int i:nums)
        {
            hs.add(i);
        }

        while(curr!=null)
        {
        	ListNode2 next = curr.next;
            if(hs.contains(curr.val))
            {
                prev.next = next;            
            }
            else
            {
                prev = curr;
            }
            curr = next;
           
        } 
        return head2.next;
    }

}

class ListNode2 {
	      int val;
	      ListNode2 next;
	      ListNode2() {}
	      ListNode2(int val) { this.val = val; }
	      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
	  }
