/*
 * Author Nilanjan Dasgupta
 *
 */
package array;
//Find the number of duplicate elements in an array
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];//create array of size 10
		int i;
		int dup=0;
		System.out.println("enter the number of elements");
		int n = sc.nextInt();// take users from number of elemenets
		/// take input from user for array elements
		for ( i = 0; i < n; i++) {
			System.out.print("enter the elements: ");
			arr[i] = sc.nextInt();
		}
		//logic for count duplicate elements
		for(i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(arr[i]==arr[j])
				dup++;	//counter variable
		}
		}
		//print the number of duplicate elements
		System.out.println("Number of duplicate elements: "+dup);
	}

}
