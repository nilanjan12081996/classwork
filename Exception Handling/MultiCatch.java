package exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		
try {

	int a=30,b=0;
	System.out.println(a/b);
	//System.out.println(str.length());
}catch(Exception e)
{
	System.out.println(e.getMessage());
	}
	}

}
