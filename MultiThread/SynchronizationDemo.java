package syncronization;
//without synchronization
/*class PrintData{
	void multiplication(int n)
	{
		
		for(int i=1;i<=5;i++)
		{
			 System.out.println(n*i);
			 try {
				 Thread.sleep(400);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		}
	}
}
class Thread1 extends Thread
{
	PrintData t;
	public Thread1(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(5);
	}
	}
class Thread2 extends Thread{
	PrintData t;
	public Thread2(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(100);
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		//only on object PrintData class 
PrintData pd=new PrintData();
Thread1 t1=new Thread1(pd);
Thread2 t2=new Thread2(pd);
t1.start();
t2.start();
	}
}*/
//with synchronization
class PrintData{
	synchronized void multiplication(int n)
	{
		
		for(int i=1;i<=5;i++)
		{
			 System.out.println(n*i);
			 try {
				 Thread.sleep(400);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		}
	}
}
class Thread1 extends Thread
{
	PrintData t;
	public Thread1(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(5);
	}
	}
class Thread2 extends Thread{
	PrintData t;
	public Thread2(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(100);
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		//only on object PrintData class 
PrintData pd=new PrintData();
Thread1 t1=new Thread1(pd);
Thread2 t2=new Thread2(pd);
t1.start();
t2.start();
	}
}

