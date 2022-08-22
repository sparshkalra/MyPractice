package com.practice;

import java.util.*;
import java.util.LinkedList;

public class PriorityQueueProblem 
{
	
	HashMap<String, PriorityQueue<String>> graph;
    LinkedList<String> result;
	
    public static void main(String[] args)
    {
    	List<String> a = new ArrayList<String>();
    	List<String> b = new ArrayList<String>();
    	List<String> c = new ArrayList<String>();
    	List<String> d = new ArrayList<String>();
    	a.add("MUC");a.add("LHR");
    	b.add("JFK");b.add("MUC");
    	c.add("SFO");c.add("SJC");
    	d.add("LHR");d.add("SFO");
    	
    	List<List<String>> tickets = new ArrayList<List<String>>();
    	
    	tickets.add(a);tickets.add(b);
    	tickets.add(c);tickets.add(d);
    	
    	System.out.println(new PriorityQueueProblem().findItinerary(tickets));
    }
    public List<String> findItinerary(List<List<String>> tickets) 
    {

		if (tickets.isEmpty())
			return new LinkedList<String>();

		graph = new HashMap<>(); // native lexical sort destinations
		result = new LinkedList<String>();

		for (List<String> path : tickets) { // construct graph
			String source = path.get(0);
			String destination = path.get(1);
			PriorityQueue<String> pq = graph.getOrDefault(source, new PriorityQueue());
			pq.add(destination); // destination
			graph.put(source, pq); // source
		}

		dfs("JFK"); // start dfs from initial JFK

		return result;
	}

	private void dfs(String city) {
		PriorityQueue<String> nei = graph.get(city);

		if (nei != null) {
			while (!nei.isEmpty()) {
				String dest = nei.poll();
				dfs(dest);
			}
		}

		result.addFirst(city); // starting point must be first.
	}
}
