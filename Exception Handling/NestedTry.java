package exceptionhandling;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc=new Scanner(System.in)){//try with resource (auto closable interface,this is the alternative of finally block)we don't need finally block to close the scanner object
		try {

			int a=30,b=0;
			System.out.println(a/b);
			//System.out.println(str.length());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			}
		int arr[]=new int[5];
		arr[7]=5;
		System.out.println("Array element "+arr[7]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: Array index out of bound");
		}
		finally {
			System.out.println("finally block always execute");
		}

	}

}
