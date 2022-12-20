package com.practice;

public class ImplTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(DeviceFactory.getObject(2).returnCompany());
		System.out.println(DeviceFactory.getObject(1).returnName());
		System.out.println(DeviceFactory.getObject(2).returnName());
	}

	

}
interface Device
{
	abstract String returnName();
	default String returnCompany()
	{
		return "";
	}
}
abstract class DeviceClass
{
	abstract String returnName();
	final String returnCompany()
	{
		return "WF";
	}
}

class DeviceImpl extends DeviceClass
{

	@Override
	String returnName() {
		// TODO Auto-generated method stub
		return "Impl1";
	}	
}

class DeviceImpl2 extends DeviceClass
{

	@Override
	String returnName() {
		// TODO Auto-generated method stub
		return "Impl2";
	}
}

class DeviceFactory
{
	public static DeviceClass getObject(int number)
	{
		if(number == 1)
		{
			return new DeviceImpl();
		}
		else
		{
			return new DeviceImpl2();
		}
	}
}
