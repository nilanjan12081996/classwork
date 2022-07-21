package oops;
class Student1{
	//instance variable
	int id;
	String name,address;
	long phno;
	/*public void setData(int i,String n,String ad,long ph)
	{
		id=i;
		name=n;
		address=ad;
		phno=ph;
		
	}
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
	}*/
	/*public  Student1(int i,String n,String ad,long ph)
	{
		id=i;
		name=n;
		address=ad;
		phno=ph;
		
	}*/
	public  Student1(int id,String name,String address,long phno)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phno=phno;
		
	}
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
	}
}
public class ClassDemo1 {

	public static void main(String[] args) {
		//Student1 nil=new Student1();
		//Assigning value using instance of a class(not secure)
		/*
		 nil.id=41545;
		nil.name="Nilanjan Dasgupta";
		nil.address="N,92/B Paharpur Road";
		nil.phno=7003872448l;
		System.out.println("ID: "+nil.id);
		System.out.println("Name: "+nil.name);
		System.out.println("Address: "+nil.address);
		System.out.println("Ph: "+nil.phno);*/
		
		//=================================================//
		
		//Assigning value using method
		/*nil.setData(41545, "Nilanjan Dasgupta", "N,92/B Paharpur Road",7003872448l );
		nil.getData()*/;
		
		
		//====================================================//
		
		
		//Assigning value using constructor(secure)
		Student1 std=new Student1(12212,"Nilanjan","N,92/B Paharpur Road",7003872448l);
		std.getData();
	}

}
