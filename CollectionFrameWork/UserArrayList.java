package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class UserArrayList {

	public static void main(String[] args) {
	ArrayList<User> userlist=new ArrayList<User>();
	
	
	
	//Anonymous object
	
	userlist.add(new User(103,"abhijeet","medinipur"));
	userlist.add(new User(101,"nilanjan","burdwan"));
	userlist.add(new User(105,"tanmoy","kolkata"));
	
	//print the elements
	for(User u: userlist)
	 {
		System.out.println("Id: "+u.getId());
		System.out.println("name: "+u.getName());
		System.out.println("address: "+u.getAddress());
		System.out.println("=====================================");
	 }
		
	Collections.sort(userlist);
	
	System.out.println("After sorting the values are:");
	System.out.println(userlist);

	}

}
