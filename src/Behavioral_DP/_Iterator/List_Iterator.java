package Behavioral_DP._Iterator;

public interface List_Iterator {

	void add(Customer customer);

	int size();

	boolean hasNext();
	Customer next();
	int nextIndex();


}
