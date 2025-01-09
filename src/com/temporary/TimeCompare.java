package com.temporary;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimeCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findMinDifference(List<String> timePoints) 
    {
		int min = Integer.MAX_VALUE;
		int[] timeArr = new int[timePoints.size()];

		for(int i=0;i<timePoints.size();i++)
		{
			String time = timePoints.get(i);
			
			String hour = time.substring(0,2);
			String minutes = time.substring(3,5);
			
			timeArr[i] = Integer.parseInt(hour)*60+Integer.parseInt(minutes);
		}
		Arrays.sort(timeArr);
		
		for(int i=1;i<timeArr.length;i++)
		{
			min = Math.min(min, timeArr[i] - timeArr[i-1]);
		}
		min = Math.min(min, 24*60-timeArr[timeArr.length-1] - timeArr[0]);
		return min;
    }

}
