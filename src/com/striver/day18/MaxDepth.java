package com.striver.day18;


public class MaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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