package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingOneQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	void push(int x)
    {
        //  Get previous size of queue
        int s = q1.size();
 
        // Push the current element
        q1.add(x);
 
        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }
 
    void pop()
    {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }
}
