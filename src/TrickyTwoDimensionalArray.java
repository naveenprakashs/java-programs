
public class TrickyTwoDimensionalArray
{

	public static void main(String[] args)
	{
	
		int twoD[][]=new int[3][];
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<=a;b++)
			{
				twoD[a][b]=b;
			}
		}
		
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print(twoD[a][b]);
			}
			System.out.println();
		}


	}

}
