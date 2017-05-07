package AccessModifiers;

public class Public
{
   public int pUblic=1;
   
   public void printt()
   {
	   System.out.println("i am a method with public keyword");
   }
	
	public static void main(String[] args)
	{
		

	}

}

class PUBLICc extends Public
{
	void print()
	{
		printt();
		super.pUblic=11;
	}
}
