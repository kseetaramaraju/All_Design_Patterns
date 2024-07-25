package Behavioral_DP._Mediator;

public class MainClass {
	public static void main(String[] args) {

		ATC atc=new ATCMediator();

		Runway r1=new Runway("runway-1",atc);
		Flight f1=new Flight("flight-1",atc);
		Flight f2=new Flight("flight-2",atc);

		atc.register_Flight(f1);
		atc.register_Flight(r1);

		r1.land();
		f1.readyToLand();
		f1.land();
		
		f2.land();
		
		f1.parked();


	}
}
