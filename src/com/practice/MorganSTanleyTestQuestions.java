package com.practice;

import java.util.HashMap;

public class MorganSTanleyTestQuestions {
	public static void main(String[] args) 
	{
		System.out.println(printNumberInWords(2));
		System.out.println(printNumberInWords(20));
		System.out.println(printNumberInWords(201));
		System.out.println(printNumberInWords(2018));
		
		int []arr = {7,18,3,4,6};
		//System.out.println(secondLarget(arr));
		
/*		System.out.println(convertHexToDec("67"));
		System.out.println(convertHexToDec("512"));
		System.out.println(convertHexToDec("123"));
		
		
		System.out.println(convertDecToBinary("7"));
		System.out.println(convertDecToBinary("10"));
		System.out.println(convertDecToBinary("12"));*/
	}
	
	
	public static int secondLarget(int[]arr)
	{
		int min = arr[0];
		int secondMin = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i] < secondMin && arr[i]!=min)
			{
				secondMin = arr[i];
			}
		}
		return secondMin;
	}

	public static String printNumberInWords(int iNum) {
		String nums = String.valueOf(iNum);
		char[] num = nums.toCharArray();
		int len = num.length;
		String op = "";

		// Base cases
		if (len == 0) {
			System.out.println("empty string");
			return op;
		}
		if (len > 4) {
			System.out.println("Length more than 4 is not supported");
			return op;
		}

		/*
		 * The first string is not used, it is to make array indexing simple
		 */

		
		String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		
		/*
		 * The first string is not used, it is to make array indexing simple
		 */
		String[] two_digits = new String[] { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
				"sixteen", "seventeen", "eighteen", "nineteen" };

		/*
		 * The first two string are not used, they are to make array indexing simple
		 */
		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };

		String[] tens_power = new String[] { "hundred", "thousand" };

		/* Used for debugging purpose only */

		/* For single digit number */
		if (len == 1) {
			op = single_digits[num[0]-'0'];
			return op;

		}

		/*
		 * Iterate while num is not '\0'
		 */
		int x = 0;
		while (x < num.length) 
		{

			/* Code path for first 2 digits */
			if (len >= 3) 
			{
				if (num[x] - '0' != 0) {
					op = op + single_digits[num[x] - '0'] + " ";
					op = op + tens_power[len - 3] + " ";
					// here len can be 3 or 4
				}
				--len;
			}

			/* Code path for last 2 digits */
			else 
			{
				/*
				 * Need to explicitly handle 10-19. Sum of the two digits is used as index of
				 * "two_digits" array of strings
				 */
				if (num[x] - '0' == 1) 
				{
					int sum = num[x] - '0' + num[x + 1] - '0';
					op = op + two_digits[sum];
					return op;
				}

				/* Need to explicitely handle 20 */
				else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) 
				{
					op = op + "twenty";
					return op;
				}

				/*
				 * Rest of the two digit numbers i.e., 21 to 99
				 */
				else 
				{
					int i = (num[x] - '0');
					if (i > 0)
						op = op+ tens_multiple[i] + " ";
					else
						op = op+"";
					++x;
					if (num[x] - '0' != 0)
						op = op+single_digits[num[x] - '0'];
				}
			}
			++x;
		}
		return op;
	}
	
	public static int convertHexToDec(String hexVal)
	{
		int op =0;
		
		
		int hexNum = Integer.parseInt(hexVal);
		
		int i=0;
		while(hexNum >0)
		{
			int digit = hexNum%10;
			hexNum = hexNum/10;
			op = (int) ((int) op+ digit *(Math.pow(16, i)));
			
			i++;
			
		}
		
		return op;
	}
	
	public static String convertDecToBinary(String hexVal)
	{
		String op ="";
		
		
		int hexNum = Integer.parseInt(hexVal);
		
		while(hexNum >0)
		{
			int digit = hexNum%2;
			hexNum = hexNum/2;
			op = op+ String.valueOf(digit);
			
			
		}
		
		return new StringBuffer(op).reverse().toString();
	}

}
