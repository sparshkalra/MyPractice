package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordInLicensePlate 
{
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		String licensePlateLower = "";
		for (int i = 0; i < licensePlate.length(); i++) {
			if (Character.isAlphabetic(licensePlate.charAt(i))) {
				licensePlateLower = licensePlateLower + String.valueOf(Character.toLowerCase(licensePlate.charAt(i)));
			}
		}

		for (int i = 0; i < words.length; i++) {
			int index = 0;
			String word = words[i];

			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == licensePlateLower.charAt(index)) {
					index++;
					if (index == licensePlateLower.length()) {
						return word;
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		String licensePlate = "1s3 PSt"; String[] words = {"step","steps","stripe","stepple"};
		String licensePlate1 = "1s3 456"; String[] words1 = {"looks","pest","stew","show"};
		String licensePlate2 = "Ah71752"; String[] words2 = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
		String licensePlate3 = "OgEu755"; String[] words3 = {"enough","these","play","wide","wonder","box","arrive","money","tax","thus"};
		
		
		
		
		/*System.out.println(shortestCompletingWord(licensePlate, words));
		System.out.println(shortestCompletingWord(licensePlate1, words1));
		System.out.println(shortestCompletingWord(licensePlate2, words2));
		System.out.println(shortestCompletingWord(licensePlate3, words3));
		*/
		
			int[] a = {1,1000,2000,88};
			int[] a1 = {-1,-1000,-2000,-88};
			int[] a2 = {-1,1000,-2000,-88};
			
			System.out.println(printFarthestFromZero(a));
			System.out.println(printFarthestFromZero(a1));
			System.out.println(printFarthestFromZero(a2));
	}
	
	
	public static int printFarthestFromZero(int[]a)
	{
		Arrays.sort(a);
		
		int min = a[0];
		int max = a[a.length-1];
		
		
		if(min <0)
		{
			if(Math.abs(min) > max)
				return min;
		}
		return max;
	}
	
	 public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
	    {
	        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<nums1.length;i++)
	        {
	            hm.put(nums1[i],1);
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	            if(hm.containsKey(nums2[i]))
	            {
	                if(hm.get(nums2[i]) ==1)
	                {
	                     hm.put(nums2[i],2);
	                }
	            }
	            else
	            {
	                hm.put(nums2[i],3);
	            }
	        }
	         for(Map.Entry<Integer,Integer>obj:hm.entrySet())
	        {
	            if(obj.getValue()==3)
	            {
	                obj.setValue(1);
	            }
	        }
	        
	        for(int i=0;i<nums3.length;i++)
	        {
	            if(hm.containsKey(nums3[i]))
	            {
	                int val = hm.get(nums3[i]);
	                 hm.put(nums3[i],val+1);
	            }
	        }
	        
	        List<Integer> op = new ArrayList<Integer>();
	        
	        for(Map.Entry<Integer,Integer>obj:hm.entrySet())
	        {
	            if(obj.getValue()>1)
	            {
	                op.add(obj.getKey());
	            }
	        }
	        return op;
	        
	    }

}
