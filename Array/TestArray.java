package array;

public class TestArray {
	public static int[] get()
	{
		int arr[]= {21,36,65,88};
		//return new int[] {21,36,65,88};
		return arr;
	}
	static void minElement(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The min value of array is: "+min);
	}

	public static void main(String[] args) {
		/*int a[]= {33,25,99,78};
		minElement(a);*/
		//passing anonymous array to method
		minElement(new int[]{33,25,99,78});
		int a[]=get();
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
