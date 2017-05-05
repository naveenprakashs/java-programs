
public class AutomaticTypeConversion
{

	public static void main(String[] args)
	{
		byte b=127;
		short s=32576;
		int i=12345678;
		long l=12345678900L;
		
		char c;
		
		float f;
		double d;
		
		Boolean B;
		
		//Automatic  type conversion rules
		// two types must be compatible
		// destination type must be larger than source type
		
		      //short ss=2;
		      // b=ss; eventhough ss has less value that a byte can hold we can't convert byte to short
		
		// byte cannot be converted to any type as it is least
		
		s=b;
		
		i=s;
		i=b;
		
		l=b;
		l=s;
		l=i;
		
		f=l;
		f=s;
		f=b;
		f=i;
		
		d=f;
		d=l;
	    d=s;
	    d=i;
	    d=b;
	    
	    
	    //char is not compatible with any othe type 
	    //c=100;
	    //byte kk=100;
	    //c=kk;
	    
	    
	    // Boolean also not compatible with any other type

	}

}
