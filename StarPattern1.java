/*
 * @ Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n;//declare n for row
		System.out.println("Enter the number of rows: ");
		Scanner sc=new Scanner(System.in);//creating  the object of the Scanner class
		n=sc.nextInt();// taking input from user
		for(i=1;i<=n;i++)//outer loop
		{
			for(j=1;j<=(n+1)-i;j++)//inner loop
			{
				System.out.print("*");
			}
			System.out.println();// print star in the next line
		}

	}

}
