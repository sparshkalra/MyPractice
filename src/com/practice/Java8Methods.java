package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Methods 
{
	public static void main(String[]args)
	{
		printStringElements("aabbccddiopabctgrab");
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		al.add("def");
		al.add("ghi");
		al.add("adf");
		
		
		String x1 = "Is it possible";
		
		iterateList(al);
		
	boolean y = al.stream().anyMatch(x-> x.startsWith("a"));
	boolean y1 = al.stream().allMatch(x ->x.startsWith("a"));
	
	
	}
	
	public static void printStringElements(String str)
	{
		Map<Object, Long> hm = str.chars().mapToObj(c-> 
	    (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		
		
		
	    System.out.println(hm);
	  int op = 1000;
	    for(Map.Entry<Object,Long> obj : hm.entrySet())
	    {
	    	
	    	 if(obj.getValue() == 1)
	            {
	    		 	
	                op = Math.min(op, str.indexOf((Character)obj.getKey()));
	            }
	    }
	    
	   /* hm.entrySet()
        .stream()
        .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));*/
	    
	  hm =  hm.entrySet().stream().sorted
	    ((Map.Entry.<Object,Long>comparingByValue().reversed())).
	    collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));
	    
	    System.out.println(hm);
	}
	
	public static void iterateList(List<String> al)
	{
		
		Collections.sort(al, new Comparator<String>() 
		{

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});	
		
		System.out.println("Sorted list");
		System.out.println("");
		System.out.println(al);
		
		al.forEach(respObj ->{
			System.out.println(respObj);
		});
		System.out.println("--------------------------------------------");
		al.stream().forEach(
			
		System.out::print		
				);;
		
				System.out.println("--------------------------------------------");
		al.parallelStream().forEach(System.out::print);		
				
		ArrayList<String> aList = (ArrayList<String>) al.stream().filter(ele -> ele.startsWith("a")).collect(Collectors.toList());
		
		String x = al.stream().filter(ele -> ele.startsWith("a")).findAny().orElse(null);
		System.out.println(x);
		System.out.println(aList);
		
		
		ArrayList<Integer>al1 = new ArrayList<Integer>();
		
		al1.add(3);al1.add(12);al1.add(8);al1.add(5);
		
		List<Integer> alMultiThreeOptional = al1.stream().filter(ele ->ele%2==0).map(ele1 -> ele1*3).collect(Collectors.toList());
		
		
		
		System.out.println(alMultiThreeOptional);
		
		List<Integer> alMultiThree = al1.stream().map(ele1 ->ele1*3).collect(Collectors.toList());
		
		int value = al1.stream().mapToInt(i -> i.intValue()).sum();
		
		System.out.println("Value is " + value);
		
		OptionalDouble value1 = al1.stream().mapToInt(i -> i.intValue()).average();
		
		System.out.println("Value is " + value1);
		
		al1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();

		
		Collections.sort(alMultiThree, new Comparator<Integer>() 
		{

			@Override
			public int compare(Integer o1, Integer o2) {
				
				String a = String.valueOf(o1)+String.valueOf(o2);
				String b = String.valueOf(o2)+String.valueOf(o1);
				
				return b.compareTo(a);
					
			}
			
		});
		
		System.out.println(alMultiThree);
	}

}
