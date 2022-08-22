package com.design.pattern;

public class TestFactory {

}
abstract class Machine
{

public final String describeManufacturer()
{
	return "oracle";
}

	abstract String describeWorking();
}

class Typewriter extends Machine{

static Typewriter a = null;
public static Typewriter getInstance()
{
	if (a == null)
	{
		synchronized(Typewriter.class)
		{
			if (a == null)
			{
				a = new Typewriter();
			}
		}
	}
	
		
	
	return a;
		
}
private Typewriter() 
{
}

@Override
public String describeWorking()
{
	return "abc";
}


}

class FactoryProvider
{
	public Machine getObject(String param)
	{
		if("printer".equals(param))
		{
			return Typewriter.getInstance();
		}
		return null;
	}
}
