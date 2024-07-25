package Behavioral_DP._Strategy;

public class Context {

	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public int executeStrategy(int n1,int n2)
	{
		return strategy.doOperation(n1,n2);
	}

}
