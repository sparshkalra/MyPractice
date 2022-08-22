package com.practice;

public class FindingMaxOneRow {

	public static void main(String[] args) {
		
		int[][]data = {{0,0,0,0,1,1,1},{0,0,0,1,1,1,1},{1,1,1,1,1,1,1},{0,0,0,0,0,0,0}};
		
		
		System.out.println(finMaxRow(data));
		
	}
	static int max =0;
	public static int finMaxRow(int[][]data)
	{
		int R = data.length;
		int C = data[0].length;
		int j=data[0].length-1;
		int max_row_index = 0;
				
		for (int i = 0; i < R; i++) {
            while (j >= 0 && data[i][j] == 1) 
            {
                j = j - 1; // Update the index of leftmost 1
                       // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
          if(max_row_index==0&&data[0][C-1]==0)
              return -1;
        return max_row_index;
    }
		
	
	

}
