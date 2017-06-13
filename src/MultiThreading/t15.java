package MultiThreading;

public class t15 
{

	public static void main(String[] args) throws InterruptedException
	{
	     System.out.println("first line");
	     Thread.currentThread().join(); // here dead lock occurs
         System.out.println("second line");
	}

}
