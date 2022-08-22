package com.striver.day18;

public class IsMirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
        {
            return true;
        }
        return isSymmetric(root.left, root.right);
        
    }
    
    public boolean isSymmetric(TreeNode right, TreeNode left)
    {
        if(right == null && left == null)
        {
            return true;
        }
        if(right == null && left!=null)
        {
            return false;
        }
        if(left == null && right !=null)
        {
            return false;
        }
        else if(left.data !=right.data)
        {
            return false;
        }
        else if(left.data == right.data && isSymmetric(left.right,right.left) 
           && isSymmetric(right.right,left.left))
        {
            return true;
        }
        return false;
        
    }
}
