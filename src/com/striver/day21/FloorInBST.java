package com.striver.day21;

public class FloorInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode t = new TreeNode(10);
		t.right = new TreeNode(15);
		t.left = new TreeNode(5);
		t.left.left = new TreeNode(2);
		t.left.right = new TreeNode(6);
		
		TreeNode t1 = new TreeNode(2);
		t1.right = new TreeNode(3);
		t1.left = new TreeNode(1);
		
		
		System.out.println(floorInBST(t, 7));
		System.out.println(floorInBST(t, 2));
	}



	public static int floor(TreeNode<Integer> root, int key) 
    {
		if (root == null)
            return Integer.MAX_VALUE;
 
        /* If root->data is equal to key */
        if (root.data == key)
            return root.data;
 
        /* If root->data is greater than the key */
        if (root.data > key)
            return floor(root.left, key);
 
        /* Else, the floor may lie in right subtree
    or may be equal to the root*/
        int floorValue = floor(root.right, key);
        return (floorValue <= key) ? floorValue : root.data;
    }
	
    public static int floorInBST(TreeNode<Integer> root, int X) 
    {
    	Output op  = new Output();
    	op.x = 0;
    	
    	floorInBSTHelper(root,X,op);
        
        return op.x;
    }
    public static int floorInBSTOptimised(TreeNode<Integer> root, int X) 
    {
    	
    	floorInBSTHelper(root,X,op);
        
        return op.x;
    }
    public static void floorInBSTHelper(TreeNode<Integer> root, int X, Output op)
    {
        if(root == null)
        {
            return;
        }
        if(root.data > X)
        {
        	floorInBSTHelper(root.left,X, op);
        	return;
        }
        else if(root.data <= X && root.data > op.x)
        {
        	op.x = root.data;
        	floorInBSTHelper(root.left,X, op);
            floorInBSTHelper(root.right,X, op);
        }
        
    }
    

}
class TreeNode<T>
{
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data)
    {
        this.data = data;
        left = null;
        right = null;
    }
};
class Output
{
	int x;
}