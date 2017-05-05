
public class ThreeDimensionalArray
{

	public static void main(String[] args)
	{
	
		int threeD[][][]=new int[3][3][3];
		
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				for(int c=0;c<3;c++)
				{
					threeD[a][b][c]=a+b+c;
				}
			}
		}
		
		
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				for(int c=0;c<3;c++)
				{
					System.out.print(threeD[a][b][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
