package twodimarray;


	public class TwoDArray {

		public static void main(String[] args) {
			//create 2D array and initialize elements
			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			//loop for printing array elements
			for(int i=0;i<3;i++)//outer loop 
			  {
				for(int j=0;j<3;j++)//inner loop
				  {
					System.out.print(arr[i][j]+" ");
				  }
				System.out.println();//print the new row in next line
			  }
			Class c=arr.getClass();
			String name=c.getName();
			System.out.println("Class name is: "+name);

		}

	}

