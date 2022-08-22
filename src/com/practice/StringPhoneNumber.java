package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPhoneNumber {

	public static void main(String[] args) 
	{
		System.out.println(letterCombinations("23"));

	}
	
	 public static List<String> letterCombinations(String digits) {
	        
	        List<String> combinations = new ArrayList<String>();
	        List<String> combinationsNew = new ArrayList<String>();
	        
	        if(digits == null || digits.equals(""))
	        {
	            return combinations;
	        }
	        String[] oneArr = new String[0];
	        String[] twoArr = {"a","b","c"};
	        String[] threeArr = {"d","e","f"};
	        String[] fourArr = {"g","h","i"};
	        String[] fiveArr = {"j","k","l"};
	        String[] sixArr = {"m","n","o"};
	        String[] sevenArr = {"p","q","r","s"};
	        String[] eightArr = {"t","u","v"};
	        String[] nineArr = {"w","x","y","z"};
	        
	        Map<String, String[]> mapping = new HashMap <String,String[]>();
	        
	        mapping.put("1",oneArr);
	        mapping.put("2",twoArr);
	        mapping.put("3",threeArr);
	        mapping.put("4",fourArr);
	        mapping.put("5",fiveArr);
	        mapping.put("6",sixArr);
	        mapping.put("7",sevenArr);
	        mapping.put("8",eightArr);
	        mapping.put("9",nineArr);
	        
	        
	        for(int i =0; i<digits.length();i++)
	        {
	            combinationsNew = new ArrayList<String>();
	            String digit = Character.toString(digits.charAt(i));
	            String[] value = mapping.get(digit);
	            
	            if(combinations.size()==0)
	            {
	                for(int j=0;j<value.length;j++)
	                {
	                     combinations.add(value[j]);
	                }
	               
	            }
	            else
	            {
	                for(int j=0;j<value.length;j++)
	                {
	                    for(String combinationValue:combinations)
	                    {
	                        String newVal = combinationValue + value[j];
	                        combinationsNew.add(newVal);
	                        
	                    }
	                }
	                combinations = combinationsNew;
	            }
	           
	        }
	        
	        
	        
	        return combinations;
	    }

}
