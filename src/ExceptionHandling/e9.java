package ExceptionHandling;

public class e9
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println(1/0);
			System.out.println("statement3");
			System.out.println("statement4");
		}
		catch(ArithmeticException obj)
		{
		 	System.out.println("inside catch block...");
		}
		System.out.println("statement5");
		
		
		System.out.println();
	    System.out.println();
	    System.out.println();
		
		
		try
		{
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println(1/0);
			System.out.println("statement3");
			System.out.println("statement4");
		}
		catch(NullPointerException obj)
		{
		 	System.out.println("inside catch block...");
		}
		System.out.println("statement5");

	}

}
