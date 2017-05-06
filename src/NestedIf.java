
public class NestedIf
{

	public static void main(String[] args)
	{
		Boolean isAndriod=true;
		Boolean haveNougat=false;
		Boolean ram4GB=true;
		Boolean camera13Mp=true;
		Boolean twoSIM=true;
		
		if(isAndriod)
		{
			if(haveNougat); // GIVE ATTENTION HERE
			{
				if(ram4GB)
				{
					if(camera13Mp)
					{
						if(twoSIM)
						{
							System.out.println("Buy this mobile");
						}
						else
						{
							System.out.println("please Don't buy this mobile! you can have only one sim!");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Don't buy this mobile");
		}

	}

}
