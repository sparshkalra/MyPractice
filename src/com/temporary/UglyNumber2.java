package com.temporary;

public class UglyNumber2 {

	//https://leetcode.com/problems/ugly-number-ii/description/?envType=daily-question&envId=2024-08-18
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1,2,3,4,5,6,8,9,10,12,15
		//System.out.println(nUglyNumber(5));
		System.out.println(findComplement(5));
		System.out.println(findComplement(1));
	}
	
	public static int nUglyNumber(int n)
	{
		int [] dp = new int[n+1];
		
		dp[0] = 1;
		
		int p1=0,p2=0,p3=0;
		
		for(int i=1;i<=n;i++)
		{
			int twoMul = dp[p1]*2;
			int threeMul = dp[p2]*3;
			int fiveMul = dp[p3]*5;
			
			dp[i] = Math.min(Math.min(twoMul, threeMul), fiveMul);
			if(dp[i] == twoMul) 
				p1++;
            if(dp[i] == threeMul) 
            	p2++;
            if(dp[i] ==  fiveMul) 
            	p3++;
		}
		return dp[n];
		
	}
	
	public static int findComplement(int num) 
    {
        StringBuilder sb = new StringBuilder("");

        while(num >0)
        {
            sb.append(num%2);
            num = num/2;
        }
        sb.reverse();
        int number =0;
        int flag = 0;
        for(int i=0;i<sb.length();i++)
        {
        	int n = sb.charAt(i) -'0';
        	if(n ==1)
            {
                n =0;
            }
            else
            {
                n =1;
            }
        	number = (int) (number+ (n* Math.pow(2,flag)));
            flag++;
        }
        return number;    
    }
	

}
