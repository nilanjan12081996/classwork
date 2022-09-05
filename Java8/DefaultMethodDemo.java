package java8;
interface Drawble
{
	void draw();
	default void message()
	{
		System.out.println("Since java 8 we can specify method body using default");
		
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
	}
class Circle implements Drawble
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
	}
	}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		circle.draw();
		circle.message();
		int mul= Drawble.multiply(5, 4);
		System.out.println(mul);
	}

}
