package OopsConcepts;

final class HelloFinal
{
	final int FinalVariable=10;
	void print(final int a)
	{
		// ++a; final local variable cannot be assigned twcie
		// FinalVariable=100; final variables can be intialized only once
	}
}

// class Hellocopy extends HelloFinal
// we can't inherit the final class

public class UnderstandingFinalKeyword
{
	public static void main(String[] args)
	{
		HelloFinal f = new HelloFinal();
	    //f.FinalVariable=100; final varible cannot be reassigned
		
	}
}
