package MultiThreading;

public class t05
{

	public static void main(String[] args)
	{
		System.out.println("berfore calling thread");
		Thread t  = new Thread();
		t.start();
		System.out.println("after calling a thread at first time");
		t.start(); // here illegal thread state exception occurs

	}

}
