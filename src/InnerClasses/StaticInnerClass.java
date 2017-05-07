package InnerClasses;

class demoStaticInner
{
	private int value=1;
	int k=1;
	static int a=1;
	
	void  print1()
	{
	  System.out.println("i am in outer class with default access");	
	}
	static void print()
	{
		System.out.println("i am a static outer class method");
	}
	
	public static class in
	{
		int a;
		
		void print()
		{
			//System.out.println(value); cannot include non static stuffs  in static
			//System.out.println(k);
			System.out.println(a);
			//print1(); cannot call non static method in static class
			print(); // we can access only static methods in static class
		}
	}
	
	static private class A
	{
		
	}
	
	protected class B
	{
		
	}
	class C
	{
		
	}
	
	class AA extends A
	{
		
	}
}
public class StaticInnerClass
{

	public static void main(String[] args)
	{
		

	}

}
