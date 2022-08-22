package com.striver.day6;

import com.practice.LinkedListImplementationTest.Node;

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasCycle(Node head) 
    {
		Node slow = head;
		Node fast = head;
        while(slow!= null && fast!= null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                return true;
            }
            
        }
        return false;
    }

}
