package com.striver.day3;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row =0;
        int col = matrix[0].length-1;
        
        while(row <matrix.length && col<matrix[0].length && row >=0 && col >=0)
        {
            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] < target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return false;
    }

}
