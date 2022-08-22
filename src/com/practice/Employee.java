package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

	private double salary;
	private int id;
	private String name;
	

	
	public Employee(double salary, int id, String name) {
		super();
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", name=" + name + ", department=";
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee(200004,1,"abc");
		Employee e2 = new Employee(200003,2,"abc");
		Employee e3 = new Employee(200002,3,"abce");
		Employee e4 = new Employee(200001,4,"abcd");
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);
		


		List<Employee>emp1 = emp.stream().filter(distinctByKey(Employee::getName)).collect(Collectors.toList());
		
		System.out.println(emp1);
		
		Optional<Employee> op = emp.stream().filter(p -> p.getName().equals("Sparsh")).findFirst();
		
		if(op.isPresent())
		{
			System.out.println("Object found");
		}
		else
		{
			System.out.println("No Object found");
		}
		
		int[]arr = {1,2,3,4,5};
		int k = 2;
		rotateArray(arr,5);
	}
	
	//1,2,3,4,5  -> 3,4,5,1,2
	
	
	public static void rotateArray(int[]arr, int k)
	{
		k = k%arr.length;
		for(int i=0;i<k;i++)
		{
			int temp = arr[0];
			
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ ",");
		}
	}
}
