package Behavioral_DP._State;

public class Mainclass
{
	public static void main(String[] args) {

		AcContext context=new AcContext();
		context.setState(new ACStart());
		context.doAction();

		System.out.println("-------------");

		AcContext context1=new AcContext();
		context1.setState(new ACStop());
		context1.doAction();


		System.out.println("-------------");

		AcContext context2=new AcContext();
		context2.setState(new ACStop());
		context2.doAction();


	}

}
