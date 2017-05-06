
public class _10_NestedSwitch
{

	public static void main(String[] args)
	{
		int month=2;
		int day=5;
		
		switch(month)
		{
			case 1:
				
				System.out.println("january");
				switch(day)
				{
			case 1:
				System.out.println("sunday");break;
			case 2:
			    System.out.println("monday");break;
			case 3:
			   System.out.println("tuesday");break;
			case 4:
			   System.out.println("wednesday");break;
			case 5:
		       System.out.println("thirsday");break;
			case 6:
			   System.out.println("friday");break;
			case 7:
			   System.out.println("saturday");break;
				}
				break;
				
			case 2:
				System.out.println("febuary");
				switch(day)
				{
			case 1:
				System.out.println("sunday");break;
			case 2:
			    System.out.println("monday");break;
			case 3:
			   System.out.println("tuesday");break;
			case 4:
			   System.out.println("wednesday");break;
			case 5:
		       System.out.println("thirsday");break;
			case 6:
			   System.out.println("friday");break;
			case 7:
			   System.out.println("saturday");break;
				}
				break;
				
			case 3:
				System.out.println("march");
				switch(day)
				{
			case 1:
				System.out.println("sunday");break;
			case 2:
			    System.out.println("monday");break;
			case 3:
			   System.out.println("tuesday");break;
			case 4:
			   System.out.println("wednesday");break;
			case 5:
		       System.out.println("thirsday");break;
			case 6:
			   System.out.println("friday");break;
			case 7:
			   System.out.println("saturday");break;
				}
				break;
				
			case 4:
				System.out.println("april");
				switch(day)
				{
			case 1:
				System.out.println("sunday");break;
			case 2:
			    System.out.println("monday");break;
			case 3:
			   System.out.println("tuesday");break;
			case 4:
			   System.out.println("wednesday");break;
			case 5:
		       System.out.println("thirsday");break;
			case 6:
			   System.out.println("friday");break;
			case 7:
			   System.out.println("saturday");break;
				}
				break;
				
			default: System.out.println("first four month only available here");
			          
		}

	}

}
