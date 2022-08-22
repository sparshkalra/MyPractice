package com.striver.day24;

import java.util.ArrayList;
import java.util.Arrays;

public class DijkstraTemp 
{
	public static void main(String[] args)
	{

		int graph1[][] = new int[][] { { 0, 9, 1, 1 }, { 9, 0, 0, 3 }, { 1, 0, 0, 2 }, { 1, 3, 0, 0, } };

		ArrayList<ArrayList<Integer>> zero = new ArrayList<>();
		ArrayList<ArrayList<Integer>> one = new ArrayList<>();
		ArrayList<ArrayList<Integer>> two = new ArrayList<>();
		ArrayList<ArrayList<Integer>> three = new ArrayList<>();
		
		ArrayList<Integer> zero0 = new ArrayList<>();
		zero0.add(0);
		zero0.add(0);
		ArrayList<Integer> zero1 = new ArrayList<>();
		zero1.add(1);
		zero1.add(9);
		ArrayList<Integer> zero2 = new ArrayList<>();
		zero2.add(2);
		zero2.add(1);
		ArrayList<Integer> zero3 = new ArrayList<>();
		zero3.add(3);
		zero3.add(1);
		
		zero.add(zero0);zero.add(zero1);zero.add(zero2);zero.add(zero3);
		
		ArrayList<Integer> one0 = new ArrayList<>();
		one0.add(0);
		one0.add(9);

		ArrayList<Integer> one3 = new ArrayList<>();
		one3.add(3);
		one3.add(3);
		
		one.add(one0);one.add(one3);
		
		ArrayList<Integer> two0 = new ArrayList<>();
		two0.add(0);
		two0.add(1);
		
		
		ArrayList<Integer> two3 = new ArrayList<>();
		two3.add(3);
		two3.add(2);
		
		two.add(two0);two.add(two3);
		
		ArrayList<Integer> three0 = new ArrayList<>();
		three0.add(0);
		three0.add(1);
		ArrayList<Integer> three1 = new ArrayList<>();
		three1.add(1);
		three1.add(3);

		
		three.add(three0);three.add(three1);
		
		ArrayList<ArrayList<ArrayList<Integer>>> ip = new ArrayList<>();
		
		ip.add(zero);ip.add(one);ip.add(two);ip.add(three);
		
		DijkstraTemp t = new DijkstraTemp();
		t.dijkstra(4, ip,0);
		t.printSolution(t.dijkstra(4, ip,0), 4);
		
		
	}
	void printSolution(int dist[],int V)
	{
		System.out.println("Vertex \t\t Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i + " \t\t " + dist[i]);
	}
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        
        int[] op = new int[V];
        boolean[] vis = new boolean[V];
        
        int[][] graph = new int[V][V];
        
        for(int i=0;i<V;i++)
        {
            ArrayList<ArrayList<Integer>> temp = adj.get(i);
        
            for(ArrayList<Integer> obj: temp)
            {
                graph[i][obj.get(0)] = obj.get(1);
            }
        }
         for(int i=0;i<V;i++)
         {
              for(int j=0;j<V;j++)
              {
                  System.out.print(graph[i][j] + ",");
              }
              System.out.println("");
         }
         System.out.println("-----------");
        
        
        
        Arrays.fill(op,Integer.MAX_VALUE);
        op[S] = 0;
        for(int i=0;i<V-1;i++)
        {
            int u = minDistance(op,vis, V);
            
            vis[u] = true;
            
            
            for(int j=0;j<V;j++)
            {
                if(vis[j] == false && graph[u][j] !=0 && op[u] != Integer.MAX_VALUE 
                && op[u]+graph[u][j] < op[j])
                {
                    op[j] = op[u] + graph[u][j];
                }
            }
        }
        return op;
    }
    
    static int minDistance(int[]dis, boolean[]vis, int V)
    {
        int min = Integer.MAX_VALUE; int index = -1;
        
        for(int i =0;i<V;i++)
        {
            if(dis[i] <= min && vis[i] == false)
            {
                min = dis[i];
                index = i;
            }
        }
        return index;
        
    }
    
    
}

