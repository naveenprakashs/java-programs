package Inheritence;

class first
{
	int firstVariable;
	int a1;
	int same;
	
	first(int a)
	{
		firstVariable=a;
	}
	first()
	{
		System.out.println("first constructer called");
	}
	void firstMethod()
	{
		System.out.println("i am a first method");
	}
}

class second extends first
{
	int secondVariable;
	int firstVariable;
	int same;
	
	int a2;
	
	second(int a,int b)
	{	
	super(b);
	secondVariable=a;
	}
	
	second()
	{
		System.out.println("second constructer called");
	}
	
	void secondMethod()
	{
		System.out.println("i am a second method");
	}
	
	void test()
	{
		System.out.println(a1);
		System.out.println(a2);
	   //System.out.println(a3);
		
		System.out.println();
	}
}

class third extends second
{
	int thirdVariable;
	int firstVariable;
	int secondVariable;
	
	int a3;
	
	int same;
	
	third(int a,int b,int c)
	{
		super(b,c);
		thirdVariable=a;
	}
	
	third()
	{
		System.out.println("third constructer called");
	}
	
	void thirdMethod()
	{
		System.out.println("i am a third method");
	}
	
	void test()
	{
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(super.same);
		System.out.println(same);
		System.out.println("i don't know how to print the same variable in first class");
	}
}

class fourth extends first // proof that a class can have so many child
{
	int fourthVariable;
	
	void fourthVariable()
	{
		System.out.println("i am fourth method");
	}
}

public class examble2
{
   public static void main(String[] args)
	{
		third t = new third();
		t.a1=10;
		t.a2=10;
		t.a3=10;
		
		t.firstMethod();
		t.secondMethod();
		t.thirdMethod();
	    //t.fouthVariable(); third cannot access it
		
		first f = new first();
		// f.fourthVariable(); first cannot access fourth
		
	}
}
