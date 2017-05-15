package Interface;

public interface InterfaceExamble
{
      void firstMethod();
      void secondMethod();
      void thirdMethod();
}

abstract class myclass implements InterfaceExamble
{
	void print()
	{
		System.out.println("i am from myclass.");
		System.out.println("i am an abstract class");
		System.out.println("i am implements interfaceExamble");
		System.out.println("but i am not implemented a single method of InterfaceExamble");
		System.out.println("because i am a abstract class");
		System.out.println("so sad,i can't have objects");
		System.out.println();
	}
	
	public void thirdMethod()
	{
	   System.out.println("i am a partially implementd method of an interface");
	   System.out.println();
	}
}

class myclass2 extends myclass
{
	public void firstMethod()
	{
		System.out.println("i am from myclass2");
		System.out.println("i am a method of interface");
		System.out.println();
	}
	public void secondMethod()
	{
		System.out.println("i am from myclass2");
		System.out.println("i am alos a method of interface");
		System.out.println();
	}
	
	public void thirdMethod()
	{
		super.thirdMethod();
	}
	 
	void print()
	{
		super.print();
	}
}

   // link:partialImplementations.java