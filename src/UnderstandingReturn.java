
public class UnderstandingReturn
{

	public static void main(String[] args)
	{
		System.out.println("before return");
		if(true)
		
		return;
		System.out.println("after return");  //it will show error
		//because the compiler know it's never going to execute

	}

}
