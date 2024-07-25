package Creational_Design_Patterns.FactoryMethod;

public class ClientSide {
	public static void main(String[] args) {

		OS obj = Factory_OS.getInstance("android");
		obj.type_Of_OS();


		OS obj1 = Factory_OS.getInstance("ios");
		obj1.type_Of_OS();

		OS obj2 = Factory_OS.getInstance("windows");
		obj2.type_Of_OS();

		OS obj3 = Factory_OS.getInstance("linux");
		obj3.type_Of_OS();
		


	}

}
