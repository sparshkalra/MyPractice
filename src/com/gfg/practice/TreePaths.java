package com.gfg.practice;

import java.util.ArrayList;
import java.util.List;

public class TreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		
		System.out.println(binaryTreePaths(root));

	}
	
    public static List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> op = new ArrayList<String>();
        if(root == null)
        {
            return op;
        }
        binaryTreePaths(root, op,"");
        return op;
    }

    public static void binaryTreePaths(TreeNode root, List<String> op,String s)
    {
        if(root.right == null && root.left == null)
        {
            s = s+root.val;
            op.add(s);
        }
        if(root.left != null)
        {
            
            binaryTreePaths(root.left, op, s+ String.valueOf(root.val)+"->");
        }
        if(root.right != null)
        {
            binaryTreePaths(root.right, op, s+ String.valueOf(root.val)+"->");
        }
    }

   static class TreeNode
    {
    	int val;
    	TreeNode left,right;
    	
    	TreeNode(int val)
    	{
    		this.val = val;
    		this.left = null;
    		this.right = null;
    	}
    }

    static class BST
    {
    	TreeNode root;
    	
    	public BST(TreeNode node)
    	{
    		this.root = node;
    	}
    }
}
