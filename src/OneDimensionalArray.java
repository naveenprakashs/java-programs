
public class OneDimensionalArray
{

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6,7,8,9};
     
		int b[];
		b=new int[12];
		
//		int bb[];
//		bb[]={1,3,3};
		
		//we can  initialize like this or we can use for loop
		b[0]=1;
		b[1]=2;
		b[10]=11;
		
		System.out.println(b[10]);
		
		for(int temp=0;temp<12;temp++)
		{
			b[temp]=temp;
		}
		
		for(int temp=0;temp<12;temp++)
		{
			System.out.println(b[temp]);
		}
		
		
        
        
	}

}
