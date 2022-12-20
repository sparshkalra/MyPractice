package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class TopVotedCandidate {

	int[] persons;
    int[] times;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] persons = {0,0,1,1,2};
		int[] times = {0,67,69,74,87};
		TopVotedCandidate tvc = new TopVotedCandidate(persons, times);
		
		System.out.println(tvc.q(4));
		System.out.println(tvc.q(62));
		System.out.println(tvc.q(100));
		System.out.println(tvc.q(88));
		System.out.println(tvc.q(70));
		System.out.println(tvc.q(73));
		System.out.println(tvc.q(22));
		System.out.println(tvc.q(75));
		System.out.println(tvc.q(29));
		System.out.println(tvc.q(10));
		
		
	}
	
    public TopVotedCandidate(int[] persons, int[] times) 
    {
        this.persons = persons;
        this.times = times;
    }
    
    public int q(int t) 
    {
        int index = 0;
        boolean found = false;
        for(int i=0;i<times.length;i++)
        {
            if(times[i] == t)
            {
                index = i;
                found = true;
                break;
            }
            else if(times[i] >t)
            {
                index = i-1;
                found = true;
                break;
            }
        }
        if(!found)
        {
        	index = persons.length-1;
        }
        Map<Integer,Integer> hm = new LinkedHashMap();
        for(int i=0;i<=index;i++)
        {
            if(hm.containsKey(persons[i]))
            {
                int val = hm.get(persons[i]);
                hm.remove(persons[i]);
                hm.put(persons[i], val+1);
            }
            else
            {
                hm.put(persons[i],1);
            }
        }
        int max =0;
        int op = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> obj: hm.entrySet())
        {
            if(obj.getValue() >= max)
            {
                op = obj.getKey();
                max = obj.getValue();
            }
        }
        return op;
    }

}
