
public class ScopeANDlifeTimeOfVariables
{

	//System.out.println(a); this line will show error because a is only accessible in main method
	
	public static void main(String[] args)
	{
		int a=10; // can access throughout the main method
		
		{
			int b=100;
			//int a=100; error  because it will get confused which a we do refer
		    //int v=100; declaring variable at the end of the block is useless just because we can't access it outside and have no use inside
			
		}
		
		
		System.out.println(a);
		//System.out.println(b); this is only accessible in the above block only
   
		
		
	    	
		
		
	}

}
