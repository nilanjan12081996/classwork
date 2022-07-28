package oops;
//Compile time polymorphism
class Addition
{
	public void add(int a)
	{
		System.out.println("Addition value of one parameter: "+(a+10));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition value of three parameter: "+(a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("Addition value of parameter(int,double): "+(a+b));
	}
	public void add(double a,int b)
	{
		System.out.println("Addition value of parameter(double,int): "+(a+b));
	}
	
	}
public class MethodOverloading {

	public static void main(String[] args) {
		Addition ad=new Addition();
		ad.add(12.3, 5);
		ad.add(100);
		ad.add(89,50.8);
		ad.add(12,30,40);

	}

}
