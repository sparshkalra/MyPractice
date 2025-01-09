package com.temporary;

public class NumberSteps {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numSteps("1101"));
		
	}
	
	public static int numSteps(String s) 
    {
        int number = 0;

        number = Integer.parseInt(s,2); 
        int count=0;
        while(number >1)
        {
        	if(number%2 ==0)
        	{
        		number = number/2;
        	}
        	else
        		number++;
        	count++;
        }
        return count;
    }

}
