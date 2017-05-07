package AccessModifiers;

class Privatee
{
	private int aprivate;
	
	private void printtt()
	{
		System.out.println("i am private method");
	}
}

class k extends Privatee
{
	void print()
	{
		//super.aprivate=1;
		//super.printtt();
	}
}

public class Private
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Privatee p = new Privatee();
		//p.aprivate=1;

	}

}
