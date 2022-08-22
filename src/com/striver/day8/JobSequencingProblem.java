package com.striver.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class JobSequencingProblem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
/*
 * 1 2 100 
 * 2 1 19 
 * 3 2 27 
 * 4 1 25 
 * 5 1 15
 */
/*
 * 1 56 288 2 27 435 3 67 401 4 64 368 5 94 248 6 54 361 
 * 7 43 108 8 96 167 9 73 251 10 96 170 11 14 156 12 78 184 13 61 370 14 77 424 15 68 397 16 40 375 17 36 218		
 */
		
		Job job1 = new Job(1, 56, 288);Job job2 = new Job(2, 27, 435);Job job3 = new Job(3, 67, 401);
		Job job4 = new Job(4, 64, 368);Job job5 = new Job(5,94,248);Job job6 = new Job(6, 54,361);
		Job job7 = new Job(7, 43, 108);Job job8 = new Job(8, 96, 167);Job job9 = new Job(9 ,73 ,251);
		Job job10 = new Job(10, 96, 170);Job job11 = new Job(11, 14, 156);Job job12 = new Job(12, 78, 184);
		Job job13 = new Job(13, 61, 370);Job job14 = new Job(14, 77, 424);Job job15 = new Job(15, 68, 397);
		Job job16 = new Job(16, 40, 375);Job job17 = new Job(17,36,218);
		
		 Job[] arr = {job1, job2,job3,job4,job5,job6,job7, job8,job9,job10,job11,job12,job13, job14,job15,job16,job17};
		 
		 System.out.println(Arrays.toString(new JobSequencingProblem().jobScheduling(arr, 5)));
		
	}
	int[] jobScheduling(Job arr[], int n)
    {
		int[] op = new int[2];
		int jobs = 0;
		int profit = 0;
		Arrays.sort(arr, new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) 
			{
				return o2.profit - o1.profit;
			}
		});
		int maxDays = 0;
		Map<Integer, Integer> hm = new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			maxDays = Math.max(maxDays, arr[i].deadline);
		}
		for(int i=1;i<=maxDays;i++)
		{
			hm.put(i, -1);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i].deadline) == -1)
			{
				hm.put(arr[i].deadline, arr[i].profit);
				profit = profit+ arr[i].profit;
				jobs++;
			}
			else
			{
				for(Map.Entry<Integer, Integer> obj:hm.entrySet())
				{
					if(obj.getValue() == -1 && obj.getKey() < arr[i].deadline)
					{
						hm.put(obj.getKey(), arr[i].profit);
						profit = profit+ arr[i].profit;
						jobs++;
						break;
					}
				}
			}
		}
		
		op[0] = jobs;
		op[1] = profit;
		return op;
    }

}

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
	@Override
	public String toString() {
		return "Job [id=" + id + ", profit=" + profit + ", deadline=" + deadline + "]";
	}
    
    
}