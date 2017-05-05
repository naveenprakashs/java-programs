
public class AutomaticTypeConversionInExpressions
{

	public static void main(String[] args)
	{
		byte b=10;
		short s=10;
		int i=10;
		long l=10;
		 
		float f=10;
		double d=10;
		
		char c='d';
		
		// (byte,short,char)<int<long<float<double
        // while evaluating expression that contains byte short and char
		// those are promoted into int;
		// so the data type must be atleast interger to hold the value of a expression
		 
		i=b+s+c;     // result will be in integer
		System.out.println(i);
		l=b+s+c+l+i;  // result will be in long
		System.out.println(l);
		f=b+s+c+i+l+f; // result will be  in float
		System.out.println(f);
		d=b+s+c+i+l+f+d; // result will be in double
		System.out.println(d);
		
	  	
	}

}