package ExceptionHandling;

// this program is not properly exception handled
// stack trace printed 
// abnormal termination

public class e5
{

	static void method1()
	{
		method2();
		System.out.println(" i am first method"); // it won't execute
	}
	
	static void method2()
	{
		method3();
		System.out.println(" i am second method"); // it won't execute
	}
	
	static void method3()
	{
		System.out.println(1/0);
		System.out.println(" i am a third method"); // it won't execute
	}
	
	public static void main(String[] args)
	{ 
		
     method1();
     
	}

}
