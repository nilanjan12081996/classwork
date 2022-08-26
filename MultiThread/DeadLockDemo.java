package syncronization;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="paper";
		final String resource2="pen";
		//Thread1: Nilanjan lock resource1:paper and wanted to lock resource2:pen
	Thread nilanjan=new Thread()
			{
		public void run()
		{
			synchronized(resource1)
			{
				System.out.println("Nilanjan Locked Resource1:paper");
				try {
					Thread.sleep(100);
		
				}catch(Exception e)
				{
					System.out.println(e);
				}
				//Thread 1:Nilanjan trying to lock resource2:Pen
				synchronized(resource2)
				{
					System.out.println("wanted to lock resource2 pen");
				}
			}
		}
			};
			//Thread2: Shawin lock resource2:pen and wanted to lock resource2:paper
			Thread shawin=new Thread()
			{
		public void run()
		{
			synchronized(resource2)
			{
				System.out.println("Shawin Locked Resource2:pen");
				try {
					Thread.sleep(100);
		
				}catch(Exception e)
				{
					System.out.println(e);
				}
				//Thread 2:Shawin trying to lock resource1:Paper
				synchronized(resource1)
				{
					System.out.println("wanted to lock resource1 paper");
				}
			}
		}
			};
			nilanjan.start();
			shawin.start();
	}

}
