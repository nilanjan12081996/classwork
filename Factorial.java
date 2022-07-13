/*@Author 
 Nilanjan Dasgupta*/
package basicprogram;

import java.util.Scanner;
//wap to calculate factorial
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,fact=1;//initialize fact as 1
		Scanner sc=new Scanner(System.in); //creating object of scanner class
		System.out.println("enter the range: ");
		num=sc.nextInt();////take input from user
		//for loop
		for(i=1;i<=num;i++)//i is counter variable
		{
			fact*=i;//multiply the number(finding factorial)
		}
		System.out.println("Factorial of "+num+" is "+fact);//output


	}

}
