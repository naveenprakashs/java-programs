package MultiThreading;

class myThreadClass extends Thread
{
	public void run()
	{
		System.out.println(" i am just method of jobs of a thread");
	}
}

public class t03
{

	public static void main(String[] args)
	{
		System.out.println("before creating threads");
		myThreadClass k = new myThreadClass();
		k.run();      // it just calls run method
		System.out.println("after calling run method");
		k.start();   // it creates a new method
		System.out.println("last line of main method");
	}

}
