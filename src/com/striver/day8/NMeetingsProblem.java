package com.striver.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class NMeetingsProblem {

	public static void main(String[] args) 
	{
		int[] start = {3,0,5,8,5,1};
		int[] end =  {4,6,7,9,9,2};
		
		System.out.println(noOfMeetings(start, end));
	}
	
	
	public static int noOfMeetings(int[] start, int[] end)
	{
		int op = 1;
	     
		ArrayList<Meeting> al = new ArrayList<Meeting>();
		
		for(int i=0;i<start.length;i++)
		{
			Meeting obj = new Meeting(start[i], end[i]);
			
			al.add(obj);
		}
	    int time_limit = 0;
	     
	     
	    // Sorting of meeting according to
	    // their finish time.
	    Collections.sort(al, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting o1, Meeting o2) {
				// TODO Auto-generated method stub
				return o1.end - o2.end;
			}
		});
	     
	    // Initially select first meeting.
	     
	    // time_limit to check whether new 
	    // meeting can be conducted or not.
	    time_limit = al.get(0).end;
	     
	    // Check for all meeting whether it 
	    // can be selected or not.
	    for(int i = 1; i < al.size(); i++)
	    {
	        if (al.get(i).start > time_limit)
	        {
	             
	            // Add selected meeting to arraylist
	        	op++;	             
	            // Update time limit
	            time_limit = al.get(i).end;
	        }
	    }
	    return op;
	}
	
	static class Meeting
	{
	    int start;
	    int end;
	     
	    Meeting(int start, int end)
	    {
	        this.start = start;
	        this.end = end;
	    }

		@Override
		public String toString() {
			return "Meeting [start=" + start + ", end=" + end;
		}
	    
	    
	}
}
