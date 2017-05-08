package InnerClasses;

class A
{
	void show(String str) // overLoaded method
	{
		System.out.println("i m from A");
	}
	
	void print(int a,int b)
	{
		System.out.println("i am from A");
		System.out.println(a+b);
	}
}

class B extends A
{
	void show() // overLoaded method
	{
		System.out.println("i m from B");
	}
	
	void print(int a,int b)
	{
		System.out.println("i am from B");
		super.print(a, b);
	}
}

public class OverRiddenMethods
{
  public static void main(String[] args)
	{
		B bb = new B();
		bb.show(); // overLoading
		bb.show("hai"); // overLoading
		bb.print(10, 10);	// no way to call overridden super class method
	}
}
