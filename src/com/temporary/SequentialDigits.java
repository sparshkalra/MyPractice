package com.temporary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sequentialDigits(100, 400));
	}
	
	public static List<Integer> sequentialDigits(int low, int high) 
    {
        List<Integer> result = new ArrayList<>();
        
        Map<Integer,Integer> hm = new HashMap();

        for(int i:result)
        {
            hm.getOrDefault(i,hm.get(i));
        }  
        
        
        for (int i = 1; i <= 9; ++i) 
        {
            int num = i;
            
            for (int j = i + 1; j <= 9; ++j) 
            {
                num = num * 10 + j;
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        Collections.sort(result);
        return result;
    }


}
