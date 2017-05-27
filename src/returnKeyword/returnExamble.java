package returnKeyword;

public class returnExamble
{

	public static void method1()
	{
		System.out.println("inside method1");
		method2();
		System.out.println("after method2 call");
	}

	public static void method2()
	{
		System.out.println("inside method2");
		return; // without this statement after method2 call won't execute 
		//System.out.println("inside method2 after return"); // because it returns to the caller
	}
	
	public static void main(String[] args)
	{
		method1();

	}

}
