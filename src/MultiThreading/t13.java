package MultiThreading;


class  childThread extends Thread
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


public class t13 {

	public static void main(String[] args)  throws InterruptedException
	{
		childThread.obj=Thread.currentThread();
        childThread k = new childThread();
        k.start();
        
        for(int a=0;a<=10;a++)
        {
        	System.out.println("main thread");
        	Thread.sleep(1000);
        }
	}

}
