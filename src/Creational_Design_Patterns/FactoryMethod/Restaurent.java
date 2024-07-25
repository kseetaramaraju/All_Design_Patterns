package Creational_Design_Patterns.FactoryMethod;

public abstract class Restaurent
{

	public Burger orderBuger()
	{
		Burger burger = createBurger();
		burger.prepare();
		return burger;
	}

	abstract Burger createBurger();
}
