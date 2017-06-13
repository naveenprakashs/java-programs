package MultiThreading;


class disp
{
	public synchronized void  displayN()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException obj)
			{
				
			}
		}
	}
	
	public synchronized void displayC()
	{
		for(int i=65;i<75;i++)
		{
			System.out.println((char)i);
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


class thread2 extends Thread
{
	disp d;
	
	thread2(disp d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.displayN();
	}
}


class thread3 extends Thread
{
	disp d;
	
	thread3(disp d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.displayC();
	}
}





public class t19 
{

	public static void main(String[] args) 
	{
		disp d = new disp();
		
		thread2 t1 = new thread2(d);
		thread3 t2 = new thread3(d);
		
		t1.start();
		t2.start();

	}

}
