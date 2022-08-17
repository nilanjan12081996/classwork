package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two digits");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
		c=a/b;//try internally throw exception(Arithmetic Exception)object
						//if exception occured
		System.out.println("result: "+c);
		}catch(ArithmeticException e)
		{
			//System.out.println("Divide by zero not possible");
			//System.out.println("Exception occured: "+e.getMessage());
			//System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("rest of code");
	}

}
