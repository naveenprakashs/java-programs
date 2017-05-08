package Inheritence;

abstract class Abstract
{
	
	abstract void addNumbers();
	
	
}

class addIntegers extends Abstract
{
	int a,b;
	addIntegers(int dim1,int dim2)
	{
		a=dim1;
		b=dim2;
	}
	
	void addNumbers()
	{
		System.out.println(a+b);
	}
}

class addLong extends Abstract
{
	long a,b;
	
	addLong(long l1,long l2)
	{
		a=l1;
		b=l2;
	}
	
	void addNumbers()
	{
		System.out.println(a+b);
	}
}

public class abstractClassExamble
{

	public static void main(String[] args)
	{
		addIntegers a = new addIntegers(1,3);
		addLong b = new addLong(134235,123423);
		a.addNumbers();
		b.addNumbers();
		
		Abstract A;
		A=a; // we can't create objects for abstract class, but we can give reference to it
		A.addNumbers();
		System.out.println();

	}

}
