package ExceptionHandling;

public class e7
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("toString");
			System.out.println(obj.toString());
			System.out.println();
			System.out.println("getMessage:");
			System.out.println(obj.getMessage());
			System.out.println();
			System.out.println("stackTrace");
			obj.printStackTrace();
			System.out.println();
		}

	}

}
