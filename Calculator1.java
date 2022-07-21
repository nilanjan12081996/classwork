package basicprogram;

import java.util.Scanner;

public class Calculator1 {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static float div(int a,int b)
	{
		return (float)a/(float)b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\nAddition(+)\nSubtraction(-)\nMultiplication(*)\nDivision(/)\nExit(X)\n");
			System.out.println("===========================================");
			System.out.println("Enter your choice: ");
			char ch=sc.next().charAt(0);
			switch(ch)
			{
			case '+':
				System.out.println("Enter the 1st number: ");
				int num1=sc.nextInt();
				System.out.println("Enter the 2nd number: ");
				int num2=sc.nextInt();
				int ans=Calculator1.add(num1,num2);
				System.out.println("Addition of "+num1+" and "+num2+" = "+ans );
				System.out.println("===========================================");
				break;
			case '-':
				System.out.println("Enter the 1st number: ");
				 num1=sc.nextInt();
				System.out.println("Enter the 2nd number: ");
				num2=sc.nextInt();
				 ans=Calculator1.sub(num1,num2);
				System.out.println("Subtraction of "+num1+" and "+num2+" = "+ans );
				System.out.println("===========================================");
				break;
				
			case '*':
				System.out.println("Enter the 1st number: ");
				 num1=sc.nextInt();
				System.out.println("Enter the 2nd number: ");
				 num2=sc.nextInt();
				 ans=Calculator1.mul(num1,num2);
				System.out.println("Multiplication of "+num1+" and "+num2+" = "+ans );
				System.out.println("===========================================");
				break;
			case '/':
				System.out.println("Enter the 1st number: ");
				 num1=sc.nextInt();
				System.out.println("Enter the 2nd number: ");
				 num2=sc.nextInt();
				float ans1=Calculator1.div(num1,num2);
				System.out.println("Division of "+num1+" and "+num2+" = "+ans1 );
				System.out.println("===========================================");
				break;
			case 'X':
				System.exit(0);
			default: System.out.println("Choose correct option");
			}
			
		}while(true);

	}

}
