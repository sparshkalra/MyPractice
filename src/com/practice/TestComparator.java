package com.practice;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator 
{
	public static void main(String[] args)
	{
		TestObj test1 = new TestObj(20000, 1001, "Sparsh");
		TestObj test2 = new TestObj(25000, 1002, "Sparsh");
		TestObj test3 = new TestObj(20000, 1003, "Srparsh");
		TestObj test4 = new TestObj(20000, 1004, "Abc");
		TestObj test5 = new TestObj(30000, 1005, "Abc");
				
		List<TestObj> list11 = new ArrayList<TestObj>();
		
		
		list11.add(test1);
		list11.add(test2);
		list11.add(test3);
		list11.add(test4);
		list11.add(test5);
		
		System.out.println(list11);
		//For 1
		//list11.sort((TestObj t1, TestObj t2) -> t1.getName().compareTo(t2.getName()));
		
		//Name then id ascending
		list11.sort(Comparator.comparing(TestObj::getName).
				thenComparing(i -> i.getID()));
		
		System.out.println(list11);
		
		
		//Name then id descending
		
		list11.sort(Comparator.comparing(TestObj::getName).
				thenComparing((a,b) -> b.getID()-a.getID()));
		
		System.out.println(list11);
		
		
		//Salary desc
		
		list11.sort(Comparator.comparingDouble(TestObj::getSalary).reversed()
				.thenComparing(i -> i.getID()));
		System.out.println(list11);
/*		Collections.sort(list11,new Comparator<TestObj>() {

			@Override
			public int compare(TestObj o1, TestObj o2) {
				
				if(o1.getSalary() > o2.getSalary())
				{
					return 1;
				}
				else if(o1.getSalary() < o2.getSalary())
				{
					return -1;
				}
				else if(o1.getSalary() == o2.getSalary())
				{
					if(o1.getID() > o2.getID())
						return -1;
					else if (o1.getID() < o2.getID())
						return 1;
				}
				return o1.getName().com;
			
			return o1.getName().compareTo(o2.getName());	
			}
		});
		*/
		//System.out.println(list11);
	}
}

class TestObj
{
	double salary;
	int ID;
	String name;
	
	
	
	
	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public int getID() {
		return ID;
	}




	public void setID(int iD) {
		ID = iD;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public TestObj(double salary, int iD, String name) 
	{
		this.salary = salary;
		this.ID = iD;
		this.name = name;
	}




	@Override
	public String toString() {
		return "TestObj [salary=" + salary + ", ID=" + ID + ", name=" + name + "]";
	}
	
	
}