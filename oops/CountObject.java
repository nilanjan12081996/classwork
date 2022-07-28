package oops;

public class CountObject {
	static int count=0;//static counter variable
	CountObject()
	{
		count++;// increment counter
		System.out.println(CountObject.count);
		
	}
	
	
	
	
	public static void main(String[] args) {
		//object creation
		CountObject c1=new CountObject();
		CountObject c2=new CountObject();
		CountObject c3=new CountObject();
		//System.out.println(CountObject.count);
		
	}

}
