package com.striver.day6;

import java.util.HashSet;
import java.util.Set;

import com.practice.LinkedListImplementationTest.Node;

public class IntersectionOfLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node getIntersectionNode(Node headA, Node headB) 
    {
        Set<Node> hs = new HashSet<Node>();
        while(headA !=null)
        {
            hs.add(headA);
            headA = headA.next;
        }
        while(headB !=null)
        {
            if(hs.contains(headB))
            {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

}
