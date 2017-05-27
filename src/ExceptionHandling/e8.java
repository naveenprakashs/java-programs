package ExceptionHandling;

public class e8
{

	public static void main(String[] args)
	{
		try
		{
		System.out.println(1/0);
		}
		catch(ArithmeticException obj)
		{
			try
			{
		System.out.println(1/0);	
			}
			catch(ArithmeticException objd) // we can't have the obj here because already obj in above catch block
			{
				System.out.println("exception occurs inside catch block");
			}
		
		}
		}

	}

