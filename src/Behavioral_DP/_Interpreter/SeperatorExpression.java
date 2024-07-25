package Behavioral_DP._Interpreter;

public class SeperatorExpression extends Expression{

	public SeperatorExpression(String data) 
	{
		this.data=data;
	}

	@Override
	public void evaluate(Context context) {
		String str = context.getStr();
		context.setStr(str.replace(" ",data));
	}

}
