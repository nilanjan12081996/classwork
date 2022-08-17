package twodimarray;

import java.util.Scanner;

public class CreateTwoDArray {

	public static void main(String[] args) {
		//create 2D array with 10 row and coloumn
		int arr[][]=new int[10][10];
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		//ask user for row and coloumn 
		System.out.println("enter te rows: ");
		row=sc.nextInt();
		System.out.println("enter te columns: ");
		col=sc.nextInt();
		System.out.println("enter the values: ");
		//take input of array elements
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		//print the array elements
		System.out.println("Array elements are ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(" "+arr[i][j]);
				
			}
			System.out.print("\n");
		}
		

	}

}
