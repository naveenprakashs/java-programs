package MultiThreading;

class display
{
	public synchronized void wish(String name) // only one thread can execute this method at a time
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("good morning :");
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException obj)
			{
				
			}
			System.out.println(name);
		}
	}
}


class mythreadv extends Thread
{
	display d;
	String name;
	
	mythreadv(display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}

public class t17 
{

	public static void main(String[] args)
	{
		display d = new display();          // d-single object is accessed by three threads simultaneously
		mythreadv t1 = new mythreadv(d,"one");
		mythreadv t2 = new mythreadv(d,"two");
		mythreadv t3 = new mythreadv(d,"three");
		
		t1.start();
		t2.start();
		t3.start();
           
	}

}
