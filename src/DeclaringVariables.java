
public class DeclaringVariables
{

	public static void main(String[] args)
	{
		int variable1,variable2,variable3,variable4;
		
		// intializing before runnig program
		int variable=10;
		variable1=100;
		
		// local variables must be initialized before it is used
		// without below lines the program will show an error
		
		// System.out.println(variable2); this line shows error because we have not initalized the variable2
		
		variable2=100;
		variable3=100;
		variable4=100;
		
		// Dynamic initialization which occurs at run time
        variable4=variable+variable1+variable2+variable3; 
        System.out.println(variable4);
	}

}
