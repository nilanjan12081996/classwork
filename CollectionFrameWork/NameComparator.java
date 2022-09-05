package CollectionFrameWork;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		// TODO Auto-generated method stub
		//type cast the object class variable
		
		return o1.getName().compareTo(o2.getName());
	}

}
