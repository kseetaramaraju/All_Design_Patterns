package Behavioral_DP._Mediator;

public class Flight implements Command{

	private String flightNumber;
	private ATC atc;

	public Flight(String flightNumber, ATC atc) {
		super();
		this.flightNumber = flightNumber;
		this.atc = atc;
	}

	@Override
	public void land() 
	{
		if(atc.isAvailable())
		{
			System.out.println("Flight Number "+flightNumber+" is Landed Successfully !!");
			atc.set_Availability(false); 
			/* another flight should not land on this runway 
			until the current flight moves to parking state */
		}
		else
		{
			System.out.println(" Waiting For Landing !!");
		}
	}

	public void readyToLand()
	{
		System.out.println(" Landing Initiated For Flight Number "+flightNumber);
	}

	public void parked()
	{
		System.out.println(" Flight Moves To Parking State ");
		atc.set_Availability(true);
	}

}
