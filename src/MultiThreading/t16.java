package MultiThreading;

class target extends Thread
{
	public void run() 
	{
		try
		{
		for(int a=0;a<=1000;a++)
		{
			System.out.println("target therad running");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException obj)
		{
			System.out.println("interrupted exception");
		}
	}
}


public class t16 
{

	public static void main(String[] args) 
	{
		target t = new target();
		t.start();
		t.interrupt();
		System.out.println("main thread going on");
	}

}
