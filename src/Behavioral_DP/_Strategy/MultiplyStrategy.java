package Behavioral_DP._Strategy;

public class MultiplyStrategy implements Strategy{

	@Override
	public int doOperation(int n1, int n2) {
		return n1*n2;
	}

}
