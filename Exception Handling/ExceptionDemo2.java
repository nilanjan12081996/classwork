package exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		//String str=null;
		String str="hi";
		try {
//			arr[7]=89;
//			System.out.println("result: "+arr[7]);
			//System.out.println(str.length());
			int i=Integer.parseInt(str);
		}
		//catch(ArrayIndexOutOfBoundsException e)
		//catch(NullPointerException e)
		catch(NumberFormatException e)
		{
			//System.out.println("Exception occured: "+e.getMessage());
			//System.out.println("Index out of bound");
			System.out.println("You cannot convert string to int");
		}
		System.out.println("rest of code");
		int a=10,b=30;
		System.out.println("Addition value: "+(a+b));

	}

}
