package com.striver.day23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS 
{
	public static ArrayList < Integer > bfsOfGraph(int V, ArrayList < ArrayList < Integer >> adj) 
	{
		ArrayList<Integer> op = new ArrayList<>();
		
		boolean[] vis = new boolean[V];
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(0);
		vis[0] = true;
		
		while(q.isEmpty() == false)
		{
			int obj = q.poll();
			op.add(obj);
			ArrayList<Integer> temp = adj.get(obj);
			
			for(int i: temp)
			{
				if(vis[i] == false)
				{
					q.add(i);
					vis[i] = true;
				}
			}
		}
		return op;
		
		
		
	}
	
	static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String args[]) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);
        adj.get(1).add(3);
        
       


        ArrayList < Integer > ans = bfsOfGraph(5, adj);
        printAns(ans);



    }
}
