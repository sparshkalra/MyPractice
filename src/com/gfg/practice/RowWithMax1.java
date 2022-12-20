package com.gfg.practice;

public class RowWithMax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int rowWithMax1s(int arr[][], int n, int m) 
    {
        int j = arr[0].length-1;
        int op =0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++)
        {
            while(j >=0 && arr[i][j] == 1)
            {
                flag = true;
                j--;
                op = i;
            }
        }
        if(!flag)
        {
            return -1;
        }
        return op;
    }

}
