package com.striver.day25;

public class KnapSackProblem 
{
	static int knapSack(int W, int wt[], int val[], int n)
    {
        int K[][] = new int[n + 1][W + 1];
  
        // Build table K[][] in bottom up manner
        for (int i = 0; i<= n; i++) {
            for (int w = 0; w<= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1]<= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
  
        return K[n][W];
    }
	
	public static void main(String args[])
    {
        int wt[] = new int[] { 1, 3, 4, 5};
        int val[] = new int[] { 1, 4, 5, 7};
        int W = 7;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
