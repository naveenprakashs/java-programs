package ExceptionHandling;

public class e12
{
   static ArithmeticException object;
   
	public static void main(String[] args)
	{
		throw object; // null pointer exception because static object default value is null

	}

}
