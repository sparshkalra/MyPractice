package com.striver.day5;

import com.practice.LinkedListImplementationTest.Node;

public class DeleteTheGivenNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void deleteNode(Node node) 
    {
        if(node == null)
        {
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next; 
    }
}
