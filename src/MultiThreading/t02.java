package MultiThreading;

class myT extends Thread   // this is class is called as definition of thread
{
	public void run()    // overriding run method
	{
		int a=0;
		for(a=0;a<=4;a++)                      // JOB OF THREAD
		{                                      
			System.out.println("run method"); 
		}
		System.out.println("after run method");
	}
}

public class t02
{
	public static void main(String[] args)
	{
		System.out.println("before threads");
		
		myT t = new myT();    // thread instantiation
		t.start();
		
		int a=0;
		for(a=0;a<=4;a++)
		{
			System.out.println("mythread method");	
		}
		System.out.println("last line");

	}
}
