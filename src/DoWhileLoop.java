
public class DoWhileLoop
{

	public static void main(String[] args)
	{
		Boolean b=true;
		char option='x';
		// do while loop will be useful while showing menus for users
		
		do
		{
			System.out.println("1.addtion");
			System.out.println("2.Supraction");
			System.out.println("3.Multiplicaion");
			System.out.println("4.division");
			System.out.println("press q to exit");
			if(option=='q')
			{
				b=false;
				break;
				// b=false; unreachable code
			}
		}
		while(b);

	}

}
