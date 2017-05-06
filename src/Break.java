
public class Break
{

	public static void main(String[] args)
	{
		int number;
		
		// break is used to exit from a loop
		
		for(number=0;number<=100;number++)
		{
			if(number==10)
			{
				break;
			}
			System.out.println(number);
		}
		
		
		for(number=0;number<=3;number++)
		{
			for(int count=0;count<=100;count++)
			{
				if(count==10)
				{
					break; // break only get the control out from in which it lives
					       // it won't get exit from outer loop , it only breaks inner loop
				}
				System.out.print(count);
			}
			System.out.println();
		}

	}

}
