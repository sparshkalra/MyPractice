package com.practice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		String[] strs1 = {"dog","racecar","car"};
		String[] strs2 = {"aaa","aa","aaa"};
		
		new LongestCommonPrefix().longestCommonPrefix(strs2);
	}

	
    public String longestCommonPrefix(String[] strs) 
	{
		String common = strs[0];
		boolean flag = true;

		for (int i = 1; i < strs.length; i++) {

			String var = strs[i];
			int j = 0;
			while (common.length() > 0 && j < var.length() && common.charAt(j) == var.charAt(j)) {
				flag = false;
				j++;
			}
			common = common.substring(0, j);
		}
		if (flag)
			common = "";
		return common;
		
		
	}
	


    

}
