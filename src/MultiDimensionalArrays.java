
public class MultiDimensionalArrays
{

	public static void main(String[] args)
	{
		int twoD[][]=new int[10][10];
		
		int twod[][]={{1,2,3},{4,5,5},{6,7,8}};
		
		
		for(int a=0;a<10;a++)
		{
		for(int b=0;b<10;b++)
		{
	       twoD[a][b]=a+b;
		}
        }
		
		for(int a=0;a<10;a++)
		{
		for(int b=0;b<10;b++)
		{
	       System.out.print(twoD[a][b]=a+b);
		}
		System.out.println();
	    }
		
		System.out.println();
		
		for(int a=0;a<3;a++)
		{
		for(int b=0;b<3;b++)
		{
	       System.out.print(twod[a][b]);
		}
          System.out.println();
	    }

}
}
