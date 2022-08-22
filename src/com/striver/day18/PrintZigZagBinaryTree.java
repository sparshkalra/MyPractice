package com.striver.day18;

import java.util.ArrayList;
import java.util.List;

public class PrintZigZagBinaryTree 
{
	boolean flag = false;
	int level2 = 0;
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
		
		System.out.println(new PrintZigZagBinaryTree().zigzagLevelOrder(root));
	}
	
	    public List<List<Integer>> zigzagLevelOrder(Node root) 
	    {
	        List<List<Integer>> op= new ArrayList();
	        int h = heightOfTree(root);
	        for (int i=1; i<=h; i++)
		    {
		       List<Integer> al = new ArrayList<>();  
		       op.add(i-1, al);
	        }
		    for (int i=1; i<=h; i++)
		    {
		    	level2 = i-1;
		        printGivenLevel(root, op, i);
		        flag = !flag;
	        }
	        return op;
	    }
	    void printGivenLevel(Node root, List<List<Integer>> op, int level)
		{
		    if (root == null)
		        return;
		    if (level == 1)
		        op.get(level2).add(root.data);
		    else if (level > 1)
		    {
		    	if(flag)
		    	{
		    		printGivenLevel(root.left,op, level-1);
			        printGivenLevel(root.right,op, level-1);
		    	}
		    	else
		    	{
		    		printGivenLevel(root.right,op, level-1);
		    		printGivenLevel(root.left,op, level-1);
		    	}
		        
		    }   
	    }
	    
	    int heightOfTree(Node node)
		   {
			    if(node == null)
				return 0;
			
			
			return 1+ Math.max(heightOfTree(node.left), heightOfTree(node.right));
		}
}
