package ExceptionHandling;

public class e1
{
	static void hello()
	{
		System.out.println("hello method");
		int a=10/0;
		
	}

	public static void main(String[] args)
	{
	
		try
		{
		   int a=10/0; // here arithmetic exception occurs
		   System.out.println(a);
		    hello();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("after...."); // it proves that program not stopped after exception
		 

	}

}
