package Creational_Design_Patterns.AbstractFactoryDesignPattern;

public class OrderProducts {
	public static void main(String[] args) {

		MSI_Company msi_Company = new MSI_Company();
		KeyBoard keyBoard = msi_Company.create_KeyBoard();
		keyBoard.assemble();

		MSI_Company msi_Company2 = new MSI_Company();
		Monitor create_Monnitor = msi_Company2.create_Monnitor();
		create_Monnitor.assemble();

		ASUS_Company asus_Company = new ASUS_Company();
		KeyBoard create_KeyBoard = asus_Company.create_KeyBoard();
		create_KeyBoard.assemble();

		ASUS_Company asus_Company2 = new ASUS_Company();
		Monitor create_Monnitor2 = asus_Company2.create_Monnitor();
		create_Monnitor2.assemble();
	}
}
