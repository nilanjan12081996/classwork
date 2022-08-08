/*
 * @Author Nilanjan Dasgupta
 */
package array;

import java.util.Scanner;

public class InsertSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];// create an integer array of size 10
		// variable n is for number elements input by the user in  array
		// variable i is use as  index of array
		int n,i,num,pos;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("enter the elements: ");
		//take elements from user
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//input new element and position
		System.out.println("enter the element you want to insert: ");
		
		num=sc.nextInt();
		System.out.println("enter the position: ");
		pos=sc.nextInt();
		//checking if position is valid or not
		if(pos>n||n<=0)
		System.out.println("Inavlid input");
		else
		{
			// shifting logic
			for(i=n;i>=pos;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[pos-1]=num;
			n++;
			//print the array after inserting new element
			System.out.println("Array elements are: ");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}

}
