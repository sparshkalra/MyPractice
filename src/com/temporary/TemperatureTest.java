package com.temporary;
import java.util.Arrays;
import java.util.Stack;

public class TemperatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = {73,74,75,71,69,72,76,73};
		System.out.print(Arrays.toString(dailyTemperatures(temperatures)));
	}
	
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
                ans[i] = 0;
            } else {
                while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = stack.peek() - i;
                }
                
                stack.push(i);
            }
        }
        return ans;
    }

}
