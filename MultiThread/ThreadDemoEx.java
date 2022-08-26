package thread;

public class ThreadDemoEx extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{Thread.sleep(400);
			
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemoEx t1=new ThreadDemoEx();
		ThreadDemoEx t2=new ThreadDemoEx();
		ThreadDemoEx t3=new ThreadDemoEx();
		ThreadDemoEx t4=new ThreadDemoEx();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.NORM_PRIORITY);//5
		t3.setPriority(Thread.MAX_PRIORITY);//10
		t4.setPriority(7);
		t1.start();
		/*try {
			//t1.join();
			t1.join(400);
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		*/
		t2.start();
		t3.start();
		t4.start();
	}

}
