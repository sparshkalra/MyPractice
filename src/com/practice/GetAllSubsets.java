package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GetAllSubsets {

	public static void main(String[] args)
	{
		int[]arr = {1,2,2,1};
		
		System.out.println(subsets(arr));
		
		/*List<List<Integer>> op = getSubsets(arr, 6);
		
		int count =0;
		for(int i=0;i<op.size();i++)
		{
			List<Integer> al = op.get(i);
			
			for(int j=0;j<al.size();j++)
			{
				if(al.get(j) ==6)
				{
					count++;
				}
			}
		}
		System.out.println(count);*/
		
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> output = new ArrayList<List<Integer>>();
	    output.add(new ArrayList<Integer>());

	    for (int num : nums) 
		{
			List<List<Integer>> newSubsets = new ArrayList<List<Integer>>();
			for (List<Integer> curr : output) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(curr);
				temp.add(num);

				newSubsets.add(temp);
			}
			for (List<Integer> curr : newSubsets) {
				output.add(curr);
			}
		}
	    output.remove(0);
	    return output;
	  }
}
