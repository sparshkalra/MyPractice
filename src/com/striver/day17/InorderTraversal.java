package com.striver.day17;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> inorderTraversal(Node root) 
    {
        List<Integer> op = new ArrayList<Integer>();
        
        inorderTraversal(root,op);
        
        return op;
        
    }
    public void inorderTraversal(Node root,List<Integer> op) 
    {
        
        if(root == null)
        {
            return;
        }
        
        inorderTraversal(root.left,op);
       
        
        op.add(root.data);
        inorderTraversal(root.right,op);
        return;
        
    }

}

class Node
{
	int data;
	Node left,right;
	
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BST
{
	Node root;
	
	public BST(Node node)
	{
		this.root = node;
	}
	
	
}