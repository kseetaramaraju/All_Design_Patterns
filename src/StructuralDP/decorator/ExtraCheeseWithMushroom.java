package StructuralDP.decorator;

public class ExtraCheeseWithMushroom implements Decorators{


	Pizza pizza;
	public ExtraCheeseWithMushroom(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return pizza.cost()+50;
	}

}
