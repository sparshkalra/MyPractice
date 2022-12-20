package com.gfg.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,4,7,9,9,12,56};
		int[] a1 = {34, 88, 89, 39, 67, 71, 85, 57, 18, 7, 61, 50, 38, 6, 60, 18, 19, 46, 84, 74, 59};
		List<Integer> al = Arrays.stream(a1)
			      .boxed()
			      .collect(Collectors.toList());
		System.out.println(findMinDiff(al,al.size(),12));
	}
	
	public static long findMinDiff(List<Integer> al, int n, int m)
	{
	        Collections.sort(al);
	        System.out.println(al);
	        //1,3,4,7,9,9,12,56
	        
	        int diff = al.get(m-1) - al.get(0);
	        
	        for(int i=1;i<al.size()-m+1;i++)
	        {
	        	System.out.println("Values:" + al.get(m+i-1)+","+ al.get(i));
	            diff = Math.min(al.get(m+i-1) - al.get(i),diff);
	            System.out.println(diff);
	        }
	        return diff;
	}

}
