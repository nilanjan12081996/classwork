/*
 * @ Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.*;
//wap to print factorial of number from 1 to 10
public class FactoralWithInARange {

	public static void main(String[] args) {
	
		int i;// counter variable
			int fact=1;// initialize fact variable as 1
			//to calculate factorial and print them
			for( i=1;i<=10;i++)
			{
				fact=fact*i;// factorial logic
				System.out.print(" "+fact);
			}
			
		}

	}


