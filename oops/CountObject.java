package oops;

public class CountObject {
	static int count=0;
	CountObject()
	{
		count++;
		System.out.println(CountObject.count);
		
	}
	
	
	

	public static void main(String[] args) {
		CountObject c1=new CountObject();
		CountObject c2=new CountObject();
		CountObject c3=new CountObject();
		//System.out.println(CountObject.count);
		
	}

}
