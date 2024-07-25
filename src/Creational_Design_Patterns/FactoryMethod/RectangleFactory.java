package Creational_Design_Patterns.FactoryMethod;

public class RectangleFactory implements ShapeFactory{

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
