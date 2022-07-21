package oops;
class Student{
	//instance variable
	int id=1254;
	String name="Nilanjan Dasgupta",address="N,92/B Paharpur Road";
	long phno=7003872448l;
}
public class ClassDemo {

	public static void main(String[] args) {
		//create object/class instantiation
		Student std=new Student();//creating instance
		System.out.println(std);
		System.out.println("ID: "+std.id);
		System.out.println("Name: "+std.name);
		System.out.println("Address: "+std.address);
		System.out.println("Ph: "+std.phno);
	}

}
