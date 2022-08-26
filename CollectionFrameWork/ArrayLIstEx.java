package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object using polymorphism
		List<Integer>list=new ArrayList<Integer>();
	list.add(34);
	list.add(56);
	list.add(45);
	list.add(34);
	System.out.println(list);
	System.out.println(list.size());
	list.add(77);
	list.add(99);
	
	System.out.println(list);
	System.out.println(list.size());
	list.remove(3);
	System.out.println(list);
	System.out.println(list.size());
	}

}
