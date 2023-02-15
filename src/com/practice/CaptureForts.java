package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CaptureForts {

	//https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/submissions/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,0,0,-1,0,0,0,0,1};
		int[] arr1 = {1,0,0,-1,0,0,-1,0,0,1};
		
		System.out.println(captureForts(arr));
	}
	
	 public static int captureForts(int[] forts) 
	    {
	       int n = forts.length;
	    
	        List<Integer> list = new ArrayList<>();
	        for(int i=0;i<n;i++)
	        {
	            if(forts[i]!=0)
	             list.add(i);   
	        }
	        int max=0;
	        for(int i=0;i<list.size()-1;i++)
	        {
	            if(forts[list.get(i)]==-1*forts[list.get(i+1)])
	                max=Math.max(max,list.get(i+1)-list.get(i)-1);
	        }
	        return max;  
	    }

}
