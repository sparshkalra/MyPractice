package com.temporary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] difficulty = {2,4,6,8,10}, profit = {10,20,30,40,50}, worker = {4,5,6,7};
		
		System.out.print(maxProfitAssignment(difficulty, profit, worker));
	}

	public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
		List<int[]> al = new ArrayList<int[]>();
		
		int maxProfit=0;
		for (int i = 0; i < profit.length; i++) {
			al.add(new int[] { difficulty[i], profit[i] });
		}
		Collections.sort(al, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(worker);
		
		for(int i=0;i<worker.length;i++)
		{
			int tempProfit =0;
			for(int j=al.size()-1;j>=0;j--)
			{
				if(worker[i] >=al.get(j)[0])
				{
					tempProfit = Math.max(tempProfit, al.get(j)[1]);
				}
			}
			maxProfit = maxProfit+ tempProfit;
		}
		
	return maxProfit;

		}


}
