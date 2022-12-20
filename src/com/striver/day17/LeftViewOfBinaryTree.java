package com.striver.day17;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

	static int max_level = 0;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		root.left = two;
		root.right = three;
		root.right.left = four;
		root.right.right = five;
		
		System.out.println(leftView(root));
		
		//printLeftView(root);
	}

	static ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> op = new ArrayList<Integer>();
        int height =heightOfTree(root);
        int level = 0;
        boolean[] opArr = new boolean[height];
        leftView(root, op, opArr, level);
     
        return op;
    }
    static public void leftView(Node root, ArrayList<Integer>al, boolean[] arr, int level)
    {
        if(root == null)
        {
            return;
        }
        if(!arr[level])
        {
            al.add(root.data);
            arr[level] = true;
        }
        leftView(root.left,al,arr,level+1);
        leftView(root.right,al,arr,level+1);
        
    }
    static public int heightOfTree(Node node)
	{
		if(node == null)
			return 0;
		
		
		return 1+ Math.max(heightOfTree(node.left), heightOfTree(node.right));
	}
    // A wrapper over leftViewUtil()
    
    
    private static void printLeftView(Node root)
    {
        if (root == null)
            return;
 
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
 
        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();
 
            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
 
                // Print the left most element at
                // the level
                if (i == 1)
                    System.out.print(temp.data + " ");
 
                // Add left node to queue
                if (temp.left != null)
                    queue.add(temp.left);
 
                // Add right node to queue
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }	
}
