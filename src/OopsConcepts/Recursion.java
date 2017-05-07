package OopsConcepts;

public class Recursion
{

	static void addTill9()
	{
		int number=0;
		int a=0;
		if(number>9)
		{
			System.out.println(number);
		}
		else
		{   a++;
			number=number+a;
			addTill9();
		}
	}
	
	static void print()
	{
		System.out.println("printing");
		print();
	}
	
	public static void main(String[] args)
	{
		print();

	}

}
