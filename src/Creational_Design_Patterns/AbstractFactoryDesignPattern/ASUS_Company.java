package Creational_Design_Patterns.AbstractFactoryDesignPattern;

public class ASUS_Company implements Company
{
	@Override
	public KeyBoard create_KeyBoard() {
		return new ASUS_KeyBoard();
	}
	@Override
	public Monitor create_Monnitor() {
		// TODO Auto-generated method stub
		return new ASUS_Monitor();
	}
}
