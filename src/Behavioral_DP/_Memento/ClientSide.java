package Behavioral_DP._Memento;

public class ClientSide {
	public static void main(String[] args) {

		CareTaker ct=new CareTaker();

		Originator or=new Originator(" State 1");

		Memento snapshot1 = or.create_Memento();
		ct.addMemento(snapshot1);

		or.setState(" State 2");

		Memento snapshot2 = or.create_Memento();
		ct.addMemento(snapshot2);

		or.setState(" State 3");

		Memento undo = ct.undo();
		or.restore_Memento(undo);

		Memento undo2 = ct.undo();
		or.restore_Memento(undo2);

		System.out.println(or.getState());

	}
}
