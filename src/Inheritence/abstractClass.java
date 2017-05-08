package Inheritence;

abstract class abstractDemo
{
	abstract void abstractMethod();
	
	void normalMethod()
	{
		System.out.println("i am a normal method");
	}
	
}

class demo extends abstractDemo
{
	void abstractMethod()
	{
		System.out.println("i am a abstract method");
	}
}


public abstract class abstractClass
{

	public static void main(String[] args)
	{
		 //abstractDemo n = new abstractDemo(); we can't create objects for abstract class
		demo d = new demo();
		d.abstractMethod();
		d.normalMethod();
	}

}
