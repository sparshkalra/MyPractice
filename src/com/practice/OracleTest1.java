package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class OracleTest1 {

	public static void main(String[] args) 
	{	
		int[]arr = {1,1,2,2,2,3};
		int[]arr1 = {2,3,1,3,2};
		
		int[]op = sortArrayElementsonFrequency(arr);
		int[]op1 = sortArrayElementsonFrequency(arr1);
		
		for(int i=0;i<op.length;i++)
		{
			System.out.print(op[i]+ ",");
		}
		System.out.println();
		for(int i=0;i<op1.length;i++)
		{
			System.out.print(op1[i]+ ",");
		}
		
	}
		
		
		public static int[]sortArrayElementsonFrequency(int[]arr)
		{
			List<CountObject> al = new ArrayList<CountObject>();
			List<Integer> values = new ArrayList<Integer>();
			
			int[]op = new int[arr.length];
			
			for(int i=0;i< arr.length;i++)
			{
				if(values.contains(arr[i]))
				{
					for(CountObject obj:al)
					{
						if(obj.getValue() == arr[i])
						{
							obj.setCount(obj.getCount()+1);
							break;
						}
							
					}
				}
				else
				{
					CountObject obj = new CountObject(arr[i], 1);
					al.add(obj);
					values.add(arr[i]);
				}
			}
			
				Collections.sort(al, new Comparator<CountObject>() {

					@Override
					public int compare(CountObject o1, CountObject o2) 
					{
						if(o1.getCount() > o2.count)
						{
							return 1;
						}
						else if(o1.getCount() < o2.count)
						{	
							return -1;
						}
						else if (o1.getCount() == o2.count)
						{
							if(o1.getValue() > o2.getValue())
							{
								return -1;
							}
							else 
								return 1;
						}
						return 0;
					}
				});
				int opIndex =0;
				for(int j=0; j < al.size();j++)
				{
					int count = al.get(j).getCount();
					
					for(int k=0;k < count;k++)
					{
						op[opIndex] = al.get(j).getValue();
						opIndex++;
					}
				}
			
			return op;
			
			
		

	}

}

class CountObject
{
	int value;
	int count;
	
	public CountObject(int value, int count)
	{
		this.value = value;
		this.count = count;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}


