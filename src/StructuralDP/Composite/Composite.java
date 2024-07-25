package StructuralDP.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	String name;
	List<Component> componentlist=new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponet(Component component)
	{
		componentlist.add(component);
	}

	@Override
	public void showPrice() 
	{
		System.out.println(name);
		for(Component c:componentlist)
		{
			c.showPrice();
		}
	}

}
