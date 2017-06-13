package MultiThreading;

class myThreadclass1 implements Runnable      // definition of thread
{
	public void run()                         // job of thread begins
	{                                         
		System.out.println("i am a thread");  
	}                                         // job of thread ends
}                                            

public class t06
{

	public static void main(String[] args)
	{
		System.out.println("before creating thread");
		myThreadclass1 a = new myThreadclass1();
		Thread t = new Thread(a);
		t.start();
	    System.out.println("after calling thread");

	}

}
