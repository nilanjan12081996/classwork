/*
 * @ Author Nilanjan Dasgupta
 */
package basicprogram;
//wap to print all strong number 1 to 500
public class StrongNumberWithinRange {

	public static void main(String[] args) {
		//for loop for generate number with in a range of 500
		for(int num=1;num<=500;num++) {
		int sum=0;//initialize the sum variable with 0 for sum
		int temp=num;//store num in temp for future use
		// while loop for generate strong number
		while(temp!=0)
		{
			int rem=temp%10; // taking the last digit
			int fact=1;//initialize fact variable as 1 for calculate factorial
			// for loop for calculate factorial
			for(int i=1;i<=rem;i++)
		{
			fact=fact*i;//factorial logic
		}
		sum+=fact;// sum the factorial numbers
		temp=temp/10;
		}
		// checking for strong number
		if(sum==num)
		System.out.print(" "+num);
			
		}

	}

}
