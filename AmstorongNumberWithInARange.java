/*
 * @ Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.Scanner;
//wap to print all amstrong number 1 to 500
public class AmstorongNumberWithInARange {

	public static void main(String[] args) {
		//for loop for generate number with in a range of 500
		for(int i=1;i<=500;i++)
		{
			int count=0;// initialize count variable as 0 for counting the number of digits
			int ams=0; // //take a variable ams initialize with 0 to store amstrong number 
			int n=i;// store the value of i inside n for future use
			int temp=n;//store the value of inside the temp for future use
			//while loop for counting number of digits
			while(n!=0)//iterate while loop until n become 0
			{
				n=n/10;
				count++;//counter variable
			}
			//while loop for amstrong number
		while(temp!=0)
		{
			int rem=temp%10;
			ams+=Math.pow(rem,count);// amstrong number logic
			temp=temp/10;
		}
		// check the number is amstrong or not
		if(ams==i)
		System.out.print(" "+i);
	}
	}

}
