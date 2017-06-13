package MultiThreading;

class mythread12  extends Thread implements Runnable // we can extend a class if use Runnable interface
{
	public void run()
	{
		System.out.println("i am thread");
	}
}

public class t08
{   public static void main(String[] args)
	{
		System.out.println("before calling  thread");
		
		mythread12 k = new mythread12();
		
		Thread t = new Thread(k);
		t.start();
		System.out.println("after calling thread");
	}
}
