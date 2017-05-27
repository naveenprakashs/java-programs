package ExceptionHandling;

// this program  is properly exception handled
// no stack trace
// smoothly terminated

public class e6
{

	static void method1()
	{
		method2();
		System.out.println(" i am first method"); 
	}
	
	static void method2()
	{
		method3();
		System.out.println(" i am second method"); 
	}
	
	static void method3()
	{
		try
		{
		System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error occured");
		}
		System.out.println(" i am a third method"); 
	}
	
	public static void main(String[] args)
	{
		method1();		  
	}

}
