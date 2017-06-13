package MultiThreading;

class display1
{
	public  synchronized void wish(String name) // only one thread can execute this method at a time
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


class mythreadv1 extends Thread
{
	display1 d;
	String name;
	
	mythreadv1(display1 d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}



public class t18 {

	public static void main(String[] args) 
	{
		display1 d1 = new display1();
		display1 d2 = new display1();
		 
		mythreadv1 t1 = new mythreadv1(d1,"one");
		mythreadv1 t2 = new mythreadv1(d2,"two");
		
		t1.start();
		t2.start();
         
		
	}

}
