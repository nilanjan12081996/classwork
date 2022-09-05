package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		//polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		
		//LinkedList<Integer>  llist=new LinkedList<Integer>();
		
		names.add("Ajith");
		names.add("nil");
		names.add("shawin");
		names.add("sanjib");
		
		System.out.println(names);
		
		for(String s: names)
		  {
			System.out.println(names);
		  }
		
		System.out.println("Using while loop");
		int count=0;
		while(count<names.size())
		 {
			System.out.println(names.get(count));
			count++;
		 }
          
		System.out.println("using iterator");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		 {
			System.out.println(itr.next());
		 }
		
		//adding elements
		names.addFirst("first");
        names.addLast("last");
        names.add(2,"chandan");
        System.out.println(names);
        
        //remove operations
        names.removeLast();
        names.removeFirst();
        names.remove(1);
        names.remove("nil");
        System.out.println(names);
        //names.clear();
        //System.out.println(names);
        
        //list Iterator
        ListIterator listit=names.listIterator();
        System.out.println("Forward direction");
        while(listit.hasNext())
        {
        	System.out.println(listit.next());
        }
        
        System.out.println("backward direction");
        while(listit.hasPrevious())
        {
        	System.out.println(listit.previous());
        }
        
        
        //iterate a linkedlist in reverse order
        //returns an iterator over the elements in the Deque in
        //reverese sequential order. the elements will be returned in
        // order fromlast (tail) to first (head).
        Iterator it =names.descendingIterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        if(names.contains("shawin"))
        {
        	System.out.println("data present");
        }
        else
        	System.out.println("data not present");
        
        names.add("sanjib");
        System.out.println(names);
        System.out.println("last index of nill :"+names.lastIndexOf("sanjib"));
        
        //insert element at the front of the list
        names.push("chayan");
        names.push("amit");
        
        System.out.println(names);
        
        //remove and return the first element of the list.
        System.out.println("Elements popped: "+names.pop());
        System.out.println(names);
        
        //poll()-retrieves and remove the head(first element) of the list
        System.out.println("Elements popped:"+names.poll());
        System.out.println(names);
        
        //pollFirst()- retrieve and remove the first element of the list,
        //return null if list is empty
        System.out.println("Elements popped: "+names.pollFirst());
        System.out.println(names);
        
        //polllast()- retrieve and remove the last element of the list,
        //return null if list is empty
        System.out.println("Elements popped: "+names.pollLast());
        System.out.println(names);
	}


}