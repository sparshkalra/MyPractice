package com.striver.day15;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int romanToInt(String s) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		int num = 0;
		s = s.replace("IV", "IIII").replace("IX", "VIIII");
		s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC").replace("CM", "DCCCC");

		for (int i = 0; i < s.length(); i++) {
			num = num + hm.get(s.charAt(i));
		}
		return num;
	}

}
