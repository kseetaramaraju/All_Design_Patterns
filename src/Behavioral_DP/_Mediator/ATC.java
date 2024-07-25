package Behavioral_DP._Mediator;

public interface ATC {

	void register_Flight(Flight flight);
	void register_Flight(Runway runway);
	void set_Availability(Boolean b);
	boolean isAvailable();

}
