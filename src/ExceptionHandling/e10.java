package ExceptionHandling;

public class e10
{

	public static void main(String[] args)
	{
		throw new ArithmeticException("user defined arithmetic expection");
	}
	
	public static void method()
	{
		System.out.println("method is responsible for creating exception object and handover to jvm");
	}

}
