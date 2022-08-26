package thread;

public class TestGarbageCollection {
public void finalize()
{
	System.out.println("all object are collected for garbage collection");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarbageCollection t1=new TestGarbageCollection();
		TestGarbageCollection t2=new TestGarbageCollection();
		t1=null;
		t2=null;
		System.gc();
		System.out.println("all are unreference");
	}

}
