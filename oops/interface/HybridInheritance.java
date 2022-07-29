/*
@author Nilanjan Dasgupta
*/
package abstractiondemo;
interface GP// parent interface
{
	void fun();	//abstract method by default
	}
interface A1 extends GP// Child interface A1 extends parent intrface GP
{
	void print();	//abstract method by default
	}
interface B extends GP// Child interface B extends parent intrface GP
{
	void print();	//abstract method by default
	}
class Child1 implements A1,B // class Child1 implements both A1 and B interface
{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Interface is fun");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is interface function");
	}
	}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch=new Child1();
		ch.fun();
		ch.print();
	}

}
