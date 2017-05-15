package Interface;

public interface i1
{
   default void hello()
   {
	  System.out.println("hello from interface one through default method"); 
   }
	
}

interface i2
{
	default void hello()
	{
		System.out.println("hello from interface two through default method");
	}
}

class testi implements i1,i2
{
	public void hello()
	{
		System.out.println("it is necessary to have this method to prevent collision of default methods");
	}
}

interface j
{
	default void hello()
	{
		System.out.println(" i am from interface j");
	}
}

interface k extends j
{
	default void hello()
	{
		System.out.println("i am from interface k");
	}
}

class test2 implements k
{
	
}