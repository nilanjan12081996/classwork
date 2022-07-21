package basicprogram;
/*
 	*    
   ***   
  *****  
 ******* 
*********

 */
public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//outer loop
		{
			for(int j=1;j<=9;j++)//inner loop
			{
				if(j>=6-i&&j<=4+i)// star printing logic
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
