package ExceptionHandling;

public class e19
{

	public static void main(String[] args)
	{
		try
		{
			Thread.sleep(1);  // if you command this line, error will occur in catch block
			                  // because it is fully checked exception and you need write code related to be fully checked 
			System.out.println("hello"); // this line not related to checked exceptions
		}
		catch(InterruptedException obj)
		{
			
		}

	}

}
