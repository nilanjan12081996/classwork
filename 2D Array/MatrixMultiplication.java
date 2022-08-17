/*
 * @author Nilanjan Dasgupta
 */
package twodimarray;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int mat1[][],mat2[][],mat3[][],i,j,k,row1,col1,row2,col2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row of 1st matrix: ");
		row1=sc.nextInt();
		System.out.println("enter the column of 1st matrix: ");
		col1=sc.nextInt();
		System.out.println("enter the row of 2nd matrix: ");
		row2=sc.nextInt();
		System.out.println("enter the column of 2nd matrix: ");
		col2=sc.nextInt();
		//create 3 matrices
		mat1=new int[row1][col1];
		mat2=new int[row2][col2];
		mat3=new int[row1][col2];
		//checking for coloum of 1st matrix and row of 2nd matrix are  same or not
		if(col1!=row2)
			System.out.println("coloum of 1st matrix and row of 2nd matrix should be same");
		else
		{
			//taking value for 1st matrix
			System.out.println("enter the value for 1st matix: ");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					mat1[i][j]=sc.nextInt();
				}
			}
			//taking value for 2nd matrix
			System.out.println("enter the value for 2nd matix: ");
			for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					mat2[i][j]=sc.nextInt();
				}
			}
			// Multiplying Two matrices
			System.out.println("After matrix multiplication: ");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					mat3[i][j]=0;
					for(k=0;k<col1;k++)
					{
						mat3[i][j]+=mat1[i][k]*mat2[k][j];
					}
					System.out.print(" "+mat3[i][j]);
				}
				System.out.println();
			}
		}
		
		
	}

}
