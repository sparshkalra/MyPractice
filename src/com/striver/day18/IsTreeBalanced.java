package com.striver.day18;

public class IsTreeBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        if(Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }
        return false;
    }
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
        {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        return 1+Math.max(maxDepth(left), maxDepth(right));
    }
}
