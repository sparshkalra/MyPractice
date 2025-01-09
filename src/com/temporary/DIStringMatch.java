package com.temporary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DIStringMatch {
//https://leetcode.com/problems/di-string-match/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "IDID";
		
		System.out.println(Arrays.toString(diStringMatch(s)));
	}
	
	public static int[] diStringMatch(String s) {
		int low = 0;
		int high = s.length();
		int ans[] = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				ans[i] = low;
				low++;
			} else {
				ans[i] = high;
				high--;
			}
		}
		ans[s.length()] = high;
		return ans;
	}
	

}
