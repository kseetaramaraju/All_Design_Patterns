package Behavioral_DP._Iterator;

import java.util.ArrayList;
import java.util.List;

public class List_Iterator_Impl implements List_Iterator{

	List<Customer> l=new ArrayList<Customer>();
	int currentIndex=-1;
	int forwardIndex=0;


	@Override
	public void add(Customer customer) {
		l.add(customer);
		currentIndex++;
	}

	@Override
	public int size() {
		return l.size();
	}

	@Override
	public boolean hasNext() {
		if(currentIndex>=0 && currentIndex<l.size()) {
			currentIndex--;
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Customer next() {
		if(forwardIndex>=0 && forwardIndex<l.size())
		{
			Customer customer = l.get(forwardIndex);
			forwardIndex++;
			return customer;	
		}
		else
		{
			return null;	
		}
	}

	@Override
	public int nextIndex() {
		if(forwardIndex>0 && forwardIndex<l.size())
			return forwardIndex+1;
		else
			return -1;
	}



}
