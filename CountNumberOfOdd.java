package basicprogram;

import java.util.Scanner;

public class CountNumberOfOdd {
	public static void main(String[] args) {
		int n;//declare a variable n for range
		int count=0;//counter variable
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Range: ");
		n=sc.nextInt();//take input from user and store the value in the variable 
		//for loop 
		for(int i=1;i<=n;i=i+2)
		{
				count++;//count number of odd numbers with in a range
		}
			
		System.out.println("\nNumber odd between 1 to "+n+" is: "+count);//output
	

}


}
