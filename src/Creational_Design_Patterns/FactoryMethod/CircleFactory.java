package Creational_Design_Patterns.FactoryMethod;

public class CircleFactory implements ShapeFactory{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
