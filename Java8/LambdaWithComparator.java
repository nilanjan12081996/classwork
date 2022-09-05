package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class LambdaWithComparator {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person(101,"Subhajit"));
		persons.add(new Person(101,"Nilanjan"));
		persons.add(new Person(101,"Amiya"));
		System.out.println("short by name: ");
		Collections.sort(persons,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		persons.forEach(
				(p)->{System.out.println(p);}
				);
	}

}
