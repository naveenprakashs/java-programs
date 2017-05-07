package AccessModifiers;

class Daddy
{
	int money;
	int properties;	
	
	void print()
	{
		System.out.println("i am a method,having default access specifier");
	}
}

class son extends Daddy
{	
	void print()
	{
	super.money=100;
	super.print();
	}
}


public class defaultAccess
{

	public static void main(String[] args)
	{
	   Daddy mydaddy= new Daddy();
	   mydaddy.money=100;
	   mydaddy.properties=100;           
	}

}
