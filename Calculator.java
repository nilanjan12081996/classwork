package basicprogram;
import java.util.*;
public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public float div(int a,int b)
	{
		return (float)a/(float)b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator cal=new Calculator();
		do {
		System.out.println("\nAddition(+)\nSubtraction(-)\nMultiplication(*)\nDivision(/)\nExit(X)\n");
		System.out.println("Enter the choice: ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			System.out.println("Enter the 1st number: ");
			int num1=sc.nextInt();
			System.out.println("Enter the 2nd number: ");
			int num2=sc.nextInt();
			int ans=cal.add(num1,num2);
			System.out.println("Addition of "+num1+" and "+num2+" = "+ans );
			break;
		case '-':
			System.out.println("Enter the 1st number: ");
			 num1=sc.nextInt();
			System.out.println("Enter the 2nd number: ");
			num2=sc.nextInt();
			 ans=cal.sub(num1,num2);
			System.out.println("Subtraction of "+num1+" and "+num2+" = "+ans );
			break;
		case '*':
			System.out.println("Enter the 1st number: ");
			 num1=sc.nextInt();
			System.out.println("Enter the 2nd number: ");
			 num2=sc.nextInt();
			 ans=cal.mul(num1,num2);
			System.out.println("Multiplication of "+num1+" and "+num2+" = "+ans );
			break;
		case '/':
			System.out.println("Enter the 1st number: ");
			 num1=sc.nextInt();
			System.out.println("Enter the 2nd number: ");
			 num2=sc.nextInt();
			float ans1=cal.div(num1,num2);
			System.out.println("Division of "+num1+" and "+num2+" = "+ans1 );
			break;
		case 'X':
			System.exit(0);
		default: System.out.println("Choose correct option");
		}
	}while(true);
	}

}
