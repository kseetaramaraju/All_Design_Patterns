package Creational_D_P.ProtoType;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable{

	List<Student> list=new ArrayList<Student>();


	{
		Student s1=new Student();
		s1.setId(101);
		s1.setName("ram");

		Student s2=new Student();
		s2.setId(102);
		s2.setName("raju");

		list.add(s1);
		list.add(s2);
	}

	public List<Student> getStudents()
	{
		return list;
	}

	@Override
	protected List<Student> clone() throws CloneNotSupportedException 
	{
		List<Student> newList=new ArrayList<Student>();
		for(Student s:list)
		{
			newList.add(s);
		}
		return newList;
	}

}
