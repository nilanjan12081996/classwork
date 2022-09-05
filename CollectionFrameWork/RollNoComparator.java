package CollectionFrameWork;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRollno()==o2.getRollno())
			return 0;
		else if(o1.getRollno()>o2.getRollno())
			return 1;
		else
			return -1;
	}
	

}
