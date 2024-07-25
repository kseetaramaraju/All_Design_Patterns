package Behavioral_DP._Strategy;

public class MainClass {
	public static void main(String[] args) {

		Context context=new Context(new AddStrategy());
		int num = context.executeStrategy(10,5);
		System.out.println(" 10 + 5 ="+num);

		System.out.println("-------------------");

		Context context1=new Context(new SubstractionStrategy());
		int num1 = context1.executeStrategy(10,5);
		System.out.println(" 10 - 5 ="+num1);

		System.out.println("-------------------");

		Context context2=new Context(new MultiplyStrategy());
		int num2 = context2.executeStrategy(10,5);
		System.out.println(" 10 * 5 ="+num2);



	}
}
