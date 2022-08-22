package com.striver.day15;

public class AToI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.out.println(myAtoi("42")); System.out.println(myAtoi(""));
		  System.out.println(myAtoi("   -42"));
		 
		System.out.println(myAtoi("4193 with words"));

		System.out.println(myAtoi("words and 987"));
		System.out.println(myAtoi("-91283472332"));
		System.out.println(myAtoi("-+12"));
	}

	public static int myAtoi(String s) {

		int num = 0;
		boolean negFlag = false;
		
		s = s.trim();
		if (s.equals("")) {
			return num;
		}
		if (s.charAt(0) == '-') {
			negFlag = true;
			s = s.substring(1);
		}
		else if (s.charAt(0) == '+') {
			negFlag = false;
			s = s.substring(1);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isDigit(c)) {
				break;
			}
			int d = c - '0';

			if (num > (Integer.MAX_VALUE - d) / 10) {
				if (negFlag) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
			num = num * 10 + d;
		}
		if (negFlag) {
			num = 0 - num;
		}
		return num;

	}

}
