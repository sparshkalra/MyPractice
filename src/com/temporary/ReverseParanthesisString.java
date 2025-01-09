package com.temporary;

import java.util.Deque;
import java.util.LinkedList;

//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2024-07-11
public class ReverseParanthesisString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseParentheses("(u(love)i)"));
	}
	public static String reverseParentheses(String s) 
    {
        Deque<Integer> indStack = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        for (char char_s : s.toCharArray()) {
            if (char_s == '(') {
                indStack.push(res.length());
            } else if (char_s == ')') {
                int startInd = indStack.pop();
                String reversed = new StringBuilder(res.substring(startInd)).reverse().toString();
                res.replace(startInd, res.length(), reversed);
            } else {
                res.append(char_s);
            }
        }

        return res.toString();
    }
	

}
