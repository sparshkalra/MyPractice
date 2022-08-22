package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {

	public static void main(String[] args) 
	{
		int[] nums1 = {1,2,2,1};
		int[] nums2	= 	{2,2,1,3};
		
		int []op = intersect(nums1, nums2);
		int []op2 = intersect2(nums1, nums2);
		
		String[] arr = {"bella","label","roller"};
		
		System.out.println(commonChars(arr));
		
	/*	for(int i =0;i<op.length;i++)
		{
			System.out.println(op[i]);
		}
		for(int i =0;i<op2.length;i++)
		{
			System.out.println(op2[i]);
		}
*/
	}
	 public static int[] intersect2(int[] nums1, int[] nums2) 
	 {
		 Arrays.sort(nums1);
		 ArrayList<Integer> al = new  ArrayList<Integer>();
		 Arrays.sort(nums2);
		 
		 int i=0;
		 int j=0;
		while(i < nums1.length && j < nums2.length)
		{
			if(nums1[i] > nums2[j])
			{
				j++;
			}
			else if(nums1[i] < nums2[j])
			{
				i++;
			}
			else
			{
				al.add(nums1[i]);
				i++;
				j++;
			}
		}
		 int[] op = new int[al.size()];
		 
		 int k=0;
		 for(int a:al)
		 {
			 op[k] = a;
			 k++;
		 }
		 
		 return op;
	 }
	    public static int[] intersect(int[] nums1, int[] nums2) 
	    {
	        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
	        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
	        HashMap<Integer,Integer> hm3 = new HashMap<Integer,Integer>();
	        int size = 0;
	        
	        for(int i=0;i<nums1.length;i++)
	        {
	            if(hm1.containsKey(nums1[i]))
	            {
	                int val = hm1.get(nums1[i]);
	                hm1.put(nums1[i],val+1);
	            }
	            else
	            {
	                hm1.put(nums1[i],1);
	            }
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	            if(hm2.containsKey(nums2[i]))
	            {
	                int val = hm2.get(nums2[i]);
	                hm2.put(nums2[i],val+1);
	            }
	            else
	            {
	                hm2.put(nums2[i],1);
	            }
	        }
	        
	        for(Map.Entry<Integer,Integer> obj : hm1.entrySet())
	        {
	            if(hm2.containsKey(obj.getKey()))
	            {
	                int val = Math.min(hm1.get(obj.getKey()),hm2.get(obj.getKey()));
	                hm3.put(obj.getKey(),val);
	                size = size+val;
	            }
	            
	        }
	        
	        int[] op = new int[size];
	        int count =0;
	        for(Map.Entry<Integer,Integer> obj : hm3.entrySet())
	        {
	            for(int i =0;i < obj.getValue();i++)
	            {
	                op[count] = obj.getKey();
	                count++;
	            }
	        }
	        
	        return op;       
	    
	    }
	    
	    public static List<String> commonChars(String[] words) 
	    {
	        HashMap<Character,Integer> hmOpt = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
	        List<String> output = new ArrayList<String>();
	        for(char c = 'a';c<='z';c++)
	        {
	            hmOpt.put(c,0);
	            hm1.put(c,0);
	        }
	        for(int j=0;j<words[0].length();j++)
	            {
	               int val = hmOpt.get(words[0].charAt(j));
	               hmOpt.put(words[0].charAt(j),val+1);
	            }
	        
	        
	        for(int i =1; i<words.length; i++)
	        {
	            String word = words[i];
	            for(char c = 'a';c<='z';c++)
		        {
		            hm1.put(c,0);
		        }
	            for(int j=0;j<word.length();j++)
	            {
	               int val = hm1.get(word.charAt(j));
	                hm1.put(word.charAt(j),val+1);
	            }
	            
	            for(Map.Entry<Character,Integer> obj:hm1.entrySet())
	            {
	                int val = obj.getValue();
	                char key = obj.getKey();
	                
	                hmOpt.put(key,Math.min(val,hmOpt.get(key)));
	            }
	            
	        }
	        
	        for(Map.Entry<Character,Integer> obj:hmOpt.entrySet())
	        {
	                int val = obj.getValue();
	                char key = obj.getKey();
	                if(val > 0)
	                {
	                    for(int k=0;k<val;k++)
	                    {
	                         output.add(String.valueOf(key));
	                    }
	                   
	                }
	                
	        }
	                          
	        return output;
	        
	    }
	

}
