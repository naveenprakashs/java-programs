package Inheritence;

abstract class e1
{
	final  void print() 
	{ 
		System.out.println("i am from class e1");
	}
}

class e2 extends e1
{
	/*void print()
	{
		we can't override the class which has final keyword
		we can use final to block inheritence
	}*/ 
}
public class myclass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
