package Creational_Design_Patterns.FactoryMethod;

public class Factory_OS {

	public static OS getInstance(String s)
	{
		if(s.equalsIgnoreCase("android"))
		{
			return new Andriod();
		}
		else if(s.equalsIgnoreCase("ios"))
		{
			return new IOS();
		}
		else 
		{
			return new Windows();
		}
	}

}
