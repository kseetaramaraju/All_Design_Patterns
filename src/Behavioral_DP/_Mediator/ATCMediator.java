package Behavioral_DP._Mediator;

public class ATCMediator implements ATC{

	private Flight flight;
	private Runway runway;
	private boolean isAvailable;

	@Override
	public void register_Flight(Flight flight) {
		this.flight=flight;
	}

	@Override
	public void register_Flight(Runway runway) 
	{
		this.runway=runway;
	}

	@Override
	public void set_Availability(Boolean b)
	{
		this.isAvailable=b;
	}

	@Override
	public boolean isAvailable() {
		return isAvailable;
	}

}
