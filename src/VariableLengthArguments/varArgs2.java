package VariableLengthArguments;

class testd
{
	void print(int ...v)
	{
		
	}
	
	void print(float ...f)
	{
		
	}
	
	void print(double ...d)
	{
		
	}
	
	void print(char c,int ...i)
	{
		
	}
	
}

public class varArgs2
{

	public static void main(String[] args)
	{
		testd d = new testd();
		d.print(); // compiler won't konw which method to call if the arguments are empty

	}

}
