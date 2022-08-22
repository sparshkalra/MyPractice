package com.java.concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;

public class Serialization implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
	int a;
	String b;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Serialization obj1 = new Serialization();
		obj1.a = 10;
		obj1.b = "Ten";
	
	
		String fileName = "C:\\abc2\\abc.txt";
	
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Serialization obj2 = (Serialization) ois.readObject();
		
		ois.close();
		
		System.out.println(obj2.a);
		obj1.a = 100;
		System.out.println(obj2.a);
			
	
	}
}
