package com.striver.day3;

public class GridUniquePaths 
{
	public static void main(String[]args)
	{
		System.out.println(uniquePathsRecursion(3,2));
		System.out.println(uniquePaths(3,2));
	}
	
	public static int uniquePaths(int m, int n)
	{
		int[][] ar = new int[m][n];
		for (int i = 0; i < m; i++) {
			ar[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			ar[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				ar[i][j] = ar[i - 1][j] + ar[i][j - 1];
			}
		}
		return ar[m - 1][n - 1];
	}
	
	// Using ncr function 2,3
	public static int uniquePathsMaths(int m, int n)
	{
		int N = m+n-2; //3
		//int c = n-1;
		int r = m-1; //2
		int res = 1;
		for(int i=1;i<=r;i++)
		{
			res = res * (N-r+i)/i;
		}
		return res;
	}
	
	 public static int uniquePathsRecursion(int n, int m)
	 {
		 int count = 0;
		 
		 return helper(0,0,n,m, count);
		 
	 }
	 
	 
	 public static int helper(int i, int j,int n, int m, int count)
	 {
		 if(i == n-1 && j == m-1)
		 {
			return 1; 
		 }
		 if(i >=n || j >=m)
		 {
			 return 0;
		 }
		 else
		 {
			 return helper(i+1,j,n,m,count) + helper(i,j+1,n,m,count);
		 }
	 }
}
