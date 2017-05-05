
public class ManualTypeConversion
{

	public static void main(String[] args)
	{
		byte b=127;
		short s=32576;
        int i=123456789;
        long l=123456789101112L;
        
        float f=1000000.2343434f;
        double d=1234545345345.4524545345d;
        
        char c='h';
        
        Boolean B=true;
           
        
        s=200;
        i=200;
        l=200l;
        f=200f;
        d=200d;
        c=200;
        
        System.out.println("conversion of other types to byte");
        // conversion of other types to byte
        b=(byte)s; System.out.println(b);
        b=(byte)i; System.out.println(b);
        b=(byte)l; System.out.println(b);
        b=(byte)f; System.out.println(b);
        b=(byte)d; System.out.println(b);
        b=(byte)c; System.out.println(b);
        
        //b=(byte)B;  boolean not compatible with any type even for Manual type promotion
	 
        System.out.println("conversion of other types to short");
        // conversion of other types to short
        s=(short)i; System.out.println(s);
        s=(short)l; System.out.println(s);
        s=(short)f; System.out.println(s);
        s=(short)d; System.out.println(s);
        s=(short)c; System.out.println(s);
        
        System.out.println("conversion of other types to initerger");
        // conversion of other types to int
        i=(int)l; System.out.println(i);
        i=(int)f; System.out.println(i);
        i=(int)d; System.out.println(i);
        i=(int)c; System.out.println(i);
        
        System.out.println("conversion of other types to long");
        // conversion of other types to long
        l=(long)f; System.out.println(l);
        l=(long)d; System.out.println(l);
        l=(long)c; System.out.println(l);
        
        System.out.println("conversion of other types to float");
        // conversion of other types to float
        f=(float)d; System.out.println(f);
        f=(float)c; System.out.println(f);
        
        System.out.println("conversion of other types to double");
        // conversion of other types to double
        d=(float)c; System.out.println(d);
         
        s=200;
        i=200;
        l=200l;
        f=200f;
        d=200d;
        c=200;
       
        System.out.println("conversion of other types to character");
        // conversion of other types to character
        c=(char)s; System.out.println(c);
        c=(char)i; System.out.println(c);
        c=(char)l; System.out.println(c);
        c=(char)f; System.out.println(c);
        c=(char)d; System.out.println(c);
        c=(char)b; System.out.println(c);
	}
}
