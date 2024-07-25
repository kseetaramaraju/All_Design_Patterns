package Behavioral_DP._Interpreter;

public class MonthExpression extends Expression{


	public MonthExpression(String data)
	{
		this.data=data;
	}

	@Override
	public void evaluate(Context context) {
		String str = context.getStr();
		context.setStr(str.replace("mmm",data));
	}

}
