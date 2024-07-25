package Creational_Design_Patterns.FactoryMethod;

public class ChickenBurgerRestaurent extends Restaurent {

	@Override
	Burger createBurger() {
		return new ChickenBurger();
	}

}
