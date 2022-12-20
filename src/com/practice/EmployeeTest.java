package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

		employeeList.stream().forEach(x ->
		{
			if(x.getId() == 3)
			{
				throw new Exception();
			}
		
	});
		return null;
	}
	
	public List<String> topKFrequent(String[] words, int k) 
    {
        Map<String, Integer> hm = new LinkedHashMap();
        List<String> op = new ArrayList<String>();
        for(String s: words)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.get(s)+1);
            }
            else
            {
                hm.put(s,1);
            }
        }
        hm = sortMapByValue(hm);
        int count =0;
        
        for(Map.Entry<String, Integer> obj: hm.entrySet())
        {
            op.add(obj.getKey());
            count++;
            if(count ==k)
            {
                break;
            }
        }
        return op;
        
    }
    
    public Map<String,Integer> sortMapByValue(Map hm)
    {
        List<Map.Entry<String, Integer>> al = new ArrayList();
         Map<String, Integer> hm1 = new LinkedHashMap();
        Collections.sort(al, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
                {
					if(o2.getValue() > o1.getValue())
                    {
                        return 1;
                    }
                    if(o2.getValue() == o1.getValue())
                    {
                        return o1.getKey().compareTo(o2.getKey());  
                    }
                    return -1;	
				} 
        });
        for(Map.Entry<String, Integer>obj : al)
        {
            hm1.put(obj.getKey(), obj.getValue());
        }
        return hm1;
    }
    
}
