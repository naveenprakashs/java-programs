package MultiThreading;

class mythread2 extends Thread 
{
	public void run()
	{
		try
		{
	   for(int a=0;a<=10;a++)
	   {
		   System.out.println("second thread");
		   Thread.sleep(1000);
	   }
		}
		catch(InterruptedException ob)
		{
			
		}
	}
}

public class t12
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("beginnig main method");
		
		mythread2 k = new mythread2();
		k.start();
		
		k.join(); // here main thread waits until child threads completes
		
		for(int a=0;a<=10;a++)
		{
			System.out.println("main method");
		}
	}

}
