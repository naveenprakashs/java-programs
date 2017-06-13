package MultiThreading;

class display3
{
	public  synchronized void wish(String name) // only one thread can execute this method at a time
	{
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this)
		{
		for(int i=0;i<10;i++)
		{
			System.out.println("i am"+name);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException obj)
			{
				
			}
			
		}
		}
	}
}


class mythreadv3 extends Thread
{
	display3 d;
	String name;
	
	mythreadv3(display3 d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}

public class t21 
{
	public static void main(String[] args)
	{
		display3 d1 = new display3();
		display3 d2 = new display3();
		
		mythreadv3 t1 = new mythreadv3(d1,"1");
		mythreadv3 t2 = new mythreadv3(d2,"2");
		
		t1.start();
		t2.start();

	}

}
