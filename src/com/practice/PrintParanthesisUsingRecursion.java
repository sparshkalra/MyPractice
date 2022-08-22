package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintParanthesisUsingRecursion {
	
	List<String>op = new ArrayList<String>();
	public static void main(String[] args) {
		int n = 3;
		char[] str = new char[2 * n];
		//printParenthesis(str, n);
		PrintParanthesisUsingRecursion obj = new PrintParanthesisUsingRecursion();
		System.out.println(obj.generateParenthesis(3));
	//	System.out.println(obj.op);
	}

	

	// Wrapper over _printParenthesis()
	static void printParenthesis(char str[], int n) {
		if (n > 0)
			printParenthesis(str, 0, n, 0, 0);
		return;
	}
	public List<String> generateParenthesis(int n) 
    {
        if(n ==0)
        {
            return new ArrayList<String>();
        }
        char[]str = new char[n*2];
        int open = 0;
        int close = 0;
        List<String>op = new ArrayList<String>();
        generateParenthesis(open,close,0,n,str,op);
        return op;
        
    }
    
    public void generateParenthesis(int open, int close,int pos, int n,char[] str,List<String>op)
    {
        if(close == n)
        {
            String str1 = new String(str);
            op.add(str1);
        }
        else
        {
            if(close < open)
            {
                str[pos] = ')';
                generateParenthesis(open,close+1,pos+1,n,str,op);
            }
            if(open < n)
            {
                str[pos] = '(';
                generateParenthesis(open+1,close,pos+1,n,str,op);
            }
        }
    }
    
    static void printParenthesis(char str[], int pos, int n, int open, int close) {
		if (close == n) {
			// print the possible combinations
			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		} else {
			if (open > close) {
				str[pos] = '}';
				printParenthesis(str, pos + 1, n, open, close + 1);
			}
			if (open < n) {
				str[pos] = '{';
				printParenthesis(str, pos + 1, n, open + 1, close);
			}
		}
	}
}
