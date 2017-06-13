package MultiThreading;

class  childThread1 extends Thread
{
	static Thread obj;
	
	public void run()
	{
		try
		{
			obj.join();
		}
		catch(InterruptedException obj)
		{
			System.out.println("system got  interrupted");
		}
		
		for(int a=0;a<=10;a++)
		{
			System.out.println("child thread");
		}
		
	}
}



public class t14
{

	public static void main(String[] args) throws InterruptedException
	{
		childThread1.obj=Thread.currentThread();
        childThread k = new childThread();
        k.join();
        k.start();
        
        for(int a=0;a<=10;a++)
        {
        	System.out.println("main thread");
        	Thread.sleep(1000);
        }

	}

}
