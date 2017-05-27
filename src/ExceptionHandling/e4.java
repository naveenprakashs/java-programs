package ExceptionHandling;

public class e4
{
  public static void main(String[] args)
	{
		int a,b;
		int arr[]=new int[1];
		
		try
		{
			arr[2]=3;
			a=1/0; // even though it is an exception it won't run. because before this line an exception already there
		}
		catch(ArithmeticException e) // first it checks for exception
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);  // second it checks for exception
		} 
		catch(Exception e)    // finally this exception checks for all types of exception
		{
			System.out.println("this exception handles all types of exception");
		}
		// we can't have any exception after Exception

	}

}
