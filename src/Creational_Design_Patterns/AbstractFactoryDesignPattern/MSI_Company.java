package Creational_Design_Patterns.AbstractFactoryDesignPattern;

public class MSI_Company implements Company{

	@Override
	public KeyBoard create_KeyBoard() 
	{
		return new MSI_KeyBoard();
	}

	@Override
	public Monitor create_Monnitor() {
		return new MSI_Monitor();
	}

}
