package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person 
{

	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public static void main(String[] args)
	{
		Person p1 = new Person("firstName1", "lastName1");
		Person p2 = new Person("firstName2", "lastName2");
	
	List<Person> al = new ArrayList<Person>();
	
	al.add(p1);
	al.add(p2);
	
	Iterator<Person> its = al.iterator();
	
	while(its.hasNext())
	{
		System.out.println(its.next());
		al.add(new Person("firstName3", "lastName3"));
	}
	
}
}


class Myadd<T>
{
	void add(T t)
	{
		
	}
	public void abc()
	{
		Myadd<Number> obj = new Myadd<>();
		
		obj.add(new Integer(1));
		obj.add(new Double(1.0));
		
		
	}
}