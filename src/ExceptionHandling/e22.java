package ExceptionHandling;

public class e22
{

	public static void main(String[] args)
	{
 		try
 		{
 			System.out.println("resource opened");
 			System.out.println(1/0);
 			System.out.println("this is not going to execute");
 		}
 		catch(ArithmeticException obj)
 		{
 			System.out.println("exception handled");
 		}
 		finally
 		{
 			System.out.println("finally: resources closed");
 		}
	}

}
