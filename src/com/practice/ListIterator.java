package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
	
	
	public static void main(String[] args)
	{
		ListIterator l1 = new ListIterator();
		l1.myMethod();
	}
	
	public void myMethod()
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setDepartment("d1");
		e1.setName("n1");
		e1.setSalary(500);
		
		e2.setDepartment("d2");
		e2.setName("n2");
		e2.setSalary(5000);
		
		e3.setDepartment("d3");
		e3.setName("n3");
		e3.setSalary(500);
		
		List<Employee> list1 = new ArrayList<Employee>();
		List<Manager> list2 = new ArrayList<Manager>();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
	
		
		list1.forEach(employee->
		{
			Manager m = new Manager();
			
			m.setDept(employee.getDepartment());
			m.setFirstName(employee.getName());
			
			list2.add(m);
		});
		
		//System.out.println(list2);
		Employee newEmploye = new Employee();
		getInstance(newEmploye);
		System.out.println(newEmploye.getName());
		
		getInstanceReturn(newEmploye);
		System.out.println(newEmploye.getName());
		
	}
	
	public String getInstance(Employee x)
	{
		
		x.setName("My name");
		return x.getName();
	}
	
	public Employee getInstanceReturn(Employee x)
	{
		x = new Employee();
		x.setName("My name");
		return x;
	}


}
