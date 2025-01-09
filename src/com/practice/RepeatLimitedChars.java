package com.practice;

public class RepeatLimitedChars {

	public static void main(String[] args) {
		
		System.out.println(repeatLimitedString("aazzyzzz", 3));

	}
	    public static String repeatLimitedString(String s, int repeatLimit) {
	        int[] freq = new int[26];

	        for (char c : s.toCharArray())
	            freq[c - 'a']++;

	        int pendingLetterIndex = -1;
	        StringBuilder sb = new StringBuilder();

	        for (int i = 25; i >= 0; i--) {
	            if (freq[i] == 0)
	                continue;

	            if (pendingLetterIndex > 0) {
	                sb.append((char) ('a' + i));
	                freq[i]--;
	                i = pendingLetterIndex;
	                pendingLetterIndex = -1;

	            } else {
	                for (int j = 0; j < repeatLimit && freq[i] > 0; j++, freq[i]--)
	                    sb.append((char) ('a' + i));

	                if (freq[i] > 0)
	                    pendingLetterIndex = i + 1;
	            }
	        }
	        
	        return sb.toString();
	    }

}
