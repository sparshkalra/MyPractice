package com.practice;

public class BSTImplementation 
{
	
	
	
	
	public static void main(String[]args)
	{
		Node root = new Node(100);
		BST myTree = new BST(root);
		myTree.root.right = new Node(165);
		myTree.root.left = new Node(50);
		
		myTree.root.right.right = new Node(175);
		myTree.root.right.left = new Node(125);
		
		myTree.root.left.right = new Node(60);
		myTree.root.left.left = new Node(45);
		
		
		
		System.out.println(myTree.heightOfTree(myTree.root));
		System.out.println(myTree.isTreeBalanced(myTree.root));
		
		System.out.println("--------------------PreOrderTraversal---------------------");
		myTree.preOrderTraversal(root);
		System.out.println();
		System.out.println("--------------------PreOrderTraversal ends---------------------");
		Res res = new Res();
		System.out.println(myTree.findMaxUtil(root,res));
		
		myTree.printLevelOrder(root);
		
		System.out.println(myTree.isBST(myTree.root));
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
	
	public int heightOfTree(Node node)
	{
		if(node == null)
			return 0;
		
		
		return 1+ Math.max(heightOfTree(node.left), heightOfTree(node.right));
	}
	
	public void preOrderTraversal(Node node)
	{
		if(node == null)
			return;
		
		System.out.print(node.data+ " ,");
		
		preOrderTraversal(node.left);
		
		preOrderTraversal(node.right);
	}
	
	public boolean isTreeBalanced(Node node)
	{
		if (node == null)
            return true;
		
		int lh = heightOfTree(node.left);
		int rh = heightOfTree(node.right);
		
		if(Math.abs(lh-rh) <=1 && isTreeBalanced(node.left) && isTreeBalanced(node.right))
			return true;
		return false;
	}
	
	public int findMaxUtil(Node node, Res res)
    {
 
        // Base Case
        if (node == null)
            return 0;
 
        // l and r store maximum path sum going through left and
        // right child of root respectively
        int l = findMaxUtil(node.left, res);
        int r = findMaxUtil(node.right, res);
 
        // Max path for parent call of root. This path must
        // include at-most one child of root
        int max_single = Math.max(Math.max(l, r) + node.data,
                                  node.data);
 
 
        // Max Top represents the sum when the Node under
        // consideration is the root of the maxsum path and no
        // ancestors of root are there in max sum path
        int max_top = Math.max(max_single, l + r + node.data);
 
        // Store the Maximum Result.
        res.val = Math.max(res.val, max_top);
 
        return max_single;
    }
	
	public void printLevelOrder(Node root)
	{
		int h = heightOfTree(root);
	    for (int i=1; i<=h; i++)
	    {
	        printGivenLevel(root, i);
	        System.out.println();
	    }
	}
	
	void printGivenLevel(Node root, int level)
	{
	    if (root == null)
	        return;
	    if (level == 1)
	        System.out.print(root.data);
	    else if (level > 1)
	    {
	        printGivenLevel(root.left, level-1);
	        printGivenLevel(root.right, level-1);
	    }
	}
	
	boolean isBST(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
	
}

class Res
{
	int val;
}
