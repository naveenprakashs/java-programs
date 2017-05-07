package InnerClasses;

class Outerr
{
	int outer_x = 100;

	void test()
	{
		for (int i = 0; i < 10; i++)
		{
			class Inner
			{
				void display()
				{
					System.out.println("display: outer_x = " + outer_x);
				   //System.out.println(i); learn: don't why it is not accepted
				}
				Inner()
				{
					System.out.println("object created");
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		Outerr outer = new Outerr();
		outer.test(); 
	}
}
