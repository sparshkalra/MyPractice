package com.java.concepts;

import java.util.ArrayList;
import java.util.List;

public class Cloning implements Cloneable 
{
	
	int var;
	CloneData data;
	List<String> abc;
	
	
	public CloneData getData() {
		return data;
	}

	public void setData(CloneData data) {
		this.data = data;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	

	public List<String> getAbc() {
		return abc;
	}

	public void setAbc(List<String> abc) {
		this.abc = abc;
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		List<String> param = new ArrayList<String>();
		param.add("11");
		CloneData data = new CloneData(10);
		Cloning obj1 = new Cloning(5,param,data);
		
		Cloning obj2 = obj1;
		
		Cloning obj3 = (Cloning) obj1.clone();
		
		
		
		System.out.println("Non cloned simple int before change:" + obj2.getVar());
		System.out.println("Cloned simple int before change:" + obj3.getVar());
		System.out.println("Non cloned list before change:" + obj2.getAbc().size());
		System.out.println("Cloned list before change:" + obj3.getAbc().size());
		System.out.println("Non cloned object inside before change:" + obj2.getData().getData1());
		System.out.println("Cloned object inside before change:" + obj3.getData().getData1());
		
		obj1.setVar(10);
		obj1.setAbc(new ArrayList<String>());
		obj1.getData().setData1(100);
		
		System.out.println("Non cloned simple int after change:" +obj2.getVar());
		System.out.println("Cloned simple int after change:" +obj3.getVar());
		System.out.println("Non cloned list after change:" + obj2.getAbc().size());
		System.out.println("Cloned list after change:" + obj3.getAbc().size());
		System.out.println("Non cloned object inside after change:" + obj2.getData().getData1());
		System.out.println("Cloned object inside after change:" + obj3.getData().getData1());
	}
	
	public Cloning(int a,List<String> abc, CloneData data)
	{
		this.var = a;
		this.abc = abc;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Cloning [var=" + var + ", data=" + data + ", abc=" + abc + "]";
	}
	
	
	
	/*
	 * @Override public Cloning clone() throws CloneNotSupportedException { Cloning
	 * obj = (Cloning) super.clone();
	 * 
	 * obj.setData(new CloneData(0));
	 * 
	 * return obj;
	 * 
	 * }
	 */
}

class CloneData
{
	int data1;

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public CloneData(int data1)
	{
		this.data1 = data1;
	}

	@Override
	public String toString() {
		return "CloneData [data1=" + data1 + "]";
	}
	
}
