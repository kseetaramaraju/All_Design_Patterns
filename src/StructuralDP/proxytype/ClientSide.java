package StructuralDP.proxytype;

public class ClientSide {
	public static void main(String[] args) {

		Account a=new Bank();
		a.deposit();
		a.withdraw();
		a.getBalance();

		System.out.println("--------------");

		Account b=new ATM();
		b.deposit();
		b.withdraw();
		b.getBalance();
		
		System.out.println("-----------------");
		Account c=new ATM();
		c.deposit();
		c.withdraw();
		c.getBalance();

	}
}
