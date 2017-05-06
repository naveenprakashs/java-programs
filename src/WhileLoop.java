
public class WhileLoop
{

	public static void main(String[] args)
	{
		// All loops executes when conditions is true
		
		int age=1;
		Boolean isAlive=true;
		
		while(isAlive) // put semicolon here and execute
		{
			System.out.println("live life");
			age++;
			
			if(age==100)
			{
				System.out.println("life is over!");
				isAlive=false;
			}
		}
		
		System.out.println("while loop skipped");

	}

}
