package java8;

import java.util.ArrayList;

public class LambdaDemoEx {

	public static void main(String[] args) {
//		ArrayList<String> alist=new ArrayList<String>();
//		alist.add("Nilanjan");
//		alist.add("Suraj");
//		alist.add("Shawin");
//		alist.add("Biswajit");
//		alist.add("Abhijit");
//		//forEach method
//		alist.forEach(
//				
//				(s)->System.out.println(s)
//				);
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread is running");
			}
			
		};
		Thread t1=new Thread();
		t1.start();
		
		//with lambda
		Runnable r2=()->
		{
			System.out.println("thread2 is running");
		};
		Thread t2=new Thread(); 
		t2.start();
		
	}

}
