package com.practice;

public class MaxSumArray {
	
	public static void main(String[] args)
	{
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1 = {13,7,2,8,3};
		
		String[] board = {"abc","def","ghi"};
		
		System.out.println(new MaxSumArray().solution11(board));
		
		System.out.println(findMax(nums));
		System.out.println(new MaxSumArray().solution(6, 20));
		
		System.out.println(new MaxSumArray().solution(nums1));
		}
	
	public static int findMax(int[] nums)
	{
		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int maxsum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			
			dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);

			maxsum = Math.max(maxsum, dp[i]);
		}

		return maxsum;
	}
	
	public int solution(int A, int B) {
        // write your code in Java SE 8

        int count = 0;
        int min = Math.min(A,B);
        int max = Math.max(A,B);

        for(int i=1;i<min/2;i++)
        {
            int j = i+1;
            int prod = i*j;
            if(prod > min-1 && prod <max+1)
            {
                count++;
            }
            else if(prod > max)
            {
                break;
            }
        }

        return count;
    }
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int max = 1;
	        int count = 0;

	        for(int i=0; i< A.length;i++)
	        {
	            count = 1;
	            int left = A[i];
	            for(int j=i+1; j< A.length;j++)
	            {
	                int op = left&A[j];

	                if(op > 0)
	                {
	                 count++;   
	                 left = op;
	                }
	                else
	                {
	                }
	            }
	            max = Math.max(max, count);

	        }
	        
	        




	        return max;
	    }
	 
	 public int[] solution11(String[] B) {
         // write your code in Java SE 8

         char[][] charArray = new char[B.length][];

         for(int i=0;i< B.length;i++)
         {
             charArray[i] = B[i].toCharArray();
         }

         return null;
     }

}
