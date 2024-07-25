package StructuralDP.proxytype;

public class Bank implements Account{

	public Bank()
	{
		System.out.println(" Your Bank Account In SBI Is Successfully Created !!!");
	}

	@Override
	public void deposit() {
		System.out.println(" Amount is deposited in Account !!");
	}

	@Override
	public void withdraw() {
		System.out.println(" Amount is withdrawn in Account !!");
	}

	@Override
	public void getBalance() {
		System.out.println(" Amount is getbalance in Account !!");
	}

}
