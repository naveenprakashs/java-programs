package MultiThreading;

class myThread10 implements Runnable
{
	public void run()
	{
		System.out.println("running second thread");
	}
}

public class t09
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("i naveen");
		System.out.println(Thread.currentThread().getName());
	}

}
