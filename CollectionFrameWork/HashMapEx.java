package CollectionFrameWork;

 import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(101,"chayan");
		hmap.put(102,"chandan");
		hmap.put(103,"sanjib");
		hmap.put(104,"pallab");
		
		System.out.println(hmap);
		
		//Set set=hmap.entrySet();
		//Iterator itr=set.iterator();
		
		Iterator itr=hmap.entrySet().iterator();
		
		// Map.Entry interface provides certain methods to access the entry
		// in the Map.by gaining access to the entry of the Map we can easily
		// manipulate them.Map.Entry is generic and defined in
		// java.util.pacakge
		
		while(itr.hasNext())
		{
			Map.Entry mentry=(Map.Entry)itr.next();
			System.out.println("key "+mentry.getKey());
			System.out.println("value: "+mentry.getValue());
		}

		//get values based on keys
		String val=hmap.get(102);
		System.out.println("value mapped with key: "+val);
		
		//remove values based on key
		hmap.remove(103);
		
		System.out.println(hmap);
		
		//Sorting Hashmap based on key
		Map<Integer,String> tmap=new TreeMap<Integer,String>(hmap);
		
		System.out.println("After sorted the elements are: ");
		for(Map.Entry me:tmap.entrySet())
		{
			System.out.println("key: "+me.getKey());
			System.out.println("value: "+me.getValue());
		}
		System.out.println("size of hashmap: "+hmap.size());
		//clear() is empty()
		
		//check key existence
		System.out.println("Key present: "+hmap.containsKey(110));
		
		//check value existence
		System.out.println("key present:"+hmap.containsKey("saquib"));
		
	}

}
