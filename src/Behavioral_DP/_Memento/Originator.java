package Behavioral_DP._Memento;

public class Originator {

	private String state;

	public Originator(String state) {
		super();
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Memento create_Memento() 
	{
		return new Memento(this.state);
	}

	public void restore_Memento(Memento memento)
	{
		this.state=memento.getState();
	}


}
