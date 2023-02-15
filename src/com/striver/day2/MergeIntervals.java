package com.striver.day2;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) 
	{
		int[][] intervals = new int[][] {{1,4},{4,5}};
		int[][] intervals1 = new int[][] {{1,3},{2,6},{8,10},{15,18}};
		
		
		 int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
		  int[][] op = merge(intervals);
		  
			
			  for(int i=0;i<op.length;i++) {
			  System.out.print(op[i][0]);System.out.print(",");System.out.print(op[i][1]);
			  System.out.println(); }
			 		 
		
		 //System.out.println(eraseOverlapIntervals(arr));
				
	}
	public static int eraseOverlapIntervals(int[][] intervals) 
    {
		Arrays.sort(intervals,(a,b)->(a[1]-b[1]));

        int start=intervals[0][0];
        int end=intervals[0][1];

        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                count++;
            }
            else{
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        return count;

    }
	
	public static int[][] merge(int[][] intervals) 
    {
		Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
	    Stack<int[]> st = new Stack<>();
	    st.push(intervals[0]);
	    for(int i = 1 ; i< intervals.length ; i++){
	        int[] stack = st.peek();
	        if(stack[1]>intervals[i][1]){
	            continue;   
	        }
	        else if(stack[1]>=intervals[i][0]){
	            int[] res = st.pop();
	            res[1] = intervals[i][1];
	            st.push(res);
	        }else if(stack[1]<intervals[i][0]){
	            int[] arr = {intervals[i][0],intervals[i][1]};
	            st.push(arr);
	        }
	    }
	    int[][] m = new int[st.size()][2];
	    int i = st.size()-1;
	    while(st.size() >0){
	        int[] res = st.pop();
	        m[i][0] = res[0];
	        m[i][1] = res[1];
	        i--;
	    }
	    return m;

    }
}

