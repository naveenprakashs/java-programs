package MultiThreading;

class threadOne implements Runnable
{
	public void run()
	{
		System.out.println("hello i am second therad");
		System.out.println(Thread.currentThread().getName());
		System.out.println("my priority:"+Thread.currentThread().getPriority());
	}
}

public class t10
{

	public static void main(String[] args)
	{
		System.out.println("hello i first thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println("my priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		threadOne k = new threadOne();
		Thread t = new Thread(k);
	    t.start();
	    System.out.println("hello i first thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println("my priority:"+Thread.currentThread().getPriority());
	}

}
