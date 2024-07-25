package StructuralDP.decorator;

public class Client_Side {
	public static void main(String[] args) {

		ChickenPizza c=new ChickenPizza();
		Pizza extraCheease = new ExtraCheease(c);

		int cost = extraCheease.cost();
		System.out.println(cost);


		Pizza p = new ExtraCheease(new ExtraCheeseWithMushroom(new VegPizza()));
		System.out.println(p.cost());

	}


}
