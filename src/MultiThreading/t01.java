package MultiThreading;

class myThread extends Thread
{
	public void run() // we are overriding run method which exist Thread class
	{
		System.out.println("inside run method");
	}
}

public class t01
{

	public static void main(String[] args)
	{
		System.out.println(" before creating thread");
        myThread t = new myThread();
        t.start();
        System.out.println("after creating thread");	
	}

}
