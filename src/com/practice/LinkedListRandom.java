package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LinkedListRandom 
{
	public static void main(String[] args)
	{
		// Pushing data in the linked list.
		LinkedList list = new LinkedList(new NodeRandom(5));
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);

		// Setting up random references.
		list.head.random = list.head.next.next;
		list.head.next.random =
			list.head.next.next.next;
		list.head.next.next.random =
			list.head.next.next.next.next;
		list.head.next.next.next.random =
			list.head.next.next.next.next.next;
		list.head.next.next.next.next.random =
			list.head.next;

		// Making a clone of the original linked list.
		LinkedList clone = list.clone2();

		// Print the original and cloned linked list.
		System.out.println("Original linked list");
		list.print();
		System.out.println("\nCloned linked list");
		clone.print();
	}	
}




//Linked List NodeRandom class
class NodeRandom
{
	int data;//NodeRandom data
	NodeRandom next, random;//Next and random reference

	//NodeRandom constructor
	public NodeRandom(int data)
	{
		this.data = data;
		this.next = this.random = null;
	}
}

//linked list class
class LinkedList
{
	NodeRandom head;//Linked list head reference

	// Linked list constructor
	public LinkedList(NodeRandom head)
	{
		this.head = head;
	}

	// push method to put data always at the head
	// in the linked list.
	public void push(int data)
	{
		NodeRandom NodeRandom = new NodeRandom(data);
		NodeRandom.next = this.head;
		this.head = NodeRandom;
	}

	// Method to print the list.
	void print()
	{
		NodeRandom temp = head;
		while (temp != null)
		{
			NodeRandom random = temp.random;
			int randomData = (random != null)? random.data: -1;
			System.out.println("Data = " + temp.data +
							", Random data = "+ randomData);
			temp = temp.next;
		}
	}
	
	public LinkedList clone()
	{
		// Initialize two references, one with original
		// list's head.
		NodeRandom origCurr = this.head, cloneCurr = null;

		// Hash map which contains NodeRandom to NodeRandom mapping of
		// original and clone linked list.
		Map<NodeRandom, NodeRandom> map = new HashMap<NodeRandom, NodeRandom>();

		// Traverse the original list and make a copy of that
		// in the clone linked list.
		while (origCurr != null)
		{
			cloneCurr = new NodeRandom(origCurr.data);
			map.put(origCurr, cloneCurr);
			origCurr = origCurr.next;
		}

		// Adjusting the original list reference again.
		origCurr = this.head;

		// Traversal of original list again to adjust the next
		// and random references of clone list using hash map.
		while (origCurr != null)
		{
			cloneCurr = map.get(origCurr);
			cloneCurr.next = map.get(origCurr.next);
			cloneCurr.random = map.get(origCurr.random);
			origCurr = origCurr.next;
		}

		//return the head reference of the clone list.
		return new LinkedList(map.get(this.head));
	}
	
	public LinkedList clone2()
    {
		NodeRandom start = this.head;
		NodeRandom curr = this.head, temp = null;
 
        // insert additional node after
        // every node of original list
        while (curr != null) {
            temp = curr.next;
 
            // Inserting node
            curr.next = new NodeRandom(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = start;
 
        // adjust the random pointers of the
        // newly added nodes
        while (curr != null) {
            if (curr.next != null)
                curr.next.random = (curr.random != null)
                                       ? curr.random.next
                                       : curr.random;
 
            // move to the next newly added node by
            // skipping an original node
            curr = curr.next.next;                   
        }
 
        NodeRandom original = start, copy = start.next;
 
        // save the start of copied linked list
        temp = copy;
 
        // now separate the original list and copied list
        while (original != null) {
            original.next =original.next.next;
 
          copy.next = (copy.next != null) ? copy.next.next
                                            : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return new LinkedList(temp);
    }
}
	// Actual clone method which returns head
	// reference of cloned linked list.
	

