package wrapperclass;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		//converting int(primitive) to Integer(object) explicitly
	Integer i=	Integer.valueOf(a);
	System.out.println(i);
	//autoboxing ,now compiler will autometically convert int to Integer 
Integer i1=a;
System.out.println(i1);
//converting Integer to int
Integer in=new Integer(60);
int c=in.intValue();
System.out.println(c);
//Unboxing,int to Integer
int j=in;
System.out.println(j);
	}

}
