package com.practice;

public class LongestSubWithoutRepeat {

	public static void main(String[] args) {
		/*
		 * System.out.println(longestUniqueSubsttrOptimized("abcabcbb"));
		 * System.out.println(lengthOfLongestSubstring("bbbbb"));
		 * System.out.println(lengthOfLongestSubstring("pwwkew"));
		 */
		System.out.println(lengthOfLongestSubstring("xxzqi"));
		System.out.println(longestUniqueSubsttrOptimized("dabcabcbb"));

		
	}

	public static int lengthOfLongestSubstring(String s) {

		int max = 0;
		int maxFinal = 1;
		String subStr = "";

		for (int i = 0; i < s.length(); i++) {
			max = 1;
			subStr = Character.toString(s.charAt(i));
			for (int j = i + 1; j < s.length(); j++) {

				if (subStr.contains(Character.toString(s.charAt(j)))) {
					break;
				} else {
					subStr = subStr + s.charAt(j);
					max++;
				}
			}
			if (max > maxFinal) {
				maxFinal = max;
			}
		}
		return maxFinal;
	}

	public static int longestUniqueSubsttrOptimized(String str) {
		String test = "";

		// Result
		int maxLength = -1;

		// Return zero if string is empty
		if (str.isEmpty()) {
			return 0;
		}
		// Return one if string length is one
		else if (str.length() == 1) {
			return 1;
		}
		//dabcabcbb
		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

			// If string already contains the character
			// Then substring after repeating character
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			test = test + String.valueOf(c);
			maxLength = Math.max(test.length(), maxLength);
		}
		return maxLength;
	}
}
