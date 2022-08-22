package com.striver.day9;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum 
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(2);al.add(3);
		System.out.println(subsetSums(al));
		
	}
	static List<Integer> subsetSums(List<Integer> arr)
    {
        ArrayList<Integer> op = new ArrayList<Integer>();  
        op.add(0);
	    for (int num : arr) 
		{
	    	List<Integer> temp = new ArrayList<>();
	    	for(int curr:op)
	    	{	
	    		temp.add(curr+num);
	    	}
	    	op.addAll(temp);
		}
		
		return op;
    }
}
