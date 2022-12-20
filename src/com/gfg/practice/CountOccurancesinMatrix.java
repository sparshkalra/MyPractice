package com.gfg.practice;

public class CountOccurancesinMatrix {

	static int op1 =0;
	public static void main(String[] args) {
		
		
		char[][] a ={
	            {'D','D','D','G','D','D'},
	            {'B','B','D','E','B','S'},
	            {'B','S','K','E','B','K'},
	            {'D','D','D','D','D','E'},
	            {'D','D','D','D','D','E'},
	            {'D','D','D','D','D','G'}
	           };
		
		char[][] a1 = {
	            {'B','B','M','B','B','B'},
	            {'C','B','A','B','B','B'},
	            {'I','B','G','B','B','B'},
	            {'G','B','I','B','B','B'},
	            {'A','B','C','B','B','B'},
	            {'M','C','I','G','A','M'}
	            };
	    
		System.out.println(countOccurances(a, "GEEKS"));
		System.out.println(countOccurances(a1, "MAGIC"));

	}
	
	private static int countOccurances(char[][] arr, String str)
	{
		int op = 0;
		op1 = 0;
		char start = str.charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j] == start)
				{
					dfs(arr,i+1,j,str,1,op);
					dfs(arr,i-1,j,str,1,op);
					dfs(arr,i,j+1,str,1,op);
					dfs(arr,i,j-1,str,1,op);
				}
			}
		}
		return op1;
	}
	public static void dfs(char[][]arr, int i,int j,String str, int currentChar,int op)
	{
		//System.out.println("Coming for i:" +i +",j:" +j );
		if(i < 0 || j < 0 || i == arr.length || j == arr[0].length)
		{
			return;
		}
		
		if(arr[i][j] == str.charAt(currentChar))
		{
		//	System.out.println("Found");
			if(currentChar == str.length()-1)
			{
				op1++;
				System.out.println("FInal at i=" +i+" j,"+j);
				return;
			}
			dfs(arr,i+1,j,str,currentChar +1,op);
			dfs(arr,i-1,j,str,currentChar +1,op);
			dfs(arr,i,j+1,str,currentChar +1,op);
			dfs(arr,i,j-1,str,currentChar +1,op);
		}
		
	}

}
