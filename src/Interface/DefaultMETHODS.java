package Interface;

public interface DefaultMETHODS
{
   void sayHello();
   
   default void sayMethod()
   {
	   System.out.println(" i am a default method");
   }
}

class demo implements DefaultMETHODS
{
	public void sayHello()
	{
		System.out.println("i am a say hello abstract method");
	}
	
	public void sayMethod()
	{
		System.out.println("it is also possible that a class can implement default methods");
	}
}

class objclass implements DefaultMETHODS
{
	public void sayHello()
	{
		System.out.println(" i am sayHELLO method from obj class");
		System.out.println("it is not necessary to implement default method");
	}
	
}