package syncronization;

class PrintData2{
	void multiplication(int n)
	{
		System.out.println("out of synchronize Block");
		synchronized(this)
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
		System.out.println("Rest of code which is not synchronized");
		}
}

public class SynchronizeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintData2 pd=new PrintData2();
		Thread t1=new Thread()
		{
			public void run()
			{
				pd.multiplication(5);
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				pd.multiplication(100);
			}
		};
		t1.start();
		t2.start();
	}

}
