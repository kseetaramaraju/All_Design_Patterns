package StructuralDP.proxytype;

public class ATM implements Account{


	private static Bank b;

	public ATM()
	{
		if(b==null)
		{
			b=new Bank();
		}
	}

	@Override
	public void deposit() {
		b.deposit();
		System.out.println(" deposit done in atm ");
	}

	@Override
	public void withdraw() {
		b.withdraw();
		System.out.println(" withdraw done in atm ");
	}

	@Override
	public void getBalance() {
		b.getBalance();
		System.out.println(" getbalance done in atm ");
	}

}
