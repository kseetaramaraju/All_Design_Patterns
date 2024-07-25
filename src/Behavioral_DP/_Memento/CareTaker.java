package Behavioral_DP._Memento;

import java.util.Stack;

public class CareTaker {

	Stack<Memento> stack=new Stack<Memento>();

	public void addMemento(Memento memento)
	{
		stack.push(memento);
	}

	public Memento undo()
	{
		if(!stack.isEmpty())
		{
			Memento pop = stack.pop();
			return pop;
		}
		else
		{
			System.out.println(" No Updates done on object ");
			return null;
		}
	}
	
	

}
