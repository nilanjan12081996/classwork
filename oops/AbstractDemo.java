package abstractiondemo;
//we can not create instantiate but we can create reference variable
abstract class Bank
{	//abstract method has no body
	abstract public void getLoanInterest();
	//concrete method has body
	public void display()
	{
		System.out.println("This is the bank class");
	}
	}
//implimentation class
class Sbi extends Bank
{

	@Override
	public void getLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println("We provide 6.9% interest");
	}
	}
class Axis extends Bank
{

	@Override
	public void getLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println("We provide 10% interest");
	}
	}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Sbi();
		b.getLoanInterest();
		b.display();
		b=new Axis();
		b.display();
		b.getLoanInterest();
	}

}
