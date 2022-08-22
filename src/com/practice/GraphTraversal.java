package com.practice;

import java.util.ArrayList;

public class GraphTraversal 
{
	public static void main(String[] args)
	{
		int n = 3;
		int[][]edges = {{0,1},{1,2},{2,5}};
		int start = 0; 
		int end = 2;
		
		System.out.println(validPath(n, edges, start, end));
		
		
	}
	public static boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        
        return hasPath(n, graph, start, end, visited);
    }
    
    private static boolean hasPath(int n, ArrayList<Integer>[] graph, int start, int end, boolean[] visited) {
        if(start == end) {
            return true;
        }
        
        visited[start] = true;
        
        for(int edge : graph[start]) {
            if(!visited[edge]) {
                boolean newPath = hasPath(n, graph, edge, end, visited);
                if(newPath) return true;
            }
        }
        
        return false;
    }
}


