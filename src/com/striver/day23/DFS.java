package com.striver.day23;

import java.util.ArrayList;

public class DFS 
{
	static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String args[]) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();

        // adding new arraylists to 'adj' to add neighbour nodes
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(4);
        adj.get(4).add(1);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);

		
		  ArrayList < Integer > ans = dfsOfGraph(5, adj); printAns(ans);
		 
        
        System.out.println("---------------------------------");

    }
	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
		ArrayList<Integer> op = new ArrayList<Integer>();
		boolean[] vis = new boolean[V];
		
		for(int i=0;i<V;i++)
		{
			if(vis[i] == false)
			{
				vis[i] = true;
				dfs(i,vis,adj,op);
			}
		}
		return op;
    }
	public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> op) 
	{
		op.add(node);
		
		ArrayList<Integer> temp = adj.get(node);
		
		for(int i: temp)
		{
			if(vis[i] == false)
			{
				vis[i] = true;
				dfs(i,vis,adj,op);
			}
		}
	}
		
	
}
