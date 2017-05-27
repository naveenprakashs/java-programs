package ExceptionHandling;

public class e3
{

	public static void main(String[] args)
	{
		int a=10;
		
		try
		{
			a/=0;
		}
		catch(Exception e)  // this handles all types of exceptions
		{
			System.out.println(e);
		}
		
		//catch(ArithmeticException e) it shows error! 	Because Exception itself will handle all types of Exception
		System.out.println("there is no need to give another exception after normal Exception which hanldes all the exception");

	}

}
