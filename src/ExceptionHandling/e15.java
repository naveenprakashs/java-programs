package ExceptionHandling;

import java.io.*;

public class e15
{

	public static void main(String[] args) throws InterruptedException
	{
		try
		{
		Thread.sleep(5000); // we have to handle checked expecting using try catch or throws
		System.out.println("hello");
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
	}

}
