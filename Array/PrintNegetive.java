/*
 * Author Nilanjan Dasgupta
 *
 */
package array;
/*
 * Find and print the negetive number of an array
 */
import java.util.Scanner;
public class PrintNegetive {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];//create an array of size 10
		int i;
		int j=0;
		System.out.println("enter the number of elements");
		int n = sc.nextInt();// take users from number of elemenets
		for ( i = 0; i < n; i++) {
			System.out.print("enter the elements: ");
			arr[i] = sc.nextInt();// take array elements from users
		}
		//logic for print find negetive numbers and print them
		System.out.println("Negetive numbers are: \n");
		for(i=0;i<n;i++){
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			}
			}
			
	}
}