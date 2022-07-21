package basicprogram;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,w,k=1;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(w=1;w<=i;w++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for( j=1;j<=9;j++) {
		if(j>=i&&j<=10-i&&k==1) {
			System.out.print("*");
			k=0;
		}
		else {
			System.out.print(" ");
			k=1;
		}
		
		}
			System.out.print("\n");
		}

	}

}
