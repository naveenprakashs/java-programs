package Inheritence;

class x 
{
	void print()
	{
		System.out.println("i am from x");
	}
}

class y extends x
{
	void print()
	{
		System.out.println("i am from y");
	}
}

class z extends y
{
	void print()
	{
		System.out.println("i am from z");
	}
}

class zz extends z
{
	void print()
	{
		System.out.println("i am from zz");
	}
}


public class DynamicMethodDispatch
{

	public static void main(String[] args)
	{
		x a = new x();
		y b = new y();
		z c = new z();
		zz d= new zz();
		
		x X; // a super class variable can refer to a sub class object
		
		X = a;
		X.print();
		X = b;
		X.print();
		X = c;
		X.print();
		X = d;
		X.print();
	}

}
