package oops;
//We cannot create object
interface Printable
{
	int x=100;
	void display();//abstract by default
	void fun();
	}
class Print implements Printable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display the msg");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Fun learning");
	}
	}
class Message implements Printable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("I'm doing fun");
	}
	}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p=new Print();
		p.display();
		p.fun();
		Message msg=new Message();
		msg.display();
		msg.fun();
	
	}

}
