
public class DataTypes
{

	public static void main(String[] args)
	{
		
	    // all int types are signed
		
		byte b=-128;  //  8 bit
		byte b1=127;
		
		short s= -32768;  // 16 bit 
		short s1= 32767;
		
		int i=-2147483648;  // 32 bit
		int i2=2147483647;
		
		//we have insert l along with the number in end
        long l=-9223372036854775808l;  // 64 bit
        long l2=9223372036854775807l;
		
		// byte and short are promoted into int when they are evaluated
		
		byte bb=10;
		short ss=10;
		
		// the below lines of code will produce errors
/*		bb=bb+1;
		ss=ss+1;
		ss=ss+bb;
*/
		

		
		float f; // 32 bit
		double d; // 64 bit
		
		
		//Boolean only supports true or false values
		Boolean B=true;
		Boolean B1=false;
		Boolean BB=2<3;
		System.out.println(BB);
		
		//in java character is 16 bit
		char c=0;
		char c1=65535;
		int I;
		for(c=0,i=0;c<128;c++,i++)
		{
			System.out.println(i+" "+c);
		}
		c++; //we can perform arithmetic operation in char in java
		

	}

}
