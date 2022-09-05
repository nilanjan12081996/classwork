package java8;
@FunctionalInterface
interface sayable
{
	//void msg();
	//String msg(String message);
	int addition(int a,int b);
	}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		//without lambda exp
//		sayable s=new sayable() {
//
//			@Override
//			public void msg() {
//				// TODO Auto-generated method stub
//				System.out.println("hello java");
//			}
//			
//		};
//		s.msg();
		//sayable s=()->System.out.println("hello java");
		
//		sayable s=(message)->{
//		//return "we are learning lambda";	
//			return "hello, "+message;
//		};
//		System.out.println(s.msg("How are you"));
//		//you can omit the functional paranthisis
//		sayable s1=message->{
//			//return "we are learning lambda";	
//				return "hi, "+message;
//			};
//			System.out.println(s.msg("What are you doing?"));
	sayable s1=(a,b)->{
		return a+b;
	};
	System.out.println(s1.addition(23,30));
	sayable s2=(int a,int b)->{
		int c=a+b;
		return c;
	};
	System.out.println(s1.addition(30,40));
	}

}
