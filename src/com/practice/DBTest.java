package com.practice;

import java.util.ArrayList;
import java.util.List;

public class DBTest 
{
	public static void main(String[] args)
	{
		int noOfUnique = 2;
		List<Integer>al = new ArrayList<Integer>();

		
		
		int[] packetArr = {1,1,1,2,1};
		int[] uniqueArr = {1,2,3};
		
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<packetArr.length;i++)
		{

			int count =0;
			al = new ArrayList<Integer>();
			for(int k=0;k<uniqueArr.length;k++)
			{
				
				al.add(uniqueArr[k]);
			}
			for(int j=i;j< packetArr.length;j++)
			{
				if(al.contains(packetArr[j]))
				{
					count++;
					al.remove(Integer.valueOf(packetArr[j]));
					
					if(count == noOfUnique)
					{
						System.out.println("Value of i " + i + "value of j:" +j + "count is" + count + " Unique "+ noOfUnique);
						int current = j -i;
						if(current < min)
						{
							min = current;
						}
						break;
					}
				}
			}
		}
		System.out.println(min+1);
	}
	
	
}
