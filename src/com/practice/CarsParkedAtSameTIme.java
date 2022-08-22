package com.practice;

import java.util.*;

public class CarsParkedAtSameTIme {

	// Java program for the above approach

	public static void main(String[] args)
	{
		
		// Given array
		int arr[][] = { { 1012, 1136 },
						{ 1317, 1412 },
						{ 1015, 1020 } };

		// Size of the array
		int N = arr.length;

		// Function Call
		maxCars(arr, N);
		int[] a = {1012, 1317,1015};
		int[] d = {1136, 1412, 1020 };
		
		System.out.println(maxCars(a, d, N));
	}

	static int maxCars(int[] arr, int[] dep, int n)
	{

		int op =0;
		
		int maxCurrent = 1;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i=0;int j=0;
		while(i <n && j< n)
		{
			if(arr[i] <= dep[j])
			{
				maxCurrent++;
				i++;
			}
			else
			{
				j++;
				maxCurrent--;
				op = Math.max(maxCurrent, op);
			}
		}
		
		return op;
    
	}
	// Pair class
	static class pair
	{
		int first;
		boolean second;

		pair(int first, boolean second)
		{
			this.first = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "pair [first=" + first + ", second=" + second + "]";
		}
		
		
	}

	// Function to count maximum number
	// of cars parked at the same
	static void maxCars(int arr[][], int N)
	{
		
		// Stores info about
		// entry and exit times
		pair a[] = new pair[2 * N];

		// Convert given array to new array
		for(int i = 0; i < N; i++)
		{
			a[2 * i] = new pair(arr[i][0], true);
			a[2 * i + 1] = new pair(arr[i][1], false);
		}

		// Sort array in ascending
		// order of time
		Arrays.sort(a, (p1, p2) -> p1.first - p2.first);

		// Stores current maximum
		// at every iteration
		int curMax = 0;

		// Stores final maximum number
		// of cars parked at any time
		int maxFinal = 0;

		// Traverse the array
		for(int i = 0; i < 2 * N; ++i)
		{
			
			// When car entered
			if (a[i].second)
			{
				curMax++;
			}

			// When car exits
			else
			{
				if (curMax > maxFinal)
				{
					maxFinal = curMax;
				}
				curMax--;
			}
		}

		// Print the answer
		System.out.println(maxFinal);
	}

	// Driver Code


	// This code is contributed by Kingash

}
