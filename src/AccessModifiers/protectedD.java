package AccessModifiers;

class ProteDed
{
	protected int data;
	protected void Print()
	{
		System.out.println("i am protected method");
	}
}

class protectEDd extends ProteDed
{
	void print()
	{
		super.data=100;
		super.Print();
	}
}


public class protectedD
{

	public static void main(String[] args)
	{
		ProteDed n = new ProteDed();
		n.Print();
		n.data=100;
	}

}
