package Creational_D_P.ProtoType;

import java.util.ArrayList;
import java.util.List;

public class ProtoMainClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		StudentDAO dao=new StudentDAO();
		List<Student> og = dao.getStudents();

		System.out.println(" Original Student List :");
		System.out.println(og);

		Student s1=new Student();
		s1.setId(103);
		s1.setName("bheema");

		Student s2=new Student();
		s2.setId(104);
		s2.setName("arjuna");


		List<Student> clone;
		try {
			clone = dao.clone();
			clone.add(s1);
			clone.add(s2);
			System.out.println(" newList Student List :");
			System.out.println(clone);


		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
