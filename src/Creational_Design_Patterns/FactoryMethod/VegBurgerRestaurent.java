package Creational_Design_Patterns.FactoryMethod;

public class VegBurgerRestaurent extends Restaurent {

	@Override
	Burger createBurger() 
	{
		return new VegBurger();
	}

}
