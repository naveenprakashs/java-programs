
public class break_uses
{

	public static void main(String[] args)
	{
		// break can be useful in switch to break it
		// it break a loop
		// to get outside of goto statements

		while (true)
		{
			System.out.println("inside first while loop");
			while (true)
			{
				System.out.println("inside second while loop");
				while (true)
				{
					System.out.println("inside third while loop");
					break;
				}
				break;
			}
			break;
		}

		first:
		{
			System.out.println("inside first");
			second:
			{
				System.out.println("inside second");
				third:
				{
					System.out.println("inside third");
					break first;
				}
				// System.out.println("outside of second"); unreachable code because it breaks from fist
			}
			 // System.out.println("outside of third"); unreachable code 
		}
		
		
		System.out.println("finally i am free");

	}

}
