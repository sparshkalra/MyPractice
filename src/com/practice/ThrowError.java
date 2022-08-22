package com.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ThrowError implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int count = 0;
	public static void main(String[] args) throws IOException
	{
		/*if(count <3)
		{
			count ++;
			main(null);
		}
		else
		{
			return;
		}
		
		System.out.println("abc");
		
		List<Boolean> abc = new ArrayList<Boolean>();
		
		abc.add(true);
		abc.add(Boolean.parseBoolean("FalSe"));
		
		System.out.println(abc.size());*/
		
		System.out.println("a");
		
		ThrowError obj = new ThrowError();
		
		FileOutputStream fos = new FileOutputStream("C:\\abc2\\abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		oos.close();
		fos.close();
		
		
/*		try
		{
			new ThrowError().myMethod();
		}
		catch(Exception e)
		{
			System.out.println("b");
		}
		finally
		{
			System.out.println("d");
		}*/
		
	}
	
	public void myMethod()
	{
		throw new Error();
	}

}
