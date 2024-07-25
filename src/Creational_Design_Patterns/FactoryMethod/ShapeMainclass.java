package Creational_Design_Patterns.FactoryMethod;

public class ShapeMainclass {
	public static void main(String[] args) {

		ShapeFactory sf=new CircleFactory();
		sf.createShape().type();

		ShapeFactory sf1=new RectangleFactory();
		sf1.createShape().type();


	}
}
