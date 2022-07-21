package basicprogram;
/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
public class StarPattern6 {

	public static void main(String[] args) {
		int i,j,k=0,x;
		for(i=1;i<=9;i++)//outer loop
		{
			x=i<6?k++:k--;// k is for increment and decrement
			for(j=1;j<=5;j++)//inner loop
			{
				if(j>=6-k)//star printing logic
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
				
		}

	}

}
