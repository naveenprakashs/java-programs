
public class EnhancedFORloop
{

	public static void main(String[] args)
	{
		int array[]={1,2,3,4,5,6,7,8,9,0};
		int b=0;
		for(int sum: array)
		{
			System.out.println(sum);
			
			b=b+sum;
		}
		
		System.out.println(b);
		
		

	}

}
