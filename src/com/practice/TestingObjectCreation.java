package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class TestingObjectCreation extends ObjectCreation implements Serializable,Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int c;
	int b;
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException
	{
		ObjectCreation obc = new ObjectCreation();
		TestingObjectCreation tobc = new TestingObjectCreation();
		ObjectCreation obc1 = null;
		TestingObjectCreation tobc1 = null;
		
		obc1 = tobc;
	//	tobc1 = (TestingObjectCreation) obc;
		
		String fileName = "C:\\abc2\\abc.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		
		tobc.a = 10;
		tobc.b = 20;
		tobc.c = 100;
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tobc);
		

		
		System.out.println("Value of tobc a: " +tobc.a+ " b: "+tobc.b + " c: "+tobc.c);
		
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		TestingObjectCreation obj2 = (TestingObjectCreation) ois.readObject();
		
		System.out.println("Value of serialized object a: " +obj2.a+ " b: "+obj2.b + " c: "+obj2.c);
		
		ois.close();
		
		TestingObjectCreation obj3 = (TestingObjectCreation) tobc.clone();
		
		System.out.println("Value of cloned object a: " +obj3.a+ " b: "+obj3.b + " c: "+obj3.c);
		
	}
	

	
	
}

class ObjectCreation
{
	int a;
}
