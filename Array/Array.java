/*
 * Author Nilanjan Dasgupta
 *
 */
package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//statically input array
		int arr[]= {4,5,6,8,7};//create array statically
		for(int i=0;i<arr.length;i++)//for loop for printing the array elements
		{
			System.out.println(arr[i]);
		}
		//user input
		Scanner sc=new Scanner(System.in);
		int arr2[]=new int[10];//create a array
		System.out.println("enter the number of elements");
		int n=sc.nextInt();// take users from number of elemenets
		for(int i =0;i<n;i++)
		{
			System.out.print("enter the elements: ");
			arr2[i]=sc.nextInt();// take input from user for array elements
			}
			System.out.println("Elements are: ");
			for(int i =0;i<n;i++)//for loop for printing the array elements
		{
				System.out.println(arr2[i]);
			}
	}

}
