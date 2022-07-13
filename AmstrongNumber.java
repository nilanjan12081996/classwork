/*
 * @author Nilanjan Dasgupta*/
 */
package basicprogram;
import java.util.*;
//wap to check a number is amstrong or not
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//declare a variable to store the user input by user
		int count=0;//take a variable count initialize with 0 to count the number of digits
		int ams=0;//take a variable ams initialize with 0 to store amstrong number 
		Scanner sc=new Scanner(System.in); //creating object of scanner class
		System.out.println("Enter the number: ");
		n=sc.nextInt();// take input from user
		int temp=n;//store the value of n in temp for future use
		int num=temp;//store the value of temp in num for future use
		//while loop for counting the number of digits
		while(n!=0)//iterate while loop until n become 0
		{
			n=n/10;
			count++;//counter variable
		}
		//while loop for generate amstrong number
		while(temp!=0)//terate while loop until temp become 0
		{
			int rem=temp%10;
			ams=ams+(int)Math.pow(rem,count);//amstrong logic
			temp=temp/10;
		}
		if(ams==num)// checking for amstrong or not
System.out.println(num+" is amstrong number");
		else
System.out.println(num+" is not amstrong number");
	}

}
