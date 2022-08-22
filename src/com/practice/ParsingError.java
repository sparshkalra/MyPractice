package com.practice;

public class ParsingError {

	public static void main(String[] args) {

		String balance = "30158.75";
		
		Long l = (long) Double.parseDouble(balance);
		
		System.out.println(l);
	}

}
