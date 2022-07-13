/* 
 @Author Nilanjan Dasgupta
 */
//Program to count the number of digits
package basicprogram;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int num;//declare a variable num
		int count=0;//counter variable
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Number: ");
		num=sc.nextInt();//take input from user and store the value in the variable num
		int temp=num;// storing the value of num in temp for future use
		for(;num!=0;)//loop iterate untill n become zero
		{
			num=num/10;//divide the number by 10
			count++;//counting the number of digits
		}
		System.out.println("Number of digits in"+temp+" is: "+count);//output
		
	}

}
