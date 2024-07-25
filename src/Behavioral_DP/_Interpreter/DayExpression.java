package Behavioral_DP._Interpreter;

public class DayExpression extends Expression{


	public DayExpression(String data)
	{
		this.data=data;
	}



	@Override
	void evaluate(Context context) {
		String str = context.getStr();
		context.setStr(str.replace("dd",data));
	}

}
