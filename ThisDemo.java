package oops;
class Student2{
	//instance variable
	int id;
	String name,address;
	long phno;
	public  Student2(int id,String name,String address,long phno)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phno=phno;
		
	}
	public void display()
	{
		System.out.println("Information Of "+this.name);
	}
	public void getData()
	{
		//this.display();
		display();// if we don not use this keyword compiler is create for us
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
	}
	}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 std=new Student2(12212,"Nilanjan","N,92/B Paharpur Road",7003872448l);
		Student2 std1=new Student2(45564,"Xyz","N,92/C Paharpur road",9433489176l);
		std.getData();
		System.out.println("==============================");
		std1.getData();
	}

}
