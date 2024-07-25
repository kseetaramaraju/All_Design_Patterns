package Creational_D_P.SingleTon;

public class MainClass {
	public static void main(String[] args) {

		AdharCard ad=AdharCard.creteAdharCard();
		System.out.println(ad);

		AdharCard ad1=AdharCard.creteAdharCard();
		System.out.println(ad1);

	}

}
