package com.practiceTest;

import java.util.ArrayList;
import java.util.List;

public class CoursePrereq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	        // Step 1: Build the graph (adjacency list)
	        List<List<Integer>> graph = new ArrayList<>();
	        for (int i = 0; i < numCourses; i++) {
	            graph.add(new ArrayList<>());
	        }
	        
	        for (int[] prereq : prerequisites) {
	            graph.get(prereq[1]).add(prereq[0]);
	        }
	        
	        // Step 2: Track visited courses
	        int[] visited = new int[numCourses];
	        
	        // Step 3: Traverse each course to detect cycles
	        for (int i = 0; i < numCourses; i++) {
	            if (visited[i] == 0) {
	                if (hasCycle(i, graph, visited)) {
	                    return false; // A cycle detected
	                }
	            }
	        }
	        
	        return true; // No cycles, all courses can be completed
	    }
	    
	    private boolean hasCycle(int course, List<List<Integer>> graph, int[] visited) {
	        // 0 -> unvisited, 1 -> visiting, 2 -> visited
	        if (visited[course] == 1) {
	            return true; // Cycle detected
	        }
	        
	        if (visited[course] == 2) {
	            return false; // Already processed, no cycle
	        }
	        
	        // Mark the course as being visited
	        visited[course] = 1;
	        
	        // Visit all the neighbors (prerequisite courses)
	        for (int neighbor : graph.get(course)) {
	            if (hasCycle(neighbor, graph, visited)) {
	                return true; // Cycle detected in DFS
	            }
	        }
	        
	        // Mark the course as fully visited
	        visited[course] = 2;
	        
	        return false; // No cycle detected
	    }

}
