package com.striver.day18;

public class DiameterOfBinaryTree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		root.left = two;
		root.right = three;
		root.left.left = four;
		root.left.left.left = five;
		
		System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));
		
	}
	int diameter = 0;
	 public int diameterOfBinaryTree(Node root) {
	        heightOfBinaryTree(root); //helper function
	        return diameter;
	    }
	    
	    public int heightOfBinaryTree(Node root) {
	        if(root == null) { //base condition
	            return 0;
	        }
	        
	        //recursive call for both left and right side
	        int leftHeight = heightOfBinaryTree(root.left);
	        int rightHeight = heightOfBinaryTree(root.right);
	        
	        //update the diameter
	        diameter = Math.max(diameter, leftHeight + rightHeight); 
	        
	        //get the height for the current node
	        int height = Math.max(leftHeight, rightHeight) + 1;
	        
	        return height;
	        
	    }

}
class BST
{
	Node root;
	
	public BST(Node node)
	{
		this.root = node;
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