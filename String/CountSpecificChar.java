/* @Author Nilanjan Dasgupta
 * Wap to count no of occurance of given character.
Ex- good morning
Char=o
No of occurance: 3
 */
package string;

import java.util.Scanner;

public class CountSpecificChar {
	//method for counting the number of specific character
	public static int countChar(String str,char ch)
	{
		int i,count=0;
		char c;
		//counting logic
		for(i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(c==ch||c==ch-32||c==ch+32)
				count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		str=sc.nextLine();
		System.out.println("enter the character whoes occurance you want to know: ");
		ch=sc.next().charAt(0);
		int count= countChar(str,ch);
		System.out.println("occurance of "+ch+ " "+count);

	}

}
