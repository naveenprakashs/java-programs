package ExceptionHandling;

public class e11
{
    static ArithmeticException object = new ArithmeticException();
	
	public static void main(String[] args)
	{
		throw object;
	   // System.out.println("hello");  unreachable code error 
	}
	
	public static void hello()
	{
		System.out.println(1/0);                  // unchecked exception 
		System.out.println("hello world method"); // it is not  unreachable code
	} 

}
