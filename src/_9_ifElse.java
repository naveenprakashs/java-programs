
public class _9_ifElse
{

	public static void main(String[] args)
	{
		Boolean live=false;
		
		if(live)
		{
			System.out.println("yor are alive!");
		}
		else
		{
			System.out.println("you are dead!");
		}
		
	/*	if(live);
		{
			System.out.println("you are alive!");
		}
		else //error will come due to semicolon in if statement
		{
			System.out.println("you are dead!");
		}
	*/	
		if(live)
			System.out.println("yor are alive!");
		else;
			System.out.println("you are dead!");
			
		

	}

}
