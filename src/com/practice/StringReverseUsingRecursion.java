package com.practice;

public class StringReverseUsingRecursion {

	public static void main(String[] args) {

		String str = "sparsh";
		System.out.println(reverseString(str));
		System.out.println(factorial(6));
		System.out.println(palindromeUsingRecursion(str));
		System.out.println(palindromeUsingRecursion("nitin"));
		System.out.println(palindromeUsingRecursion("hihih"));
		
	}
	
	public static String reverseString(String str)
	{
		System.out.println("Input param is:    "+ str);
		if (str.length() < 2) 
		{
            return str;
        }
		return reverseString(str.substring(1)) + str.charAt(0);

	}
	public static boolean palindromeUsingRecursion(String str)
	{
		
		return palindromeUsingRecursion(str, 0, str.length()-1);
	}
	public static boolean palindromeUsingRecursion(String str, int s, int e)
	{
		if (str.length() < 2) 
		{
            return true;
        }
		if(str.charAt(s)!= str.charAt(e))
		{
			return false;
		}
		if(s < e+1)
		{
			palindromeUsingRecursion(str,s+1,e-1);
		}
		return true;
	}
	
	
	
	static int factorial(int n)
    {
        if (n == 0)
            return 1;
  
        return n * factorial(n - 1);
    }

}
