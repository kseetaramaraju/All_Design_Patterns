package Behavioral_DP._Interpreter;

public class YearExpression extends Expression{

	public YearExpression(String data) 
	{
		this.data=data;
	}

	@Override
	public void evaluate(Context context) {
		String str = context.getStr();
		context.setStr(str.replace("yyyy",data));
	}

}
