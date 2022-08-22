package com.practice;

public class NoOfWaystoPay {

	public static void main(String[] args) {
	
		int[]arr = {2,3,4};
		int n =9;
		
		//System.out.println(calculateWays(arr,n));
		
		System.out.println(minCostClimbingStairsWithThreeSteps(4));

	}
	
	public static int calculateWays(int[]arr, int n)
	{
		int table[]=new int[n+1];
		 
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[] values
	    // after the index greater than or equal to the value of the
	    // picked coin
	    for(int i=0; i<arr.length; i++)
	        for(int j=arr[i]; j<=n; j++)
	            table[j] = table[j]+table[j-arr[i]];
	 
	    return table[n];
	}
	
	 public static int minCostClimbingStairsWithThreeSteps(int n) {
	        
		 int[]arr = new int[n+1];
		 
		 arr[0] = 1;
		 arr[1] = 1;
		 arr[2] = 2;
		 
		    // Pick all coins one by one and update the table[] values
		    // after the index greater than or equal to the value of the
		    // picked coin
		    for(int i=3; i<=n; i++)
		    {
		    	arr[i] = arr[i-1]+ arr[i-2]+arr[i-3];
		    }
		 
		    return arr[n];

}
}
