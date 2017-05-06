
public class Continue
{

	public static void main(String[] args)
	{
		int evenNumber = 10;

		for (int a = 0; a <= 10; a++)
		{
			if (evenNumber % 2 == 0)
			{
				System.out.println("even number");
				break;
			}
			else
			{
				continue;
			}
			// System.out.println("something goes here.."); it is unreachable
			// code
		}

		outer: for (int a = 10; a <= 20; a++)
		{
			inner: for (int b = 0; b <= a; b++)
			{
				if (b == 15)
				{
					break outer;
					// break; this statement simply breaks the inner block
				}
				else
				{
					continue outer; // continue can be only used inside the
									// loops
				}
			}

		}

		
		
		for(;;)
		{
			System.out.println("outer loop");
			for(;;)
			{
				System.out.println("inner loop");
				continue;
			}
		}
		
		
		
		
// run below examble and understand how continue works
/*		run:while (true)
		{
			first: System.out.println("IN FIRST");
			{
				second: System.out.println("IN SECOND");
				{
					third:
					{
						System.out.println("IN THIRD");
						//continue first; it will show error
						//continue run; it will be OKAY
					}
				}
			}
		}
		
		
		*/

	}

}
