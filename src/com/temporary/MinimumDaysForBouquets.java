package com.temporary;

public class MinimumDaysForBouquets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr1 = {1,10,3,10,2};
		int[]arr3 = {7,7,7,7,12,7,7};
		//System.out.println(minDays(arr1, 3, 1));
		//System.out.println(minDays(arr3, 2, 3));
		
		System.out.println(isPowerOfThree(19684));
	}
	
	public static int minDays(int[] bloomDay, int m, int k) 
    {
        int flowersNeeded = m*k;
        if(flowersNeeded > bloomDay.length)
        {
            return -1;
        }
        int max =0;int l=1;
        for(int i:bloomDay)
        {
            max = Math.max(i,max);
        }
        while(l<=max)
        {
            int flowers =0;
            int bouquets =0;
            for(int i=0;i<bloomDay.length;i++)
            {
                if(bloomDay[i] <=l)
                {
                    flowers++;
                    if(flowers == k)
                    {
                        bouquets++;
                        flowers =0;
                        if(bouquets == m)
                        {
                            return l;
                        }
                    }
                }
                else
                {
                    flowers=0;
                }
            }
            l++;
        }
        return -1;
       
    }
	
	public static boolean isPowerOfThree(int n) 
    {
        if(n==1)
        {
            return true;
        }
        if(n < 3)
        {
            return false;
        }
        int d =0;
        while(n>1)
        {
            d = n%3;
            if(d!=0)
            {
            	 return false;
            }
            n =n/3;
        }
        if(d==0)
        {
            return true;
        }
        return false;
    }

}
