/*
 * Author Nilanjan Dasgupta
 *
 */
package array;
// count the number of even and odd elements in an array
import java.util.Scanner;
public class EvenOddCount {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];//create an array of size 10
		// initialize two variable even and odd as zero for counting the number of evene and odd
		int even=0;
		int odd=0;
		int i;
		System.out.println("enter the number of elements");
		int n = sc.nextInt();//take users from number of elemenets
		for ( i = 0; i < n; i++) {
			System.out.print("enter the elements: ");
			arr[i] = sc.nextInt();// take array elements from users
		}
		//Logic of count the number even and odd
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			even++;
			else 
			odd++;
			}
		//print the number of even and odd elements
			System.out.print("number of evens: "+even);
			System.out.println("\nnumber of odds: "+odd);
		
	}
}