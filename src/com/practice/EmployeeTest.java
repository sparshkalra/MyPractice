package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		Department d1 = new Department();
		d1.setId(101);
		d1.setName("Sales");
		
		Department d2 = new Department();
		d2.setId(102);
		d2.setName("IT");
		
		
		
		e1.setId(1);
		e1.setName("Hello");
		e1.setSalary(20000);
		e1.setDepartment(d1);
		
		e2.setId(2);
		e2.setName("Hi");
		e2.setSalary(30000);
		e2.setDepartment(d2);
		
		e3.setId(3);
		e3.setName("Greetings");
		e3.setSalary(50000);
		e3.setDepartment(d1);
		
		e4.setId(4);
		e4.setName("Greetings123");
		e4.setSalary(50000);
		e4.setDepartment(d1);
		
		List<Employee> employeeListParam = new ArrayList<Employee>();
		
		employeeListParam.add(e1);
		employeeListParam.add(e2);
		employeeListParam.add(e3);
		employeeListParam.add(e4);
		
		EmployeeTest et = new EmployeeTest();
		
		
		HashMap<Employee,Integer>hm = new HashMap<Employee,Integer>();
		
		hm.put(e1, 0);hm.put(e2, 0);hm.put(e3, 0);hm.put(e4, 0);
		
		System.out.println(hm.size());
		
		hm.put(e1, 1);
		
		System.out.println(hm.size());
		
		
		//System.out.println(et.getEmployeeWithSecondMaximumSalary(employeeListParam, "Sales"));
	}
	
	public Employee getEmployeeWithSecondMaximumSalary(List<Employee>employeeList, String departmentParam)
	{
		
		
		List <Employee> employeeListDept = employeeList.stream().filter(emp1 ->emp1.getDepartment().getName().equals(departmentParam)).collect(Collectors.toList());
		
		Collections.sort(employeeListDept, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				double salary1 = o1.getSalary();
				double salary2 = o2.getSalary();
				
				if(salary1 > salary2)
				{
					return -1;
				}
				else if(salary1 == salary2)
				{
					return 0;
				}
				else
					return 1;
			};
			
			
		
			
			
		});
		
		Employee maxSalaryEmployee =employeeListDept.get(0);
		for(int i=1; i< employeeListDept.size();i++)
		{
			if(employeeListDept.get(i).getSalary() != maxSalaryEmployee.getSalary())
			{
				return employeeListDept.get(i);
			}
		}
		
		return null;
	}
}
