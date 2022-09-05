package CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> arlist=new ArrayList<Integer>();
//		arlist.add(99);
//		arlist.add(12);
//		arlist.add(12);
//		arlist.add(22);
//		arlist.add(25);
//		arlist.add(36);
//		arlist.add(22);
//		arlist.add(95);
//		arlist.add(99);
//		System.out.println(arlist);
//		HashSet <Integer> hset1=new HashSet<Integer>(arlist);
//		ArrayList<Integer> arlist1=new ArrayList<Integer>(hset1);
//		
//		System.out.println( arlist1);
		HashSet <String> hset=new HashSet<>();
		hset.add("apple");
		hset.add("orange");
		hset.add("kiwi");
		hset.add("banana");
		hset.add("orange");
		hset.add(null);
		System.out.println(hset);
		hset.add("water melon");
		Iterator itr=hset.iterator();
hset.iterator();
//hset.add("water melon");
while(itr.hasNext())
{
	System.out.println(itr.next());
	}
	}

}
