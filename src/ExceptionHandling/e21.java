package ExceptionHandling;

public class e21
{
	static int a=10/0; // exception in initializer error type2-programmatic exception

	static
	{
		String s=null; 
		System.out.println(s.length()); // exception in initializer error caused by null pointer exception
	}
	
	public static void main(String[] args)
	{
		int a[]=new int[10];
		a[11]=10; //ArrayIndexOutOfBoundsException 0
		
		int i=Integer.parseInt("10"); 
		int b=Integer.parseInt("one"); // Number format exception child of Illegal of argument exception : type2
		
		Thread t = new Thread();
		t.setPriority(12); // Illegal argument exception
		                  // the valid range of thread priority 1 to 10		
		
		Thread t1 = new Thread();
		t1.start();
		t1.start(); // illegal state exception : RuntimeException : type2
		String s=null;
		System.out.println(s.length()); // NullPointerExceptions
		
		Object o=(Object)s; // object class the parent class of String class
		s=(String)o;  // class cast exceptions
		
		Object oo = new String("hello");
		String temp =(String)oo; // it will b okay
		
		method1(); // stack overflow error 
		
		int x=1;
		assert(x>10); // Assertion error: assert statement fails type2
	}
	
	public static void method1()
	{
		method2();
	}

	public static void method2()
	{
		method1();
	}
}
