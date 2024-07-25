package Creational_Design_Patterns.FactoryMethod;

public class OrderPage {
	public static void main(String[] args) {

		Restaurent restaurent = new VegBurgerRestaurent();
		Burger burger = restaurent.orderBuger();


		Restaurent restaurent1 = new ChickenBurgerRestaurent();
		Burger burger1 = restaurent1.orderBuger();

	}

}
