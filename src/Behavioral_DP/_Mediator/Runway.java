package Behavioral_DP._Mediator;


public class Runway implements Command {

	private String runwayNumber;
	private ATC atc;

	public Runway(String runwayNumber, ATC atc) {
		super();
		this.runwayNumber = runwayNumber;
		this.atc = atc;
	}

	@Override
	public void land()
	{
		System.out.println(" Landing on Runway Number "+runwayNumber+" is Granted !! ");
		atc.set_Availability(true);
	}




}
