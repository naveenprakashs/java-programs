package ExceptionHandling;

class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);  // jvm- default exception handler - printStackTrace(String str)
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}

public class e20
{

	public static void main(String[] args)
	{
		int age = 10;
		if (age < 18)
		{
			try
			{
				throw new TooYoungException("You are not eligible to get married"); // throw keyword is used to throw user defined exception not for predefined exception 
			}
			catch (TooYoungException obj)
			{
				System.out.println("exception handled");
			}
		}
		age = 90;
		if (age > 70)
		{
			throw new TooOldException("You are too old to get married");
		}

	}

}
