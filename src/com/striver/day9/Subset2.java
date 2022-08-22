package com.striver.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Subset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,2};
		
		System.out.println(subsetsWithDup(nums));
	}
	static public List<List<Integer>> subsetsWithDup(int[] nums) 
	{

	    Map<String, List<Integer>> output = new HashMap<String,List<Integer>>();
	    output.put("",new ArrayList<Integer>());

	    for (int num : nums) 
		{
			List<List<Integer>> newSubsets = new ArrayList<List<Integer>>();
			for (Map.Entry<String, List<Integer>> obj : output.entrySet()) {
				List<Integer> curr = obj.getValue();
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(curr);
				temp.add(num);

				newSubsets.add(temp);
			}
			for (List<Integer> curr : newSubsets) 
			{
				Collections.sort(curr);
				output.put(String.valueOf(curr), curr);
			}
		}
	    List<List<Integer>> op = new ArrayList<>();
	    
	   // x = types.stream()                               // stream of maps
	    // List<List<Integer>> x = output.entrySet().stream().filter().map(Map.Entry::getValue).collect(Collectors.toList());
	    for(Map.Entry<String, List<Integer>> obj: output.entrySet())
	    {
	    	op.add(obj.getValue());
	    }
	    return op;
	}

}
