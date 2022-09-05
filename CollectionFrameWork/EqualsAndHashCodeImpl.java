package CollectionFrameWork;
class Person extends Object
{
	int id;
	String name;
	int salary;
	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	/*public boolean equals(Object obj)
	{
		//if both objects has same reference
		if(this==obj)
			return true;
		//if parameter is null or both are not same class
		if(obj==null ||this.getClass()!=obj.getClass())
			return false;
		//compare using data members
		Person p=(Person)obj;
		return this.id==p.id &&this.name==p.name&&this.salary==p.salary;
		
	}*/
	public boolean equals(Object obj)
	{
		Person p=(Person)obj;
		if(this.getName().equalsIgnoreCase(p.getName()))
			return true;
		else
			return false;
	}
	@Override
	public int hashCode()
	{
		//return this.name.length()%10;
		return this.id%10;
	}
	
	}

public class EqualsAndHashCodeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1=new Person(101,"Nilanjan",30000);
//		Person p2=new Person(101,"Nilanjan",30000);
//		Person p3=p1;
//		System.out.println(p1.equals(p2));
		Person p1=new Person(101,"Nilanjan",30000);
		Person p2=new Person(102,"Nilanjan",30000);
		Person p3=p1;
		if(p1.hashCode()==p3.hashCode())
		{
			
			System.out.println(p1.equals(p3));
		}
		else
			System.out.println("not equal");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	
	
	}

}
