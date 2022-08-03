/*
 * Author Nilanjan Dasgupta
 *
 */
package array;
import java.util.Scanner;
public class ForEachLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];//create an array of size 10
		int sum = 0;
		System.out.println("enter the number of elements");
		int n = sc.nextInt();//take users from number of elemenets
		for (int i = 0; i < n; i++) {
			System.out.print("enter the elements: ");
			arr[i] = sc.nextInt();// take array elements from users
		}
		//Logic of sum the array elements using for each loop
		for (int var:arr) {
			sum = sum +var ;
		}
		System.out.println("sum of " + n + " array elements is: " + sum);
	}
}