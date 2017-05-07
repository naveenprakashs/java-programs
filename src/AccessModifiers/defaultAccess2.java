package AccessModifiers;

class testing
{
	void print()
	{
		Daddy mydad=new Daddy();
		mydad.money=1;
		mydad.print();
	}
}

class test extends testing
{
	void print()
	{
	    Daddy my=new Daddy();
	    my.money=100;
	    my.print();
	    
	}
}

public class defaultAccess2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
