package com.temporary;

public class AverageWaitTime {

	//https://leetcode.com/problems/average-waiting-time/description/?envType=daily-question&envId=2024-07-09
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]arr = {{1,2},{2,5},{4,3}};
		//2
		//3
		
		//5 12
		//5
		System.out.println(averageWaitingTime(arr));
	}

	public static double averageWaitingTime(int[][] customers) 
    {
        double totalWaitingTime =0;
        int currentTime =0;
        for(int i=0;i<customers.length;i++)
        {
            int diffTime =0;
            if(customers[i][0] < currentTime)
            {
                diffTime = currentTime - customers[i][0];
            }
            else
            {
            	currentTime = customers[i][0];
            }
            diffTime = diffTime +customers[i][1];
            totalWaitingTime = totalWaitingTime+diffTime;
            currentTime = currentTime+customers[i][1];
        } 
        return totalWaitingTime/customers.length; 
    }
}
