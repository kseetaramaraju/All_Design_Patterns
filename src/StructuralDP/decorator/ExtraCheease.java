package StructuralDP.decorator;

public class ExtraCheease implements Decorators{

	Pizza pizza;

	public ExtraCheease(Pizza pizza)
	{
		this.pizza=pizza;
	}

	@Override
	public int cost() {
		return pizza.cost()+30;
	}

}
