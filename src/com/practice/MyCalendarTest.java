package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * MyCalendar mc = new MyCalendar();
		 * 
		 * System.out.println(mc.book(10, 20)); System.out.println(mc.book(15, 25));
		 * System.out.println(mc.book(20, 30));
		 */
		
		
		
		MyCalendarTwo mc2 = new MyCalendarTwo();
		
		System.out.println(mc2.book(10, 20));
		System.out.println(mc2.book(50, 60));
		System.out.println(mc2.book(10, 40));
		System.out.println(mc2.book(5, 15));
		System.out.println(mc2.book(5, 10));
		System.out.println(mc2.book(25, 55));
	}

}
class MyCalendarTwo {

    Map<Integer,Integer> hm;
    public MyCalendarTwo() {
        hm = new HashMap();
    }
    
    public boolean book(int start, int end) 
    {
    	HashMap<Integer,Integer> hm2 = new HashMap();
    	hm2.putAll(hm);
    	for(int i=start;i<end;i++)
    	{
    		if(hm2.containsKey(i) && hm2.get(i) >1)
    		{
    			return false;
    		}
    		else if(hm2.containsKey(i))
    		{
    			hm2.put(i, 2);
    		}
    		else
    		{
    			hm2.put(i, 1);
    		}
    	}
    	hm.putAll(hm2);
    	
        return true;
        
        
    }
}






class MyCalendar
{

	private List<int[]> calendar;
	MyCalendar() {
	    
		calendar = new ArrayList<>();
	}

	public boolean book(int start, int end) 
	{
		for (int[] x : calendar) {
            if ((start < x[0] && end > x[0]) || (start == x[0]) || (start > x[0] && start < x[1])) {
                return false;
            }
        }
        calendar.add(new int[]{start, end});
        return true;
	}
}


