package com.practice;

public class NoThreeELementIncOrDec {

	public static void main(String[] args) {

		int[] arr = {5, 2, 3, 6, 1};
		System.out.println(minimumRemoval(arr));
		int[] arr1 = { 4, 2, 6, 3, 10, 1};
		System.out.println(minimumRemoval(arr1));
	}
	
	public static int minimumRemoval(int[] arr)
	{
		int count =0;
		boolean incFlag = true;
		
		if(arr[1] > arr[0])
		{
			incFlag = true;
		}
		else
			incFlag = false;
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i+1] > arr[i])
			{
				if(incFlag)
					count++;
				else
					incFlag = true;
			}
			else if(arr[i+1] < arr[i])
			{
				if(!incFlag)
					count++;
				else
					incFlag = false;
			}
			else
				continue;
		}
		
		return count;
		
	}

}
