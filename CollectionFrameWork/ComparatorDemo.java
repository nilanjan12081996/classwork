package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(101,"nikhil",10));
		list.add(new Student(102,"ajay",1));
		list.add(new Student(103,"ram",4));
		System.out.println("Sort by name: ");
		Collections.sort(list,new NameComparator());
		 Iterator itr=list.iterator();
		 while(itr.hasNext()) 
		 {
			 Student s=(Student)itr.next();
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getRollno());
		 }
		 System.out.println("Sort by Roll No: ");
			Collections.sort(list,new RollNoComparator());
			 Iterator itr1=list.iterator();
			 while(itr1.hasNext()) 
			 {
				 Student s=(Student)itr1.next();
				 System.out.println(s.getId()+" "+s.getName()+" "+s.getRollno());
			 }
			 System.out.println("Sort by ID: ");
				Collections.sort(list,new IdComparator());
				 Iterator itr2=list.iterator();
				 while(itr2.hasNext()) 
				 {
					 Student s=(Student)itr2.next();
					 System.out.println(s.getId()+" "+s.getName()+" "+s.getRollno());
				 }
	}
	//public void sort(List list ,Comparator c):it is used to sort the elements of 
	//the list by given Comparator.
	//NameComparator
	//RollNoComparator

}
