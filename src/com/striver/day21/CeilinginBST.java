package com.striver.day21;

public class CeilinginBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  static int findCeil(TreeNode<Integer> node, int x) 
    {
        if(node == null)
        {
            return -1;
        }
        if(node.data == x)
        {
            return node.data;
        }
        if(node.data <x)
        {
            return findCeil(node.right, x);
        }
        int ceil = findCeil(node.left,x);
        if(ceil >= x)
        {
            return ceil;
        }
        else
        {
            return node.data;        
        }
    }
}
