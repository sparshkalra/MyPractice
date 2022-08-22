package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NagarroTEst 
{



public static List<Dto> convertToDtos(List<Model> models){
	// age >30 , salary > 50000 ,
	// age <30 , salary >25000

	//your code here.
	
	/*List<Model> x = models.stream().filter(m -> m.age >30 && m.salary >50000 || m.age<30 && m.salary > 25000).
			map(m->
			{
				m.fname = m.fname = m.fname+m.lname.substring(0,1);
				return m;
			}).collect(Collectors.toList());*/
	
	List<Dto> result = models.stream().filter(m -> m.age >30 && m.salary >50000 || m.age<30 && m.salary > 25000)
	        .map(b -> new Dto(b.fname+b.lname.substring(0,1), b.age, b.salary))
	        .collect(Collectors.toList());

	 
	

	return result;
}
public static void main(String[] args)
{
	
	Model e1 = new Model("Sparsh","Kalra",32,100000);
	Model e2 = new Model("Sayali","Kalra",33,100000);
	Model e3 = new Model("Rahul","Kalra",29,5000);
	Model e4 = new Model("Satish","Kalra",32,10000);
	
	System.out.println(e1.fname+e1.lname.substring(0,1));
	
	List<Model> mList = new ArrayList<>();
	
	mList.add(e1);mList.add(e2);mList.add(e3);mList.add(e4);
	
	System.out.println(convertToDtos(mList));
}
}

class Model {
public String fname;
public String lname;
public int age;
public int salary;

public Model(String a, String b, int c, int d)
{
	this.fname = a;
	this.lname = b;
	this.age = c;
	this.salary = d;
}
}

class Dto {
	
@Override
	public String toString() {
		return "Dto [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
public Dto(String fname, int age2, int salary2) {
		this.name = fname;
		this.age = age2;
		this.salary = salary2;
	}
public String name;
public int age;
public int salary;
}