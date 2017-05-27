package ExceptionHandling;

public class e16
{
	e16() throws InterruptedException
	{
		System.out.println("we can use throws keyword even for constructers");
	}
	
	static void method1() throws InterruptedException
	{
	    method2();
	}
	
	static void method2() throws InterruptedException
	{
		method3();
	}
	
	static void method3() throws InterruptedException
	{
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws InterruptedException
	{
         method1();
         System.out.println("hello world");
	}

}
