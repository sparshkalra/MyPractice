package com.striver.day18;

public class IsSameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        return isSame(p,q);
    }
    
    public boolean isSame(TreeNode p, TreeNode q)
    {
        if(p == null && q == null)
        {
            return true;
        }
        else if(p == null && q != null)
        {
            return false;
        }
        else if(p != null && q == null)
        {
            return false;
        }
        else
        {
            if(p.data!=q.data)
            {
                return false;
            }
            return isSame(p.left,q.left) && isSame(p.right,q.right);
        }
    }

}
