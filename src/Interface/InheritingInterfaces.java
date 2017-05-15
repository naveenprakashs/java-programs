package Interface;

public interface InheritingInterfaces
{

}

interface A
{
	void a();
}

interface B extends A
{
	void b();
}

interface C extends B
{
	void c();
}

interface D extends C 
{
	void d();
}

class imple implements D
{
	// this method must implement all of the methods of D
	// interface D has 4 methods
	
	public void a()
	{
		System.out.println("i am from a ");
	}
	public void b()
	{
		System.out.println("i am from b ");
	}
	public void c()
	{
		System.out.println("i am from c");
	}
	public void d()
	{
		System.out.println("i am from c ");
	}
}