package com.practice;

import java.util.ArrayList;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println(new HappyNumber().isHappy(19));
	
		System.out.println(new HappyNumber().isHappy(1));*/
		
		System.out.println(new HappyNumber().isHappy(2));
	}
	
    public boolean isHappy(int n) {
        boolean flag = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(n!=1)
        {
           int sum =0;
            while(n >0)
            {
               
                int digit = n%10;
                sum = sum + (digit*digit);
                n =n/10;
            }
            n = sum;
            
            if(n ==1)
            {
                return true;
            }
            if(al.contains(n))
            {
                return false;
            }
            al.add(n);
        }
        
        return flag;
    }

}
