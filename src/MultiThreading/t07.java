package MultiThreading;

class tt extends Thread
{
	public void run()
	{
		System.out.println("i am the job of thread");
	}
}


public class t07
{

	public static void main(String[] args)
	{
		tt t1 = new tt();
		Thread h = new Thread(t1); // here we are passing thread object instead of runnable interface
	}

}
