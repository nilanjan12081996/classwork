package basicprogram;
import java.util.*;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		System.out.println("Enter the number of rows: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
