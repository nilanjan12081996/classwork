/*
 * @author Nilanjan Dasgupta
 */
//Wap to check a number is Strong number is not
package basicprogram;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;//declare a variable num
		int sum=0;//initialize the sum variable with 0 for sum
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		System.out.println("enter the number: ");
		num=sc.nextInt();//taking input from user
		int temp=num;//store num in temp for future use
		// while loop for generate strong number
		while(num!=0)
		{
			int rem=num%10;// taking the last digit
			
			int fact=1;// initialize fact variable as 1 for calculate factorial
		// for loop for calculate factorial
			for(int i=1;i<=rem;i++)
		{
			fact=fact*i;//factorial logic
			
					
		}
		sum+=fact;// sum the factorial numbers
		num=num/10;
			
			
		}
// checking for strong number
		if(temp==sum)
			System.out.println(temp+" is a strong number");
		else
			System.out.println(temp+" is not a strong number");

	}

}
