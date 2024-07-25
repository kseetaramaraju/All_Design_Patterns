package Behavioral_DP._Interpreter;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
	public static void main(String[] args) {

		String s="dd mmm yyyy";

		Context c=new Context(s);

		String day="09";
		String month="JULY";
		String year="2024";

		test(c,day,month,year);

		Context c1=new Context("mmm dd yyyy");
		test(c1, day, month, year);

		Context c2=new Context("yyyy mmm dd");
		test(c2, day, month, year);


	}

	private static void test(Context c, String day, String month, String year) 
	{
		List<Expression> exlist=new ArrayList<>();
		String[] split = c.getStr().split(" ");

		for(String ss:split)
		{
			if(ss.equalsIgnoreCase("dd"))
			{
				exlist.add(new DayExpression(day));  
			}
			else if(ss.equalsIgnoreCase("mmm"))
			{
				exlist.add(new MonthExpression(month));
			}
			else if(ss.equalsIgnoreCase("yyyy"))
			{
				exlist.add(new YearExpression(year));
			}
		}

		exlist.add(new SeperatorExpression("-"));

		for(Expression expression:exlist)
		{
			expression.evaluate(c);
		}

		System.out.println(c.getStr());

	}



}
