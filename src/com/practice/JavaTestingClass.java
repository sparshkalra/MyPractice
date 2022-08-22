package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.java.concepts.Serialization;

public class JavaTestingClass extends JavaTestingBaseClass implements JavaTestingInterface2,JavaTestingInterface,Serializable{

	
	String classDef = "I am child";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public void methodA()
	{
		System.out.println("Child method a");
	}
	public void methodB()
	{
		super.methodB();
		System.out.println("Child method b");
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		JavaTestingClass jtc = new JavaTestingClass();
		JavaTestingBaseClass jtc1 = new JavaTestingClass();
		
		jtc.methodB();
		
		JavaTestingBaseClass obj = new JavaTestingClass(); 
		
		System.out.println(obj.classDef);
		
		System.out.println();
		System.out.println(jtc.classDef);
		/*jtc.justTesting();
		
		jtc.method1(0,5);
		jtc.justTesting();
		jtc1.method1(0,5);
		
		jtc1.i = 100;
		
		String fileName = "C:\\abc2\\abc.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(jtc1);
		
		fos.close();
		oos.close();
		
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		JavaTestingBaseClass obj2 = (JavaTestingBaseClass) ois.readObject();
		
		ois.close();
		System.out.println(jtc1.i);
		System.out.println(obj2.i);*/
	}

	@Override
	public int justTesting() {
		// TODO Auto-generated method stub
		return JavaTestingInterface.super.justTesting();
	}
	
	

	
	
	


}
