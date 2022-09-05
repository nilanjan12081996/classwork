package java8;
interface parent
{
	default void hi()
	{
		System.out.println("hi");
	}
	}
@FunctionalInterface
interface message extends parent{
	void say();
	//void hello();

	default void msg()
	{
		System.out.println("default method body");
	}
	//can contain any number of object class method
	 // It can contain any number of Object class methods.  
	int hashCode();  
   String toString();  
   boolean equals(Object obj);  
	
}

public class FunctinalInterfaceDemo implements message{

	public static void main(String[] args) {
		FunctinalInterfaceDemo demo=new FunctinalInterfaceDemo();
		demo.msg();
		demo.say();
	}

	@Override
	public void say() {
		System.out.println("Saying hello");
	}

}
//marked or tagged-interface with no property
/*funtional interface-an iterface that contain exactly on abstract method.
 it can have any numbers of default ,static method but can contain only one abstract method.
 
 it also know as single abstract method interface or SAM interface.it helps to achieve functional programming approch
 Invalid functional interface- A interface can extends another interface only when it does not have any abstract method
 
 *The question mark (?), represents the wildcard, stands for unknown type in generics. There may be times when any object can be used when a method can be implemented using functionality provided in the Object class or When the code is independent of the type parameter.
 *
 */
