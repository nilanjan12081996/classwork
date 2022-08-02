package oops;
/*final*/ class Bike
{
	final void speed()
	{
		System.out.print("150KMH");
	}
	}
public class FinalVarDemo extends Bike {//final class cannot be extended
	/*void speed() //we cannot override the final method
	{
		System.out.print("150KMH");
		
	}*/

	final int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVarDemo demo=new FinalVarDemo();
		//demo.a=40; //cannot assign value to final variable
		System.out.println(demo.a);
		demo.speed();
	}

}
