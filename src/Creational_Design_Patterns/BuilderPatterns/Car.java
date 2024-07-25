package Creational_Design_Patterns.BuilderPatterns;

// Normal Class 

public class Car {

	int id;
	String name;
	String colour;
	double price;
	double height;
	int  no_Of_Seats;

	public Car(int id, String name, String colour, double price, double height, int no_Of_Seats) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.height = height;
		this.no_Of_Seats = no_Of_Seats;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", height=" + height
				+ ", no_Of_Seats=" + no_Of_Seats + "]";
	}

}
