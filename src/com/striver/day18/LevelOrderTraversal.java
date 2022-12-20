package com.striver.day18;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal 
{
	public static void main(String[] args)
	{
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		root.left = two;
		root.right = three;
		root.left.left = four;
		root.left.right = five;
		
		System.out.println(new LevelOrderTraversal().printLevelOrder(root));
	}
	public List<List<Integer>> printLevelOrder(Node root)
	{
		List<List<Integer>> op = new ArrayList();
		int h = heightOfTree(root);
	    for (int i=1; i<=h; i++)
	    {
	    	List<Integer> temp = new ArrayList<Integer>();
	    	op.add(temp);
	        printGivenLevel(root, i,temp);
	        System.out.println();
	    }
	    return op;
	}
	
	void printGivenLevel(Node root, int level, List<Integer> op)
	{
	    if (root == null)
	        return;
	    if (level == 1)
	        op.add(root.data);
	    else if (level > 1)
	    {
	        printGivenLevel(root.left, level-1,op);
	        printGivenLevel(root.right, level-1,op);
	    }
	}
	public int heightOfTree(Node node)
	{
		if(node == null)
			return 0;
		
		
		return 1+ Math.max(heightOfTree(node.left), heightOfTree(node.right));
	}
	
}
