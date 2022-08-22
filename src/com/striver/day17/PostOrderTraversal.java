package com.striver.day17;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> op = new ArrayList<Integer>();
        postorderTraversal(op, root);
        return op;    
    }
    
    public void postorderTraversal(List<Integer> op, TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        postorderTraversal(op, root.left);
        postorderTraversal(op, root.right);
        op.add(root.data);
        return;
    }

}
