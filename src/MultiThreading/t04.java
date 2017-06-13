package MultiThreading;

class t extends Thread
{
	public void run()
	{
	  System.out.println(" i am the run method which start calls");	
	}
	
	public void run(int i)
	{
		System.out.println("i won't be called by start method anyway");
	}
	
	public void start()
	{
		System.out.println("i am dumb,so only i override start method");
	}
	
	public void start(int i)
	{
		System.out.println("i overload start method, i am the dumpest person in the world");
	}
}

public class t04
{

	public static void main(String[] args)
	{
            System.out.println("before creating thread");
            t myThread = new t();
            myThread.run();
            myThread.run(2);
            myThread.start();
            myThread.start(3);
		 
	}

}
