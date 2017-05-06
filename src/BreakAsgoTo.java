
public class BreakAsgoTo
{

	public static void main(String[] args)
	{
		first:
		{
            // break second; showing error because it is not even inside second
			System.out.println("HELLO FIRST");
			second:
			{
				System.out.println("Hello second");
				Third:
				{
					//continue first; continue cannot be used outside of a loop
					//break Third; it u uncomment this the next two lines will show error as unreachable code
					System.out.println("i am in third");
					break first;
				}

			}
		}

	}

}
