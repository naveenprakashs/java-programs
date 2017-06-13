package MultiThreading;

class myThread1 extends Thread
{
	public void run()
	{
	  System.out.println("currnt object:"+Thread.currentThread());
	   for(int a=0;a<=10;a++)
	   {
		   System.out.println("second thread");
		   //currentThread().yield();
	   }
	  Thread.currentThread().yield();
	}
}


public class t11
{

	public static void main(String[] args)
	{
      myThread1 k = new myThread1();
      k.start();
      k.setPriority(7);
      myThread1 k1 = new myThread1();
      k1.start();
      k1.setPriority(10);
     
      for(int a=0;a<=10;a++)
      {
    	  System.out.println("main thread");
      }
	}

}
