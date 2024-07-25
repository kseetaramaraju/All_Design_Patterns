package Behavioral_DP._Iterator;

public class MainClass {
	public static void main(String[] args) {

		List_Iterator l=new List_Iterator_Impl();

		Customer c1=new Customer(1,"raju");
		Customer c2=new Customer(2,"shiva");
		Customer c3=new Customer(3,"ganga");
		Customer c4=new Customer(4,"vishnu");
		Customer c5=new Customer(5,"ganesh");

		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);


		while (l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println(l.size());





	}

}
