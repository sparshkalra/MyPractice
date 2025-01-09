package com.temporary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimilarSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(areSentencesSimilar("Hello Jane", "Hello my name is Jane"));
		//System.out.println(areSentencesSimilar("Frog cool", "Frogs are cool"));
		//System.out.println(areSentencesSimilar("of", "A lot of words"));
		System.out.println(areSentencesSimilarOpyimized("TjZ ScAi m xz PNWaKigqqY p IyJ B rok", "TjZ ScAi m LlbJhCf gL u m R pZpiH mSk a og xz PNWaKigqqY p IyJ B rok")); 



	}
	public static boolean areSentencesSimilar(String sentence1, String sentence2) 
    {
        List<String> sentence1Arr= Arrays.asList(sentence1.split(" "));
        List<String> sentence2Arr= Arrays.asList(sentence2.split(" ")); 
        
        if(sentence1Arr.size() > sentence2Arr.size())
        {
        	List<String> temp = new ArrayList<String>();
        	
        	temp.addAll(sentence1Arr);
        	sentence1Arr = new ArrayList<String>();
        	sentence1Arr.addAll(sentence2Arr);
        	sentence2Arr = new ArrayList<String>();
        	sentence2Arr.addAll(temp);
        }
        List<Integer> indexes = new ArrayList<Integer>();
        int i1=0;int j1= 0;
       while(i1<sentence1Arr.size() && j1<sentence2Arr.size())
       {
    	   
       }
        for(int i=0;i<sentence1Arr.size();i++)
        {
        	String word = sentence1Arr.get(i);
        	if(!sentence2Arr.contains(word))
        	{
        		return false;
        	}
        }
        for(int i=1;i<indexes.size();i++)
        {
        	if(indexes.get(i)-indexes.get(i-1) >1)
        	{
        		return false;
        	}
        	
        }
        
        
        return true;
    }
	
	    public static boolean areSentencesSimilarOpyimized(String sentence1, String sentence2) {
	        if (sentence1.equals(sentence2)) return true;

	        String[] s1 = sentence1.split(" ");
	        String[] s2 = sentence2.split(" ");
	        
	        int s1si = 0, s1ei = s1.length - 1;
	        int s2si = 0, s2ei = s2.length - 1;

	        // Increment both start indices while matching
	        while (s1si <= s1ei && s2si <= s2ei && s1[s1si].equals(s2[s2si])) {
	            s1si++;
	            s2si++;
	        }
	        
	        // Decrement both end indices while matching
	        while (s1ei >= s1si && s2ei >= s2si && s1[s1ei].equals(s2[s2ei])) {
	            s1ei--;
	            s2ei--;
	        }
	        int i=5;
	        Math.ceil(i/3);
	        
	        // Check if the remaining portion is a match
	        return s1ei < s1si || s2ei < s2si;
	    }

}
