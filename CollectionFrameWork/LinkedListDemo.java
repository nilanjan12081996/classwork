package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		names.add("Nil");
		names.add("Shawin");
		names.add("sanjib");
		System.out.println(names);
		for(String s: names)
		{
			System.out.println(s);
		}
		Iterator itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//insert element is 1st position
		names.add(0,"xyz");
		System.out.println(names);
		names.addFirst("yuvi");
		System.out.println(names);
		//insert at end
		names.addLast("dhoni");
		System.out.println(names);
		//remove 1st elements
		names.removeFirst();
		System.out.println(names);
		//remove last
		names.removeLast();
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		names.remove("Shawin");
		System.out.println(names);
		//set and get the data
		names.set(0, "Nilanjan Dasgupta");
		String name=names.get(0);
		System.out.println(name);
		System.out.println(names);
		//names.clear();
		System.out.println(names);
		//list iterator
		ListIterator listit=names.listIterator();
		System.out.println("forward direction");
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		System.out.println("backward direction");
		while(listit.hasPrevious())
		{
			System.out.println(listit.previous());
		}
		//Returns an iterator over the elements in this deque in reversesequential order. 
		//The elements will be returned in order fromlast (tail) to first (head).
		Iterator it =names.descendingIterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				if(names.contains("Nilanjan Dasgupta"))
						System.out.println("data present at the indx of "+names.indexOf("Nilanjan Dasgupta"));
				else
					System.out.println("data not present");
					names.push("Chayan");
					names.push("amit");
					System.out.println(names);
					System.out.println("index of "+names.indexOf("Nilanjan Dasgupta"));
//					//remove and return the first element of the list.
//					names.pop();
//					System.out.println(names);
//					//Retrieves and removes the head (first element) of this list.
//					names.poll();
//					
//					System.out.println(names);
//					//Retrieves and removes the first element of this list,or returns null if this list is empty.
//					names.pollFirst();
//					System.out.println(names);
//					//Retrieves and removes the last element of this list,or returns null if this list is empty.
//					names.pollLast();
//					System.out.println(names);
					//convert linked list to array list
					List <String> list=new ArrayList<>(names);
					for(String str: list)
					{
						System.out.println(str);
					}
					//convert linkedlist to array
					String[] array=names.toArray(new String[names.size()]);
					System.out.println("====================");
					for(int i=0;i<array.length;i++)
					{
						System.out.println(array[i]);
					}
	}

}
