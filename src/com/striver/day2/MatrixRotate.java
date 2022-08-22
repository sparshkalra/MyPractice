package com.striver.day2;

public class MatrixRotate 
{
	public static void main(String[] args)
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
	 public static void rotate(int[][] matrix) 
	 {
	        
	        int n = matrix.length;
	           
	        for(int i=0;i<n/2;i++)
	        {    
	            for(int j=0;j<n;j++)
	            {    
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[n-1-i][j];
	                matrix[n-1-i][j] = temp;
	            }
	        }
	        
	        for(int i=0;i<n;i++)
	        {    
	            for(int j=0;j<i;j++)
	            {    
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	    }
}
