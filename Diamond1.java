package basicprogram;
/*
   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   
 */
public class Diamond1 {

	public static void main(String[] args) {
		int i,j,k=0,x;
		int n=(7+1)/2; //calculation for half pyramid
		for(i=1;i<=7;i++)//outer loop
		{
			x=i<=n?k++:k--;//k is for incrementer and decrementer
			for(j=1;j<=7;j++)// inner loop
			{
				if(j>=(n+1)-k&&j<=(n-1)+k)// logic of star print
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
