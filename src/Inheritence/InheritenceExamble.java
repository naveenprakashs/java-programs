package Inheritence;

class mainClass
{
	private int value=10;
	protected int value1=10;
	
	private void print()
	{
		System.out.println("i am a private method");
	}
	
	protected void print1()
	{
		System.out.println("i am a protected method in super class");
	}
}

class subClass extends mainClass
{
	int value=111;
	int value1=111;
	
	void print()
	{
		System.out.println("i am subclass method");
		System.out.println(value1);
		System.out.println(super.value1); // child class can access private members of the father class
        print1(); // we can access father class methodsa and variables without super keyword
                  // we need to use super keyword while the super class and sub class has the same name for a varaibe or method
	}
	
}


public class InheritenceExamble
{

	public static void main(String[] args)
	{
		subClass s = new subClass();
		s.print();
		s.value1=100;
		s.print1();
	}

}
