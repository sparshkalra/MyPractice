package com.practice;

public class UglyNumber2 
{
	public static void main(String[] args)
	{
		System.out.println(nthUglyNumber(10));
	}
	public static int nthUglyNumber(int n) 
    {
        int count= 0;;
        for(int i=1;i<Integer.MAX_VALUE;i++)
        {
            int num = i;
            if(num < 7)
            {
                count++;
                if(count ==n)
                {
                    return num;
                }
            }
            
            else
            {
                while(num >1)
                {
                    if(num %2 == 0)
                    {
                        num = num/2;
                    }
                    else if(num %3 == 0)
                    {
                        num = num/3;
                    }
                    else if(num %5 == 0)
                    {
                        num = num/5;
                    }
                    else
                    {
                        break;
                    }
                    if(num ==1)
                    {
                        count++;
                        break;
                    }
                }
                if(count == n)
                {
                    return i;
                }
            }
        }
        return 0;    
    }
}
