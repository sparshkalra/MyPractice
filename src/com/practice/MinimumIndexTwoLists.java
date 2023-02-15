package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] list1 = {"happy","sad","good"}, list2 = {"sad","happy","good"};
		
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));
	}
	public static String[] findRestaurant(String[] list1, String[] list2) 
    {
        List<String> op = new ArrayList<String>();
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for(int i=0;i<list1.length;i++)
        { 
            hm.put(list1[i],i);
            hm.getOrDefault(hm, null)
        }
        for(int i=0;i<list2.length;i++)
        {
            if(hm.containsKey(list2[i]))
            {
                hm.put(list2[i], hm.get(list2[i])+i);
            }
        }
        System.out.println(hm);
        for(int i=0;i<list1.length;i++)
        { 
            if(hm.get(list1[i]) == i && list2[0]!= list1[i])
            {
                hm.remove(list1[i]);
            }
        }

        System.out.println(hm);
        int min =Integer.MAX_VALUE;
        for(Map.Entry<String,Integer> obj:hm.entrySet())
        {
            if(obj.getValue() < min)
            {
                min = obj.getValue();
            }
        }
        System.out.println(min);
        for(Map.Entry<String,Integer> obj:hm.entrySet())
        {
            if(obj.getValue() == min)
            {
                op.add(obj.getKey());
            }
        }
        String[]op1 = new String[op.size()];

        for(int i=0;i<op.size();i++)
        {
            op1[i] = op.get(i);
        }
        return op1;    
    }

}
