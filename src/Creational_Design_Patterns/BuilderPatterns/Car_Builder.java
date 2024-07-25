package Creational_Design_Patterns.BuilderPatterns;

public class Car_Builder {

	int id;
	String name;
	String colour;
	double price;
	double height;
	int  no_Of_Seats;

	public Car_Builder setId(int id) {
		this.id = id;
		return this;
	}
	public Car_Builder setName(String name) {
		this.name = name;
		return this;
	}
	public Car_Builder setColour(String colour) {
		this.colour = colour;
		return this;
	}
	public Car_Builder setPrice(double price) {
		this.price = price;
		return this;
	}
	public Car_Builder setHeight(double height) {
		this.height = height;
		return this;
	}
	public Car_Builder setNo_Of_Seats(int no_Of_Seats) {
		this.no_Of_Seats = no_Of_Seats;
		return this;
	}

	public Car build()
	{
		return new Car(id,name,colour,price,height,no_Of_Seats);
	}

}
