package com.temporary;

import java.util.Stack;

public class MaximumGain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="cdbcbbaaabab";
		String s1 = "aabbaaxybbaabb";
		//System.out.println(maximumGain(s,4,5));
		System.out.println(maximumGain(s1, 5, 4));
	}
	
	public static int maximumGain(String s, int x, int y) 
    {int points =0;
    int point1 = x;
    char[] toBeRemoved = new char[2];
    toBeRemoved[1] = 'b';
    toBeRemoved[0] = 'a';
    Stack<Character> st = new Stack<Character>();
    if(y >x)
    {
        toBeRemoved[0] = 'b';
        toBeRemoved[1] = 'a';
        point1 =y;
    }
    for(char c:s.toCharArray())
    {
        if(c == toBeRemoved[1] && st.isEmpty() == false &&
        st.peek() == toBeRemoved[0])
        {
            points = points+point1;
            st.pop();
        }
        else
        {
            st.push(c);
        }
    }
    String remainingStr = "";
    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty())
    {
        sb.append(st.pop());
    }
    remainingStr = sb.reverse().toString();
    point1 = Math.min(x,y);
    char temp = toBeRemoved[0];

    toBeRemoved[0] = toBeRemoved[1];
    toBeRemoved[1] = temp;

    for(int i=0;i<remainingStr.length()-1;i++)
    {
        char c1 = remainingStr.charAt(i);
        char c2 = remainingStr.charAt(i+1);

        if(toBeRemoved[0] == c1 && toBeRemoved[1] == c2)
        {
            points = points+point1;
        }
    }
    return points;}

}
