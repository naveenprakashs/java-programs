package MultiThreading;

class display2
{
	public  void wish(String name) // only one thread can execute this method at a time
	{
		// 1000  lines of code goes here
		System.out.println(Thread.currentThread().getName());
		synchronized(this)
		{
		for(int i=0;i<10;i++)
		{
			System.out.println("good morning : "+name);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException obj)
			{
				
			}
		}
		}
		
		// 1000 lines of code goes here
	}
	
}


class mythreadv2 extends Thread
{
	display2 d;
	String name;
	
	mythreadv2(display2 d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}


public class t20 
{
	public static void main(String[] args)
    {
		display2 k = new display2();
		
		mythreadv2 t1 = new mythreadv2(k,"one");
		mythreadv2 t2 = new mythreadv2(k,"two");
		
		t1.start();
		t2.start();
	}

}
