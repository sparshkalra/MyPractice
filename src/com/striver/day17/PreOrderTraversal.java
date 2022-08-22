package com.striver.day17;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> op = new ArrayList<Integer>();
        preorderTraversal(op, root);
        return op;
        
    }
    public void preorderTraversal(List<Integer> op, TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        op.add(root.data);
        preorderTraversal(op, root.left);
        preorderTraversal(op, root.right);
        return;
    }

}

class TreeNode
{
	int data;
	TreeNode left,right;
	
	TreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

