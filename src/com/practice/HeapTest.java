package com.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class HeapTest {
	public static void firstKelements(int arr[], int size, int k) 
	{

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < k; i++) 
		{
			minHeap.add(arr[i]);
		}


		for (int i = k; i < size; i++) {


			if (minHeap.peek() > arr[i])
				continue;


			else {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		Iterator<Integer> iterator = minHeap.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("Kth largest+ "+ minHeap);
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 1,1000, 2, 15, 5, 4,
                45, 88, 96, 50, 45 };
		
		firstKelements(arr, arr.length,2);
   
	}
}
