package Creational_Design_Patterns.BuilderPatterns;

public class MainClass {
	public static void main(String[] args) {

		Car build = new Car_Builder().setId(101)
				.setName("Honda Company ")
				.setColour(" Yellow ")
				.setPrice(500000)
				.setHeight(5.6)
				.setNo_Of_Seats(5)
				.build();
		System.out.println(build);

	}

}
