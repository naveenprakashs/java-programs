package ExceptionHandling;

// learn: understanding multiple catch statements

import java.util.Random;

public class e2
{

	public static void main(String[] args)
	{
		int number=0;
		int result=0;
		int store[]=new int[4];
		
		Random r = new Random();
		
		for(number=0;number<=12;number++)
		{
			try
			{
				result=number/r.nextInt();
				store[number]=result;
				number=number/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("error occured:"+e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("you can have multiple catch statements"+e);
			}
			System.out.println(result);
		}
		

	}

}
