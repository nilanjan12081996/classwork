package basicprogram;
/*
 	* 
   * * 
  * * * 
 * * * * 
* * * * * 
 */
public class StarPattern3 {

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1;i<=5;i++)//outer loop
		{
			for(j=5;j>i;j--)//inner loop for space print
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)// loop for star print
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
