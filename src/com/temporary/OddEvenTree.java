package com.temporary;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.valueOf(val);
		}
}

public class OddEvenTree {
	public static void main(String[] args)
	{
		TreeNode ll = new TreeNode(3);
		TreeNode lr = new TreeNode(3);
		TreeNode rl = new TreeNode(7);
		
		TreeNode l1 = new TreeNode(4,ll,lr);
		TreeNode r1 = new TreeNode(2,rl,null);
		TreeNode root = new TreeNode(5,l1,r1);
		
		System.out.println(new OddEvenTree().isEvenOddTree(root));

		
	}
	public boolean isEvenOddTree(TreeNode root) 
	{
		StringBuilder sb = new StringBuilder(5);
		
		System.out.println(sb);
		String s = "00000";
		int number =2;
		for(int i=0;i<s.length();i++)
        {
            sb.append('0');
        }
        sb.setCharAt(s.length()-1, '1');
        int k=0;
        for(int i=0;i<number;i++)
        {
            sb.setCharAt(k,'1');
            k++;
        }
		
       Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        int res = 1;
        int prev = 0;
        while(!que.isEmpty()){
            if(res%2==0)
                prev = Integer.MAX_VALUE;
            else
                prev = Integer.MIN_VALUE;
            while(que.peek()!=null) {
                if(que.peek().val%2!=res%2){
                    return false;
                }
                if(res%2==0 && prev<=que.peek().val){
                    return false;
                }

                if(res%2!=0 && prev>=que.peek().val)
                    return false;
                if (que.peek().left != null)
                    que.add(que.peek().left);
                if (que.peek().right != null)
                    que.add(que.peek().right);
                prev = que.poll().val;
            }
            que.poll();
            if(que.isEmpty()){
                break;
            }
           res++;
            que.add(null);

        }
        return true;
    }
}