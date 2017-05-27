package ExceptionHandling;

public class e24
{

	public static void main(String[] args)
	{
	  
		try
		{
			System.out.println(1/0);
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException|NullPointerException ob)
		{
			System.out.println("i can handle multiple different exceptions");
		}

	}

}
