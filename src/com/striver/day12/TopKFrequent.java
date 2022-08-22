package com.striver.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int[] topKFrequent(int[] nums, int k) 
    {
        int[]op = new int[k];
        Map<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        hm = sortMapByValue(hm);
        int i =0;   
        for(Map.Entry<Integer,Integer> obj: hm.entrySet())
        {
            
            op[i] = obj.getKey();
            i++;
            if(i == k)
            {
                return op;
            }
        }
        return op;
     
       
    }
    
    public Map<Integer,Integer> sortMapByValue(Map<Integer, Integer> hm)
	{
		Map<Integer,Integer>hm1 = new LinkedHashMap<Integer,Integer>();
		List<Map.Entry<Integer,Integer>> list1 = new ArrayList<Map.Entry<Integer,Integer>>          (hm.entrySet());
		list1.in
		Collections.sort(list1, new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		});
		for(int i=0;i<list1.size();i++)
		{
			hm1.put(list1.get(i).getKey(), list1.get(i).getValue());
		}
		return hm1;
	}	
}
