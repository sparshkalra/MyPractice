package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Methods 
{
	public static void main(String[]args)
	{
		
		//printStringElements("abcddddgab");
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);al.add(2);al.add(3);al.add(4);
		iterateList(al);
		
		
	}
	
	/*
	 * Method to count chars of String and sort them on basis of frequency.
	 * Check if String contains A, then uppercase else print not a found
	 */
	public static void printStringElements(String str)
	{
		Map<Object, Long> hm = str.chars().mapToObj(c-> 
	    (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		
		
		hm.entrySet().stream().sorted
		((Map.Entry.<Object,Long>comparingByValue().reversed())).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) ->e1,LinkedHashMap::new));
		
	    
		hm =  hm.entrySet().stream().sorted
	    ((Map.Entry.<Object,Long>comparingByValue().reversed())).
	    collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));
	    
	    System.out.println(hm);
	    
	    String op =  Optional.ofNullable(str)
                .filter(s -> s.contains("z"))
                .map(String::toUpperCase)
                .orElse("A not found");
	    
	    System.out.println(op);
	    
	    //Null pointer
	    System.out.println(Optional.of(null).map(t -> ((String) t).toUpperCase()));
	}
	
	/*
	 * Multiply all elements by 3
	 * Multiply only even elements by 3
	 * Seperate odd and even elements
	 * Find max and min
	 * Seperate odd elements and multiply by 3 and calculate the sum
	 * 
	 * 
	 */
	
	public static void iterateList(List<Integer> al)
	{
		al.stream().map(x ->x*3).collect(Collectors.toList());
		
		al.stream().filter(x ->x%2 ==0).map(x ->x*3).collect(Collectors.toList());
		
		
		al.stream().filter(x ->x%2 ==0).collect(Collectors.toList());
		
		al.stream().min(Comparator.naturalOrder()).get();
		
		al.stream().filter(x ->x%2==0).map(x -> x*3).mapToInt(x ->(int)x).sum();
		
		Map<Boolean, List<Integer>> x = al.stream().collect(Collectors.partitioningBy(i ->i%2 ==0));
		System.out.println(x);
		
	}
	
	public static void iterateStringList(List<String> al)
	{
		al.stream().sorted(Comparator.reverseOrder());
		
		al.stream().distinct().collect(Collectors.toList());
		
	}
	
	public static void iterateArray(int[]a, int[]b)
	{
		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		
	}

}
